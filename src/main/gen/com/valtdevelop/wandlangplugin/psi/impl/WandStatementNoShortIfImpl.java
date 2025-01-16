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

public class WandStatementNoShortIfImpl extends ASTWrapperPsiElement implements WandStatementNoShortIf {

  public WandStatementNoShortIfImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WandVisitor visitor) {
    visitor.visitStatementNoShortIf(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WandVisitor) accept((WandVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WandForStatementNoShortIf getForStatementNoShortIf() {
    return findChildByClass(WandForStatementNoShortIf.class);
  }

  @Override
  @Nullable
  public WandIfThenElseStatementNoShortIf getIfThenElseStatementNoShortIf() {
    return findChildByClass(WandIfThenElseStatementNoShortIf.class);
  }

  @Override
  @Nullable
  public WandLabeledStatementNoShortIf getLabeledStatementNoShortIf() {
    return findChildByClass(WandLabeledStatementNoShortIf.class);
  }

  @Override
  @Nullable
  public WandStatementWithoutTrailingSubstatement getStatementWithoutTrailingSubstatement() {
    return findChildByClass(WandStatementWithoutTrailingSubstatement.class);
  }

  @Override
  @Nullable
  public WandWhileStatementNoShortIf getWhileStatementNoShortIf() {
    return findChildByClass(WandWhileStatementNoShortIf.class);
  }

}
