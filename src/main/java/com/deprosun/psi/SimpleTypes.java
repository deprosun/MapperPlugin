// This is a generated file. Not intended for manual editing.
package com.deprosun.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.deprosun.psi.impl.*;

public interface SimpleTypes {

  IElementType MAPPER = new MapperElementType("MAPPER");
  IElementType MAPPER_ATTRIBUTE = new MapperElementType("MAPPER_ATTRIBUTE");
  IElementType MAPPER_COLUMN_NAME = new MapperElementType("MAPPER_COLUMN_NAME");
  IElementType MAPPER_CONCAT_BY = new MapperElementType("MAPPER_CONCAT_BY");
  IElementType MAPPER_DATA_TYPE = new MapperElementType("MAPPER_DATA_TYPE");
  IElementType MAPPER_FHIR_RESOURCE = new MapperElementType("MAPPER_FHIR_RESOURCE");
  IElementType MAPPER_FIRST_FIELD_NAME = new MapperElementType("MAPPER_FIRST_FIELD_NAME");
  IElementType MAPPER_FROM_FIELD = new MapperElementType("MAPPER_FROM_FIELD");
  IElementType MAPPER_LIST_INDEX = new MapperElementType("MAPPER_LIST_INDEX");
  IElementType MAPPER_MAPPING = new MapperElementType("MAPPER_MAPPING");
  IElementType MAPPER_MAPPINGS = new MapperElementType("MAPPER_MAPPINGS");
  IElementType MAPPER_MAPPING_PATH = new MapperElementType("MAPPER_MAPPING_PATH");
  IElementType MAPPER_MIDDLE_FIELD_NAME = new MapperElementType("MAPPER_MIDDLE_FIELD_NAME");
  IElementType MAPPER_NOT_NULL = new MapperElementType("MAPPER_NOT_NULL");
  IElementType MAPPER_NULL = new MapperElementType("MAPPER_NULL");
  IElementType MAPPER_NULL_NOTNULL = new MapperElementType("MAPPER_NULL_NOTNULL");
  IElementType MAPPER_PK_FK = new MapperElementType("MAPPER_PK_FK");
  IElementType MAPPER_PRECISION = new MapperElementType("MAPPER_PRECISION");
  IElementType MAPPER_PRECISION_NUM_WORD = new MapperElementType("MAPPER_PRECISION_NUM_WORD");
  IElementType MAPPER_REFERENCE = new MapperElementType("MAPPER_REFERENCE");
  IElementType MAPPER_REFERENCE_TYPE = new MapperElementType("MAPPER_REFERENCE_TYPE");
  IElementType MAPPER_SEPARATOR = new MapperElementType("MAPPER_SEPARATOR");
  IElementType MAPPER_TABLE_NAME = new MapperElementType("MAPPER_TABLE_NAME");

  IElementType CLOSE_PARENTH = new MapperTokenType("CLOSE_PARENTH");
  IElementType CLOSE_SQUARE = new MapperTokenType("CLOSE_SQUARE");
  IElementType COMMA = new MapperTokenType("COMMA");
  IElementType COMMENT = new MapperTokenType("COMMENT");
  IElementType CONCAT_BY_WORD = new MapperTokenType("CONCAT_BY_WORD");
  IElementType DOT = new MapperTokenType("DOT");
  IElementType EQUAL = new MapperTokenType("EQUAL");
  IElementType FK = new MapperTokenType("FK");
  IElementType FROM_WORD = new MapperTokenType("FROM_WORD");
  IElementType ID = new MapperTokenType("ID");
  IElementType MAPPING_WORD = new MapperTokenType("MAPPING_WORD");
  IElementType NOT = new MapperTokenType("NOT");
  IElementType NULL = new MapperTokenType("NULL");
  IElementType NUM = new MapperTokenType("NUM");
  IElementType OPEN_PARENTH = new MapperTokenType("OPEN_PARENTH");
  IElementType OPEN_SQUARE = new MapperTokenType("OPEN_SQUARE");
  IElementType PK = new MapperTokenType("PK");
  IElementType REFERENCE_TYPE_WORD = new MapperTokenType("REFERENCE_TYPE_WORD");
  IElementType REFERENCE_WORD = new MapperTokenType("REFERENCE_WORD");
  IElementType SOURCE_WORD = new MapperTokenType("SOURCE_WORD");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == MAPPER) {
        return new MapperImpl(node);
      }
      else if (type == MAPPER_ATTRIBUTE) {
        return new MapperAttributeImpl(node);
      }
      else if (type == MAPPER_COLUMN_NAME) {
        return new MapperColumnNameImpl(node);
      }
      else if (type == MAPPER_CONCAT_BY) {
        return new MapperConcatByImpl(node);
      }
      else if (type == MAPPER_DATA_TYPE) {
        return new MapperDataTypeImpl(node);
      }
      else if (type == MAPPER_FHIR_RESOURCE) {
        return new MapperFhirResourceImpl(node);
      }
      else if (type == MAPPER_FIRST_FIELD_NAME) {
        return new MapperFirstFieldNameImpl(node);
      }
      else if (type == MAPPER_FROM_FIELD) {
        return new MapperFromFieldImpl(node);
      }
      else if (type == MAPPER_LIST_INDEX) {
        return new MapperListIndexImpl(node);
      }
      else if (type == MAPPER_MAPPING) {
        return new MapperMappingImpl(node);
      }
      else if (type == MAPPER_MAPPINGS) {
        return new MapperMappingsImpl(node);
      }
      else if (type == MAPPER_MAPPING_PATH) {
        return new MapperMappingPathImpl(node);
      }
      else if (type == MAPPER_MIDDLE_FIELD_NAME) {
        return new MapperMiddleFieldNameImpl(node);
      }
      else if (type == MAPPER_NOT_NULL) {
        return new MapperNotNullImpl(node);
      }
      else if (type == MAPPER_NULL) {
        return new MapperNullImpl(node);
      }
      else if (type == MAPPER_NULL_NOTNULL) {
        return new MapperNullNotnullImpl(node);
      }
      else if (type == MAPPER_PK_FK) {
        return new MapperPkFkImpl(node);
      }
      else if (type == MAPPER_PRECISION) {
        return new MapperPrecisionImpl(node);
      }
      else if (type == MAPPER_PRECISION_NUM_WORD) {
        return new MapperPrecisionNumWordImpl(node);
      }
      else if (type == MAPPER_REFERENCE) {
        return new MapperReferenceImpl(node);
      }
      else if (type == MAPPER_REFERENCE_TYPE) {
        return new MapperReferenceTypeImpl(node);
      }
      else if (type == MAPPER_SEPARATOR) {
        return new MapperSeparatorImpl(node);
      }
      else if (type == MAPPER_TABLE_NAME) {
        return new MapperTableNameImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
