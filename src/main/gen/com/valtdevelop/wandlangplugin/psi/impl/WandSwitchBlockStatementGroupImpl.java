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

public class WandSwitchBlockStatementGroupImpl extends ASTWrapperPsiElement implements WandSwitchBlockStatementGroup {

  public WandSwitchBlockStatementGroupImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WandVisitor visitor) {
    visitor.visitSwitchBlockStatementGroup(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WandVisitor) accept((WandVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public WandBlockStatements getBlockStatements() {
    return findNotNullChildByClass(WandBlockStatements.class);
  }

  @Override
  @NotNull
  public WandSwitchLabels getSwitchLabels() {
    return findNotNullChildByClass(WandSwitchLabels.class);
  }

}
