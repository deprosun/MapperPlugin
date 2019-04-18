// This is a generated file. Not intended for manual editing.
package com.deprosun.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.deprosun.psi.*;

public class MapperMappingPathImpl extends ASTWrapperPsiElement implements MapperMappingPath {

  public MapperMappingPathImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitMapperMappingPath(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MapperFirstFieldName getMapperFirstFieldName() {
    return findNotNullChildByClass(MapperFirstFieldName.class);
  }

  @Override
  @NotNull
  public List<MapperMiddleFieldName> getMapperMiddleFieldNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapperMiddleFieldName.class);
  }

}
