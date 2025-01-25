package com.valtdevelop.wandlangplugin.debug;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.application.WriteAction;
import com.intellij.openapi.project.Project;
import com.intellij.xdebugger.XDebuggerManager;
import com.intellij.xdebugger.breakpoints.XBreakpoint;
import com.intellij.xdebugger.breakpoints.XBreakpointType;
import com.intellij.xdebugger.breakpoints.ui.XBreakpointCustomPropertiesPanel;
import com.intellij.xdebugger.evaluation.XDebuggerEditorsProvider;
import com.valtdevelop.wandlangplugin.debug.impl.WandCatchpointCatchType;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class WandCatchpointType extends XBreakpointType<XBreakpoint<WandCatchpointProperties>, WandCatchpointProperties> {
    private static final String ANY_EXCEPTION = ".*";
    protected WandCatchpointType() {
        super("native2-wand-catchpoint", "Wand Exception Breakpoints");
    }

    protected WandCatchpointType(@NonNls @NotNull String id, @Nls @NotNull String title, boolean suspendThreadSupported) {
        super(id, title, suspendThreadSupported);
    }

    @Override
    public @Nls String getDisplayText(XBreakpoint<WandCatchpointProperties> breakpoint) {
        var properties = breakpoint.getProperties();
        if (properties != null) {
            var subject = (ANY_EXCEPTION.equals(properties.myExceptionRegexp)) ? DebuggerBundle.message("debugger.exception.breakpoint.any.exception") : properties.myExceptionRegexp;
            return switch (properties.myCatchType) {
                case Throw -> "Throw for " + subject; // TODO: i18n
                case Rethrow -> "Rethrow for " + subject;
                case Catch -> "Catch handler for " + subject;
            };
        } else {
            return "?";
        }
    }

    @NotNull
    @Override
    public Icon getEnabledIcon() {
        return AllIcons.Debugger.Db_exception_breakpoint;
    }

    @NotNull
    @Override
    public Icon getDisabledIcon() {
        return AllIcons.Debugger.Db_disabled_exception_breakpoint;
    }

    @Override
    public WandCatchpointProperties createProperties() {
        return new WandCatchpointProperties(WandCatchpointCatchType.Throw, ANY_EXCEPTION);
    }

    @Override
    public boolean isAddBreakpointButtonVisible() {
        return true;
    }

    @Override
    public XBreakpoint<WandCatchpointProperties> addBreakpoint(final Project project, JComponent parentComponent) {
        final var dialog = new WandCatchpointAddingDialog(project);
        if (!dialog.showAndGet()) {
            return null;
        }

        return WriteAction.compute(() -> XDebuggerManager.getInstance(project).getBreakpointManager()
                .addBreakpoint(this, new WandCatchpointProperties(dialog.getCatchpointType(), dialog.getExceptionRegexp())));
    }

//    @Override
//    public String getBreakpointsDialogHelpTopic() {
//        return "reference.dialogs.breakpoints";
//    }

    @Nullable
    @Override
    public XDebuggerEditorsProvider getEditorsProvider(@NotNull XBreakpoint<WandCatchpointProperties> breakpoint,
                                                       @NotNull Project project) {
        return null; // TODO: DebuggerEditorsProvider();
    }

    private static WandCatchpointProperties createDefaultBreakpointProperties() {
        var p = new WandCatchpointProperties(WandCatchpointCatchType.Throw, ANY_EXCEPTION);
        return p;
    }

    @Override
    public XBreakpoint<WandCatchpointProperties> createDefaultBreakpoint(@NotNull XBreakpointCreator<WandCatchpointProperties> creator) {
        final XBreakpoint<WandCatchpointProperties> breakpoint = creator.createBreakpoint(createDefaultBreakpointProperties());
        breakpoint.setEnabled(true);
        return breakpoint;
    }


    @Override
    public XBreakpointCustomPropertiesPanel<XBreakpoint<WandCatchpointProperties>> createCustomPropertiesPanel(@NotNull Project project
    ) {
        return null;
    }
}
