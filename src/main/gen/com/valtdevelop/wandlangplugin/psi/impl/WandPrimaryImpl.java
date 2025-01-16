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

public class WandPrimaryImpl extends ASTWrapperPsiElement implements WandPrimary {

  public WandPrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WandVisitor visitor) {
    visitor.visitPrimary(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WandVisitor) accept((WandVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WandArgumentList> getArgumentListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WandArgumentList.class);
  }

  @Override
  @Nullable
  public WandArrayCreationExpression getArrayCreationExpression() {
    return findChildByClass(WandArrayCreationExpression.class);
  }

  @Override
  @Nullable
  public WandClassInstanceCreationExpression getClassInstanceCreationExpression() {
    return findChildByClass(WandClassInstanceCreationExpression.class);
  }

  @Override
  @NotNull
  public List<WandExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WandExpression.class);
  }

  @Override
  @Nullable
  public WandExpressionName getExpressionName() {
    return findChildByClass(WandExpressionName.class);
  }

  @Override
  @Nullable
  public WandLiteral getLiteral() {
    return findChildByClass(WandLiteral.class);
  }

  @Override
  @Nullable
  public WandMethodName getMethodName() {
    return findChildByClass(WandMethodName.class);
  }

}
