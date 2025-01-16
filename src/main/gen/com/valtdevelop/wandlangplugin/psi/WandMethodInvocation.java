// This is a generated file. Not intended for manual editing.
package com.valtdevelop.wandlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WandMethodInvocation extends PsiElement {

  @Nullable
  WandArgumentList getArgumentList();

  @Nullable
  WandMethodName getMethodName();

  @Nullable
  WandPrimary getPrimary();

  @Nullable
  PsiElement getIdentifier();

}
