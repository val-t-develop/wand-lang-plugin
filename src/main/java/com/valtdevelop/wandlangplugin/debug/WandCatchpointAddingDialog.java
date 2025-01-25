package com.valtdevelop.wandlangplugin.debug;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;
import com.valtdevelop.wandlangplugin.debug.impl.WandCatchpointCatchType;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class WandCatchpointAddingDialog extends DialogWrapper {
    private JPanel myPanel;
    private JComboBox myBreakOnComboBox;
    private JTextField myExceptionRegexp;

    @Override
    protected @Nullable JComponent createCenterPanel() {
        return myPanel;
    }

    @Override
    protected void doOKAction() {
        /*if (getCatchpointType().isEmpty()) {
            Messages.showErrorDialog(myPanel, DebuggerBundle.message("catchpoint.type.not.specified"));
            return;
        }*/
        // TODO: validate regexp
        if (getExceptionRegexp().length() == 0) {
            Messages.showErrorDialog(myPanel, DebuggerBundle.message("exception.pattern.not.specified"));
            return;
        }
        super.doOKAction();
    }

    public String getExceptionRegexp() {
        return myExceptionRegexp.getText();
    }

    public WandCatchpointAddingDialog(Project project) {
        super(project, true);
        setTitle(DebuggerBundle.message("exception.adding.title"));
        init();
    }

    public WandCatchpointCatchType getCatchpointType() {
        switch (myBreakOnComboBox.getSelectedIndex()) {
            case 0:
                return WandCatchpointCatchType.Throw;
            case 1:
                return WandCatchpointCatchType.Rethrow;
            case 2:
                return WandCatchpointCatchType.Catch;
            default: // FIXME
                return WandCatchpointCatchType.Throw;
        }
    }
}
