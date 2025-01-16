// This is a generated file. Not intended for manual editing.
package com.valtdevelop.wandlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WandStatementExpression extends PsiElement {

  @Nullable
  WandAssignment getAssignment();

  @Nullable
  WandClassInstanceCreationExpression getClassInstanceCreationExpression();

  @Nullable
  WandMethodInvocation getMethodInvocation();

  @Nullable
  WandPostfixExpression getPostfixExpression();

  @Nullable
  WandPredecrementExpression getPredecrementExpression();

  @Nullable
  WandPreincrementExpression getPreincrementExpression();

}
