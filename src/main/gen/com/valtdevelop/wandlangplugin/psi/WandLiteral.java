// This is a generated file. Not intended for manual editing.
package com.valtdevelop.wandlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WandLiteral extends PsiElement {

  @Nullable
  WandBooleanLiteral getBooleanLiteral();

  @Nullable
  WandFloatingPointLiteral getFloatingPointLiteral();

  @Nullable
  WandIntegerLiteral getIntegerLiteral();

  @Nullable
  WandNullLiteral getNullLiteral();

  @Nullable
  PsiElement getCharLiteral();

  @Nullable
  PsiElement getStringLiteral();

}
