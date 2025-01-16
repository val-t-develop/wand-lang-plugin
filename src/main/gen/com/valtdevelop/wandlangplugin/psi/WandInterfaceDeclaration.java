// This is a generated file. Not intended for manual editing.
package com.valtdevelop.wandlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WandInterfaceDeclaration extends PsiElement {

  @Nullable
  WandExtendsInterfaces getExtendsInterfaces();

  @NotNull
  WandInterfaceBody getInterfaceBody();

  @Nullable
  WandInterfaceModifiers getInterfaceModifiers();

  @NotNull
  PsiElement getIdentifier();

}
