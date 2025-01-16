package com.valtdevelop.wandlangplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.valtdevelop.wandlangplugin.WandFileType;
import com.valtdevelop.wandlangplugin.WandLanguage;
import org.jetbrains.annotations.NotNull;

public class WandFile extends PsiFileBase {
    public WandFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, WandLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return WandFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Wand File";
    }

}
