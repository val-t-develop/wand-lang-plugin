package com.valtdevelop.wandlangplugin;

import com.intellij.lexer.FlexAdapter;

public class WandLexerAdapter extends FlexAdapter {
    public WandLexerAdapter() {
        super(new WandLexer(null));
    }
}
