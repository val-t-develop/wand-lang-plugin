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

public class WandStatementImpl extends ASTWrapperPsiElement implements WandStatement {

  public WandStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WandVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WandVisitor) accept((WandVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WandForStatement getForStatement() {
    return findChildByClass(WandForStatement.class);
  }

  @Override
  @Nullable
  public WandIfThenElseStatement getIfThenElseStatement() {
    return findChildByClass(WandIfThenElseStatement.class);
  }

  @Override
  @Nullable
  public WandIfThenStatement getIfThenStatement() {
    return findChildByClass(WandIfThenStatement.class);
  }

  @Override
  @Nullable
  public WandLabeledStatement getLabeledStatement() {
    return findChildByClass(WandLabeledStatement.class);
  }

  @Override
  @Nullable
  public WandStatementWithoutTrailingSubstatement getStatementWithoutTrailingSubstatement() {
    return findChildByClass(WandStatementWithoutTrailingSubstatement.class);
  }

  @Override
  @Nullable
  public WandWhileStatement getWhileStatement() {
    return findChildByClass(WandWhileStatement.class);
  }

}
