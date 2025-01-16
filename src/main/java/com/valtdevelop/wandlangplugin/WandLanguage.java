package com.valtdevelop.wandlangplugin;

import com.intellij.lang.Language;

public class WandLanguage extends Language {
    public static final WandLanguage INSTANCE = new WandLanguage();

    private WandLanguage() {
        super("Wand");
    }
}
