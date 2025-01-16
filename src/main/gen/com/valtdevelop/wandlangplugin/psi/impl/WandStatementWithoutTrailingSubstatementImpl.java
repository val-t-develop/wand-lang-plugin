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

public class WandStatementWithoutTrailingSubstatementImpl extends ASTWrapperPsiElement implements WandStatementWithoutTrailingSubstatement {

  public WandStatementWithoutTrailingSubstatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WandVisitor visitor) {
    visitor.visitStatementWithoutTrailingSubstatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WandVisitor) accept((WandVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WandBlock getBlock() {
    return findChildByClass(WandBlock.class);
  }

  @Override
  @Nullable
  public WandBreakStatement getBreakStatement() {
    return findChildByClass(WandBreakStatement.class);
  }

  @Override
  @Nullable
  public WandContinueStatement getContinueStatement() {
    return findChildByClass(WandContinueStatement.class);
  }

  @Override
  @Nullable
  public WandDoStatement getDoStatement() {
    return findChildByClass(WandDoStatement.class);
  }

  @Override
  @Nullable
  public WandExpressionStatement getExpressionStatement() {
    return findChildByClass(WandExpressionStatement.class);
  }

  @Override
  @Nullable
  public WandReturnStatement getReturnStatement() {
    return findChildByClass(WandReturnStatement.class);
  }

  @Override
  @Nullable
  public WandSwitchStatement getSwitchStatement() {
    return findChildByClass(WandSwitchStatement.class);
  }

  @Override
  @Nullable
  public WandSynchronizedStatement getSynchronizedStatement() {
    return findChildByClass(WandSynchronizedStatement.class);
  }

  @Override
  @Nullable
  public WandThrowsStatement getThrowsStatement() {
    return findChildByClass(WandThrowsStatement.class);
  }

  @Override
  @Nullable
  public WandTryStatement getTryStatement() {
    return findChildByClass(WandTryStatement.class);
  }

}
