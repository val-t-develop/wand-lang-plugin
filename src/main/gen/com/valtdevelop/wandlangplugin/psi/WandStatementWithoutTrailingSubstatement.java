// This is a generated file. Not intended for manual editing.
package com.valtdevelop.wandlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WandStatementWithoutTrailingSubstatement extends PsiElement {

  @Nullable
  WandBlock getBlock();

  @Nullable
  WandBreakStatement getBreakStatement();

  @Nullable
  WandContinueStatement getContinueStatement();

  @Nullable
  WandDoStatement getDoStatement();

  @Nullable
  WandExpressionStatement getExpressionStatement();

  @Nullable
  WandReturnStatement getReturnStatement();

  @Nullable
  WandSwitchStatement getSwitchStatement();

  @Nullable
  WandSynchronizedStatement getSynchronizedStatement();

  @Nullable
  WandThrowsStatement getThrowsStatement();

  @Nullable
  WandTryStatement getTryStatement();

}
