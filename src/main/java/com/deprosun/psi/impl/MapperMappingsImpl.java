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

public class MapperMappingsImpl extends ASTWrapperPsiElement implements MapperMappings {

  public MapperMappingsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitMapperMappings(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MapperMapping> getMapperMappingList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapperMapping.class);
  }

  @Override
  @NotNull
  public PsiElement getMappingWord() {
    return findNotNullChildByType(MAPPING_WORD);
  }

}
