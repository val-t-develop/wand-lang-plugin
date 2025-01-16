// This is a generated file. Not intended for manual editing.
package com.valtdevelop.wandlangplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.valtdevelop.wandlangplugin.psi.WandTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.valtdevelop.wandlangplugin.psi.*;

public class WandStatementExpressionImpl extends ASTWrapperPsiElement implements WandStatementExpression {

  public WandStatementExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WandVisitor visitor) {
    visitor.visitStatementExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WandVisitor) accept((WandVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WandAssignment getAssignment() {
    return findChildByClass(WandAssignment.class);
  }

  @Override
  @Nullable
  public WandClassInstanceCreationExpression getClassInstanceCreationExpression() {
    return findChildByClass(WandClassInstanceCreationExpression.class);
  }

  @Override
  @Nullable
  public WandMethodInvocation getMethodInvocation() {
    return findChildByClass(WandMethodInvocation.class);
  }

  @Override
  @Nullable
  public WandPostfixExpression getPostfixExpression() {
    return findChildByClass(WandPostfixExpression.class);
  }

  @Override
  @Nullable
  public WandPredecrementExpression getPredecrementExpression() {
    return findChildByClass(WandPredecrementExpression.class);
  }

  @Override
  @Nullable
  public WandPreincrementExpression getPreincrementExpression() {
    return findChildByClass(WandPreincrementExpression.class);
  }

}
