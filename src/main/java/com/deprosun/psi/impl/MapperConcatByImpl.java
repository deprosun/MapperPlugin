// This is a generated file. Not intended for manual editing.
package com.deprosun.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static com.deprosun.psi.SimpleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.deprosun.psi.*;

public class MapperConcatByImpl extends ASTWrapperPsiElement implements MapperConcatBy {

  public MapperConcatByImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitMapperConcatBy(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MapperSeparator getMapperSeparator() {
    return findNotNullChildByClass(MapperSeparator.class);
  }

  @Override
  @NotNull
  public PsiElement getConcatByWord() {
    return findNotNullChildByType(CONCAT_BY_WORD);
  }

}
