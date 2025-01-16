// This is a generated file. Not intended for manual editing.
package com.valtdevelop.wandlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WandAbstractMethodDeclaration extends PsiElement {

  @Nullable
  WandAbstractMethodModifiers getAbstractMethodModifiers();

  @NotNull
  WandMethodDeclarator getMethodDeclarator();

  @NotNull
  WandResultType getResultType();

  @Nullable
  WandThrowsList getThrowsList();

}
