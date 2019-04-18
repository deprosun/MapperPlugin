// This is a generated file. Not intended for manual editing.
package com.deprosun.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static com.deprosun.psi.SimpleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.deprosun.psi.*;

public class MapperMappingImpl extends ASTWrapperPsiElement implements MapperMapping {

  public MapperMappingImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitMapperMapping(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MapperAttribute getMapperAttribute() {
    return findChildByClass(MapperAttribute.class);
  }

  @Override
  @NotNull
  public MapperColumnName getMapperColumnName() {
    return findNotNullChildByClass(MapperColumnName.class);
  }

  @Override
  @NotNull
  public MapperDataType getMapperDataType() {
    return findNotNullChildByClass(MapperDataType.class);
  }

  @Override
  @NotNull
  public MapperMappingPath getMapperMappingPath() {
    return findNotNullChildByClass(MapperMappingPath.class);
  }

  @Override
  @NotNull
  public MapperNullNotnull getMapperNullNotnull() {
    return findNotNullChildByClass(MapperNullNotnull.class);
  }

  @Override
  @Nullable
  public MapperPrecision getMapperPrecision() {
    return findChildByClass(MapperPrecision.class);
  }

  @Override
  @NotNull
  public PsiElement getEqual() {
    return findNotNullChildByType(EQUAL);
  }

}
