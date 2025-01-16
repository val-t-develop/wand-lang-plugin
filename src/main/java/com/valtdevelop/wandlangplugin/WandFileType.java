package com.valtdevelop.wandlangplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class WandFileType extends LanguageFileType {

    public static final WandFileType INSTANCE = new WandFileType();

    private WandFileType() {
        super(WandLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Wand File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Wand language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "wand";
    }

    @Override
    public Icon getIcon() {
        return WandIcon.FILE;
    }

}