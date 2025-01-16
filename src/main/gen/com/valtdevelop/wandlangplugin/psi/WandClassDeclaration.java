// This is a generated file. Not intended for manual editing.
package com.valtdevelop.wandlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WandClassDeclaration extends PsiElement {

  @NotNull
  WandClassBody getClassBody();

  @Nullable
  WandClassModifiers getClassModifiers();

  @Nullable
  WandExtending getExtending();

  @Nullable
  WandInterfaces getInterfaces();

  @NotNull
  PsiElement getIdentifier();

}
