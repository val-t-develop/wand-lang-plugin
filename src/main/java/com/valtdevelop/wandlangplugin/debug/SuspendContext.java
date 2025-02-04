// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the COPYING file.

package com.valtdevelop.wandlangplugin.debug;

import com.intellij.xdebugger.frame.XExecutionStack;
import com.intellij.xdebugger.frame.XSuspendContext;
import com.valtdevelop.wandlangplugin.debug.impl.DebugProcess;
import org.jetbrains.annotations.NotNull;

public class SuspendContext extends XSuspendContext {
    private final DebugProcess myDebuggerSession;
    private final ExecutionStack[] myExecutionStacks;
    private final int myActiveStackId;

    public SuspendContext(DebugProcess debuggerSession, ExecutionStack[] executionStacks, int activeStackId) {
        myDebuggerSession = debuggerSession;
        myExecutionStacks = executionStacks;
        myActiveStackId = activeStackId;
    }

    @Override
    public XExecutionStack getActiveExecutionStack() {
        if (myActiveStackId >= 0 && myActiveStackId < myExecutionStacks.length) {
            return myExecutionStacks[myActiveStackId];
        } else {
            return null;
        }
    }

    @Override
    public XExecutionStack @NotNull [] getExecutionStacks() {
        // TODO: print execution stacks of all threads
        return myExecutionStacks;
    }
}
