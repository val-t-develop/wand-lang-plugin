package com.valtdevelop.wandlangplugin.debug;

import com.intellij.openapi.actionSystem.ActionUpdateThread;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.xdebugger.XDebugProcess;
import com.intellij.xdebugger.XDebugSession;
import com.intellij.xdebugger.impl.DebuggerSupport;
import com.intellij.xdebugger.impl.actions.DebuggerActionHandler;
import com.intellij.xdebugger.impl.actions.XDebuggerActionBase;
import com.intellij.xdebugger.impl.actions.XDebuggerSuspendedActionHandler;
import com.valtdevelop.wandlangplugin.debug.impl.DebugProcess;
import com.valtdevelop.wandlangplugin.debug.impl.GdbMiOperationException;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/// Action that maps to immediate return
public class ReverseStepOutAction extends XDebuggerActionBase {
    private final XDebuggerSuspendedActionHandler myHandler;
    @Override
    protected @NotNull DebuggerActionHandler getHandler(@NotNull DebuggerSupport debuggerSupport) {
        return myHandler;
    }
    @Override
    public @NotNull ActionUpdateThread getActionUpdateThread() {
        return ActionUpdateThread.BGT;
    }
    public ReverseStepOutAction() {
        myHandler = new XDebuggerSuspendedActionHandler() {
            @Override
            protected void perform(@NotNull XDebugSession session, DataContext dataContext) {
                final XDebugProcess debugProcess = session.getDebugProcess();
                if (debugProcess instanceof DebugProcess) {
                    var process = (DebugProcess) debugProcess;
                    try {
                        process.finish(true);
                    } catch (GdbMiOperationException | IOException e) {
                        throw new RuntimeException(e); // FIXME dialog box?
                    } catch (InterruptedException e) {
                        // pucgenie: Most probably interrupted by the IDE.
                        e.printStackTrace();
                        //throw new RuntimeException(e);
                    }
                }
            }

            @Override
            protected boolean isEnabled(@NotNull XDebugSession session, DataContext dataContext) {
                final XDebugProcess debugProcess = session.getDebugProcess();
                if (debugProcess instanceof DebugProcess) {
                    var process = (DebugProcess) debugProcess;
                    if (!process.hasRecording()) {
                        return false;
                    }
                }
                return super.isEnabled(session, dataContext);
            }
        };

    }
}
