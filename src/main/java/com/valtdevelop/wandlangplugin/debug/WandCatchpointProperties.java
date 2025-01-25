package com.valtdevelop.wandlangplugin.debug;

import com.valtdevelop.wandlangplugin.debug.impl.WandCatchpointCatchType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WandCatchpointProperties extends WandCatchpointPropertiesHelper<WandCatchpointProperties> {
    public WandCatchpointProperties(WandCatchpointCatchType catchType, String regexp)  {
        myCatchType = catchType;
        myExceptionRegexp = regexp;
    }
    public WandCatchpointProperties() { // for serialization
    }

    @Override
    public @Nullable WandCatchpointProperties getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull WandCatchpointProperties state) {
        myCatchType = state.myCatchType;
        myExceptionRegexp = state.myExceptionRegexp;
    }

    @Override
    public void noStateLoaded() {
        super.noStateLoaded();
    }

    @Override
    public void initializeComponent() {
        super.initializeComponent();
    }
}
