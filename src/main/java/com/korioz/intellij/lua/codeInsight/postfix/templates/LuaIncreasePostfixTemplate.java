/*
 * Copyright (c) 2022. Korioz(45950144+Korioz@users.noreply.github.com)
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

package com.korioz.intellij.lua.codeInsight.postfix.templates;

import com.intellij.codeInsight.template.Template;
import com.intellij.codeInsight.template.impl.TextExpression;
import com.intellij.codeInsight.template.postfix.templates.StringBasedPostfixTemplate;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.korioz.intellij.lua.codeInsight.postfix.LuaPostfixUtils.selectorTopmost;

/**
 *
 * Created by Korioz on 2017/2/7.
 */
public class LuaIncreasePostfixTemplate extends StringBasedPostfixTemplate {
    public LuaIncreasePostfixTemplate() {
        super("increase", "expr = expr + value", selectorTopmost());
    }

    @Nullable
    @Override
    public String getTemplateString(@NotNull PsiElement psiElement) {
        return "$expr$ = $expr$ + $value$";
    }

    @Override
    protected PsiElement getElementToRemove(PsiElement expr) {
        return expr;
    }

    @Override
    public void setVariables(@NotNull Template template, @NotNull PsiElement element) {
        super.setVariables(template, element);
        template.addVariable("value", new TextExpression("1"), true);
    }
}