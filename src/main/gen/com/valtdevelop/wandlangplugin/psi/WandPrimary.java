// This is a generated file. Not intended for manual editing.
package com.valtdevelop.wandlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WandPrimary extends PsiElement {

  @NotNull
  List<WandArgumentList> getArgumentListList();

  @Nullable
  WandArrayCreationExpression getArrayCreationExpression();

  @Nullable
  WandClassInstanceCreationExpression getClassInstanceCreationExpression();

  @NotNull
  List<WandExpression> getExpressionList();

  @Nullable
  WandExpressionName getExpressionName();

  @Nullable
  WandLiteral getLiteral();

  @Nullable
  WandMethodName getMethodName();

}
