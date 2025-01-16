// This is a generated file. Not intended for manual editing.
package com.valtdevelop.wandlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WandConditionalExpression extends PsiElement {

  @Nullable
  WandConditionalExpression getConditionalExpression();

  @NotNull
  WandConditionalOrExpression getConditionalOrExpression();

  @Nullable
  WandExpression getExpression();

}
