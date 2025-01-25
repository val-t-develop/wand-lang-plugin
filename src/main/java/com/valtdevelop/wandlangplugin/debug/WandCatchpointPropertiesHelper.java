package com.valtdevelop.wandlangplugin.debug;// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

import com.intellij.util.xmlb.annotations.Attribute;
import com.intellij.xdebugger.breakpoints.XBreakpointProperties;
import com.valtdevelop.wandlangplugin.debug.impl.WandCatchpointCatchType;

public abstract class WandCatchpointPropertiesHelper<T> extends XBreakpointProperties<T> {
    @Attribute("catchType")
    public WandCatchpointCatchType myCatchType;

    @Attribute("exception")
    public String myExceptionRegexp;


    /** exception class name. FIXME: use regexp instead */
    //@NlsSafe
    //public String getException() {
//        return myExceptionRegexp;
//    }

}
