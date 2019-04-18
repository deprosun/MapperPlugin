// This is a generated file. Not intended for manual editing.
package com.deprosun.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static com.deprosun.psi.SimpleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.deprosun.psi.*;

public class MapperPkFkImpl extends ASTWrapperPsiElement implements MapperPkFk {

  public MapperPkFkImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitMapperPkFk(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getFk() {
    return findChildByType(FK);
  }

  @Override
  @Nullable
  public PsiElement getPk() {
    return findChildByType(PK);
  }

}
