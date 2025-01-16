// This is a generated file. Not intended for manual editing.
package com.valtdevelop.wandlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WandMethodHeader extends PsiElement {

  @NotNull
  WandMethodDeclarator getMethodDeclarator();

  @Nullable
  WandMethodModifiers getMethodModifiers();

  @NotNull
  WandResultType getResultType();

  @Nullable
  WandThrowsList getThrowsList();

}
