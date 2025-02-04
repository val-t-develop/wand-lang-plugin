// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the COPYING file.

package com.valtdevelop.wandlangplugin.debug.impl;

import com.intellij.xdebugger.XSourcePosition;
import com.intellij.xdebugger.evaluation.XDebuggerEvaluator;
import com.valtdevelop.wandlangplugin.debug.StackFrame;
import com.valtdevelop.wandlangplugin.debug.Value;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class Evaluator extends XDebuggerEvaluator {
    private final StackFrame myFrame;
    private final DebugProcess mySession;

    @Override
    public void evaluate(@NotNull String s, @NotNull XEvaluationCallback xEvaluationCallback, @Nullable XSourcePosition xSourcePosition) {
        try {
            var result = mySession.evaluate(s, myFrame.getThreadId(), myFrame.getLevel());
            var value = (String) result.get("value");
            xEvaluationCallback.evaluated(new Value("eval", value, false));
        } catch (GdbMiOperationException e) {
            xEvaluationCallback.errorOccurred(e.getDetails().getAttributes().toString());
        } catch (ClassCastException e) {
            xEvaluationCallback.errorOccurred("Could not evaluate " + s);
        } catch (IOException e) {
            e.printStackTrace();
            xEvaluationCallback.errorOccurred(e.toString());
        } catch (InterruptedException e) {
            // just stop
        }
    }

    public Evaluator(DebugProcess session, StackFrame frame) {
        mySession = session;
        myFrame = frame;
    }
}
