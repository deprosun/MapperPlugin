// This is a generated file. Not intended for manual editing.
package com.deprosun.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static com.deprosun.psi.SimpleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.deprosun.psi.*;

public class MapperNotNullImpl extends ASTWrapperPsiElement implements MapperNotNull {

  public MapperNotNullImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitMapperNotNull(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getNot() {
    return findNotNullChildByType(NOT);
  }

  @Override
  @NotNull
  public PsiElement getNull() {
    return findNotNullChildByType(NULL);
  }

}
