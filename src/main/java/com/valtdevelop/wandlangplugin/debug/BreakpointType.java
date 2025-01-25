// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the COPYING file.
package com.valtdevelop.wandlangplugin.debug;

import com.intellij.openapi.editor.Document;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDocumentManager;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.xdebugger.XSourcePosition;
import com.intellij.xdebugger.breakpoints.XLineBreakpoint;
import com.intellij.xdebugger.breakpoints.XLineBreakpointType;
import com.intellij.xdebugger.breakpoints.ui.XBreakpointCustomPropertiesPanel;
import com.intellij.xdebugger.evaluation.XDebuggerEditorsProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BreakpointType extends XLineBreakpointType<BreakpointProperties> {
    private final EditorsProvider myMyEditorsProvider1 = new EditorsProvider();

    public BreakpointType() {
        super("native2-breakpoint", DebuggerBundle.message("title.native2.breakpoints"));
        // TODO: Bundle.message("debugger.line.breakpoint.type"), new PyDebuggerEditorsProvider()
    }

    @Override
    public boolean canPutAt(@NotNull VirtualFile file, int line, @NotNull Project project) {
        final Document document = FileDocumentManager.getInstance().getDocument(file);
        if (document == null) return false;

        final PsiFile psiFile = PsiDocumentManager.getInstance(project).getPsiFile(document);
        if (psiFile == null) {
            return false;
        }
        final FileType fileType = psiFile.getFileType();
        String fileTypeName = fileType.getName();
        String defaultExtension = psiFile.getFileType().getDefaultExtension();
        // TODO: Objective-C
        return true;
    }

    @Override
    public XDebuggerEditorsProvider getEditorsProvider(@NotNull XLineBreakpoint<BreakpointProperties> breakpoint, @NotNull Project project) {
        final XSourcePosition position = breakpoint.getSourcePosition();
        if (position == null) {
            return null;
        }

        final PsiFile file = PsiManager.getInstance(project).findFile(position.getFile());
        if (file == null) {
            return null;
        }

        return myMyEditorsProvider1;
    }

    @Override
    public BreakpointProperties createBreakpointProperties(@NotNull VirtualFile file, int line) {
        return new BreakpointProperties();
    }

    @Override
    public @Nullable BreakpointProperties createProperties() {
        return new BreakpointProperties();
    }

    @Override
    public @Nullable XBreakpointCustomPropertiesPanel<XLineBreakpoint<BreakpointProperties>> createCustomPropertiesPanel(@NotNull Project project) {
        return new BreakpointPropertiesPanel();
    }
}
