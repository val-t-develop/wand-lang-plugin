// This is a generated file. Not intended for manual editing.
package com.valtdevelop.wandlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WandConstructorDeclaration extends PsiElement {

  @NotNull
  WandConstructorBody getConstructorBody();

  @NotNull
  WandConstructorDeclarator getConstructorDeclarator();

  @Nullable
  WandConstructorModifiers getConstructorModifiers();

  @Nullable
  WandThrowsList getThrowsList();

}
