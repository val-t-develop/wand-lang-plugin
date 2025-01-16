package com.valtdevelop.wandlangplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.valtdevelop.wandlangplugin.WandLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class WandElementType extends IElementType {

    public WandElementType(@NotNull @NonNls String debugName) {
        super(debugName, WandLanguage.INSTANCE);
    }

}