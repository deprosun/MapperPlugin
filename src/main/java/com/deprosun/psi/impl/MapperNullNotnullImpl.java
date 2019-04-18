// This is a generated file. Not intended for manual editing.
package com.deprosun.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.deprosun.psi.*;

public class MapperNullNotnullImpl extends ASTWrapperPsiElement implements MapperNullNotnull {

  public MapperNullNotnullImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitMapperNullNotnull(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MapperNotNull getMapperNotNull() {
    return findChildByClass(MapperNotNull.class);
  }

  @Override
  @Nullable
  public MapperNull getMapperNull() {
    return findChildByClass(MapperNull.class);
  }

}
