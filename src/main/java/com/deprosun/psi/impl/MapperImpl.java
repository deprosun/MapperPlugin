// This is a generated file. Not intended for manual editing.
package com.deprosun.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.deprosun.psi.SimpleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.deprosun.psi.*;

public class MapperImpl extends ASTWrapperPsiElement implements Mapper {

  public MapperImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitMapper(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Mapper> getMapperList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Mapper.class);
  }

  @Override
  @Nullable
  public MapperFromField getMapperFromField() {
    return findChildByClass(MapperFromField.class);
  }

  @Override
  @NotNull
  public MapperMappings getMapperMappings() {
    return findNotNullChildByClass(MapperMappings.class);
  }

  @Override
  @NotNull
  public MapperTableName getMapperTableName() {
    return findNotNullChildByClass(MapperTableName.class);
  }

  @Override
  @Nullable
  public PsiElement getFromWord() {
    return findChildByType(FROM_WORD);
  }

  @Override
  @NotNull
  public PsiElement getSourceWord() {
    return findNotNullChildByType(SOURCE_WORD);
  }
}
