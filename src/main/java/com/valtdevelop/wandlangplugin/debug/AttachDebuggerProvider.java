// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the COPYING file.

package com.valtdevelop.wandlangplugin.debug;

import com.intellij.execution.process.ProcessInfo;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.UserDataHolder;
import com.intellij.xdebugger.attach.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class AttachDebuggerProvider implements XAttachDebuggerProvider {
    @Override
    public boolean isAttachHostApplicable(@NotNull XAttachHost xAttachHost) {
        return xAttachHost instanceof LocalAttachHost || xAttachHost instanceof AttachHost;
    }

    @Override
    public @NotNull List<XAttachDebugger> getAvailableDebuggers(@NotNull Project project, @NotNull XAttachHost xAttachHost, @NotNull ProcessInfo processInfo, @NotNull UserDataHolder userDataHolder) {
        var result = new ArrayList<XAttachDebugger>();
//        if (processInfo.getExecutableCannonicalPath().isPresent() &&
//                new File(processInfo.getExecutableCannonicalPath().get()).exists()) {
            result.add(new AttachDebugger(project, xAttachHost, processInfo, userDataHolder));
//        }

        return result;
    }

    private static final AttachDebuggerAttachGroup ourAttachGroup = new AttachDebuggerAttachGroup();

    @Override
    public @NotNull XAttachPresentationGroup<ProcessInfo> getPresentationGroup() {
        return ourAttachGroup;
    }
}
