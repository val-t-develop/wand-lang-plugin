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

public class WandLiteralImpl extends ASTWrapperPsiElement implements WandLiteral {

  public WandLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WandVisitor visitor) {
    visitor.visitLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WandVisitor) accept((WandVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WandBooleanLiteral getBooleanLiteral() {
    return findChildByClass(WandBooleanLiteral.class);
  }

  @Override
  @Nullable
  public WandFloatingPointLiteral getFloatingPointLiteral() {
    return findChildByClass(WandFloatingPointLiteral.class);
  }

  @Override
  @Nullable
  public WandIntegerLiteral getIntegerLiteral() {
    return findChildByClass(WandIntegerLiteral.class);
  }

  @Override
  @Nullable
  public WandNullLiteral getNullLiteral() {
    return findChildByClass(WandNullLiteral.class);
  }

  @Override
  @Nullable
  public PsiElement getCharLiteral() {
    return findChildByType(CHAR_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getStringLiteral() {
    return findChildByType(STRING_LITERAL);
  }

}
