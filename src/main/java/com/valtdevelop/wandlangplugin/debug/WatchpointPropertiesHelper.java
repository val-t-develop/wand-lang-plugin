package com.valtdevelop.wandlangplugin.debug;// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

import com.intellij.util.xmlb.annotations.Attribute;
import com.intellij.xdebugger.breakpoints.XBreakpointProperties;

public abstract class WatchpointPropertiesHelper<T> extends XBreakpointProperties<T> {
    @Attribute("expression")
    public String myExpression;

    @Attribute("reads")
    public boolean myWatchReads;

    @Attribute("writes")
    public boolean myWatchWrites;
}
