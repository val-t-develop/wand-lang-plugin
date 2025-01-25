package com.valtdevelop.wandlangplugin.debug;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class TestConfiguration extends Configuration {
    protected TestConfiguration(@NotNull Project project, @NotNull ConfigurationFactory factory) {
        super(project, factory);
    }
}
