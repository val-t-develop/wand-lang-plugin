// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.valtdevelop.wandlangplugin.debug;

import com.intellij.openapi.util.IconLoader;
import com.valtdevelop.wandlangplugin.WandIcon;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class WandDebuggerIcons {
  private static @NotNull Icon load(@NotNull String path, int cacheKey, int flags) {
    return IconLoader.getIcon("/icons/wand_icon.svg", WandIcon.class);
  }
}
