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

public class WandConstantDeclarationImpl extends ASTWrapperPsiElement implements WandConstantDeclaration {

  public WandConstantDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WandVisitor visitor) {
    visitor.visitConstantDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WandVisitor) accept((WandVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public WandConstantModifiers getConstantModifiers() {
    return findNotNullChildByClass(WandConstantModifiers.class);
  }

  @Override
  @NotNull
  public WandType getType() {
    return findNotNullChildByClass(WandType.class);
  }

  @Override
  @NotNull
  public WandVariableDeclarator getVariableDeclarator() {
    return findNotNullChildByClass(WandVariableDeclarator.class);
  }

}
