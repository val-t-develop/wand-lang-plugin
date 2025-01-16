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

public class WandTypeImpl extends ASTWrapperPsiElement implements WandType {

  public WandTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WandVisitor visitor) {
    visitor.visitType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WandVisitor) accept((WandVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WandPrimitiveType getPrimitiveType() {
    return findChildByClass(WandPrimitiveType.class);
  }

  @Override
  @Nullable
  public WandReferenceType getReferenceType() {
    return findChildByClass(WandReferenceType.class);
  }

}
