// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.korioz.intellij.lua.psi.LuaTypes.*;
import com.korioz.intellij.lua.stubs.LuaPlaceholderStub;
import com.korioz.intellij.lua.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

public class LuaDoStatImpl extends LuaStatMixin<LuaPlaceholderStub> implements LuaDoStat {

  public LuaDoStatImpl(@NotNull LuaPlaceholderStub stub, @NotNull IStubElementType<?, ?> type) {
    super(stub, type);
  }

  public LuaDoStatImpl(@NotNull ASTNode node) {
    super(node);
  }

  public LuaDoStatImpl(@NotNull LuaPlaceholderStub stub, @NotNull IElementType type, @NotNull ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull LuaVisitor visitor) {
    visitor.visitDoStat(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaVisitor) accept((LuaVisitor)visitor);
    else super.accept(visitor);
  }

}