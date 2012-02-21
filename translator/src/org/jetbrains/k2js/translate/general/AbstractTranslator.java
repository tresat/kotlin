/*
 * Copyright 2000-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.k2js.translate.general;

import com.google.dart.compiler.backend.js.ast.JsProgram;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.k2js.translate.context.Aliaser;
import org.jetbrains.k2js.translate.context.TranslationContext;

/**
 * @author Pavel Talanov
 */
//TODO: provide helper methods for different parts of context
public abstract class AbstractTranslator {

    @NotNull
    private final TranslationContext context;

    protected AbstractTranslator(@NotNull TranslationContext context) {
        this.context = context;
    }

    @NotNull
    protected JsProgram program() {
        return context.program();
    }

    @NotNull
    protected TranslationContext context() {
        return context;
    }

    @NotNull
    protected Aliaser aliaser() {
        return context.aliaser();
    }
}
