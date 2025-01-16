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

public class WandForStatementNoShortIfImpl extends ASTWrapperPsiElement implements WandForStatementNoShortIf {

  public WandForStatementNoShortIfImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WandVisitor visitor) {
    visitor.visitForStatementNoShortIf(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WandVisitor) accept((WandVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WandExpression getExpression() {
    return findChildByClass(WandExpression.class);
  }

  @Override
  @Nullable
  public WandForInit getForInit() {
    return findChildByClass(WandForInit.class);
  }

  @Override
  @Nullable
  public WandForUpdate getForUpdate() {
    return findChildByClass(WandForUpdate.class);
  }

  @Override
  @NotNull
  public WandStatementNoShortIf getStatementNoShortIf() {
    return findNotNullChildByClass(WandStatementNoShortIf.class);
  }

}
