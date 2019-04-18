// This is a generated file. Not intended for manual editing.
package com.deprosun.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.deprosun.psi.*;

public class MapperAttributeImpl extends ASTWrapperPsiElement implements MapperAttribute {

  public MapperAttributeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitMapperAttribute(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MapperConcatBy getMapperConcatBy() {
    return findChildByClass(MapperConcatBy.class);
  }

  @Override
  @Nullable
  public MapperPkFk getMapperPkFk() {
    return findChildByClass(MapperPkFk.class);
  }

  @Override
  @Nullable
  public MapperReference getMapperReference() {
    return findChildByClass(MapperReference.class);
  }

  @Override
  @Nullable
  public MapperReferenceType getMapperReferenceType() {
    return findChildByClass(MapperReferenceType.class);
  }

}
