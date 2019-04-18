// This is a generated file. Not intended for manual editing.
package com.deprosun.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Mapper extends PsiElement {

  @NotNull
  List<Mapper> getMapperList();

  @Nullable
  MapperFromField getMapperFromField();

  @NotNull
  MapperMappings getMapperMappings();

  @NotNull
  MapperTableName getMapperTableName();

  @Nullable
  PsiElement getFromWord();

  @NotNull
  PsiElement getSourceWord();

}
