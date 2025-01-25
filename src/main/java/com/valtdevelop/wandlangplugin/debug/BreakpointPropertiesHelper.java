package com.valtdevelop.wandlangplugin.debug;

import com.intellij.util.xmlb.annotations.Attribute;
import com.intellij.xdebugger.breakpoints.XBreakpointProperties;

public abstract class BreakpointPropertiesHelper<T> extends XBreakpointProperties<T> {
    @Attribute("hardware")
    public boolean myHardware;

    @Attribute("force")
    public boolean myForce;
}
