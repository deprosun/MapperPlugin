// This is a generated file. Not intended for manual editing.
package com.deprosun.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.deprosun.psi.*;

public class MapperPrecisionImpl extends ASTWrapperPsiElement implements MapperPrecision {

  public MapperPrecisionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitMapperPrecision(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MapperPrecisionNumWord> getMapperPrecisionNumWordList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MapperPrecisionNumWord.class);
  }

}
