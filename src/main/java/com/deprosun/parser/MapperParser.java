// This is a generated file. Not intended for manual editing.
package com.deprosun.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.deprosun.psi.SimpleTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MapperParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == MAPPER) {
      r = Mapper(b, 0);
    }
    else if (t == MAPPER_ATTRIBUTE) {
      r = MapperAttribute(b, 0);
    }
    else if (t == MAPPER_COLUMN_NAME) {
      r = MapperColumnName(b, 0);
    }
    else if (t == MAPPER_CONCAT_BY) {
      r = MapperConcatBy(b, 0);
    }
    else if (t == MAPPER_DATA_TYPE) {
      r = MapperDataType(b, 0);
    }
    else if (t == MAPPER_FHIR_RESOURCE) {
      r = MapperFhirResource(b, 0);
    }
    else if (t == MAPPER_FIRST_FIELD_NAME) {
      r = MapperFirstFieldName(b, 0);
    }
    else if (t == MAPPER_FROM_FIELD) {
      r = MapperFromField(b, 0);
    }
    else if (t == MAPPER_LIST_INDEX) {
      r = MapperListIndex(b, 0);
    }
    else if (t == MAPPER_MAPPING) {
      r = MapperMapping(b, 0);
    }
    else if (t == MAPPER_MAPPING_PATH) {
      r = MapperMappingPath(b, 0);
    }
    else if (t == MAPPER_MAPPINGS) {
      r = MapperMappings(b, 0);
    }
    else if (t == MAPPER_MIDDLE_FIELD_NAME) {
      r = MapperMiddleFieldName(b, 0);
    }
    else if (t == MAPPER_NOT_NULL) {
      r = MapperNotNull(b, 0);
    }
    else if (t == MAPPER_NULL) {
      r = MapperNull(b, 0);
    }
    else if (t == MAPPER_NULL_NOTNULL) {
      r = MapperNullNotnull(b, 0);
    }
    else if (t == MAPPER_PK_FK) {
      r = MapperPk_Fk(b, 0);
    }
    else if (t == MAPPER_PRECISION) {
      r = MapperPrecision(b, 0);
    }
    else if (t == MAPPER_PRECISION_NUM_WORD) {
      r = MapperPrecisionNumWord(b, 0);
    }
    else if (t == MAPPER_REFERENCE) {
      r = MapperReference(b, 0);
    }
    else if (t == MAPPER_REFERENCE_TYPE) {
      r = MapperReferenceType(b, 0);
    }
    else if (t == MAPPER_SEPARATOR) {
      r = MapperSeparator(b, 0);
    }
    else if (t == MAPPER_TABLE_NAME) {
      r = MapperTableName(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return Mappers(b, l + 1);
  }

  /* ********************************************************** */
  // SOURCE_WORD MapperTableName (FROM_WORD MapperFromField)? '(' MapperMappings Mapper* ')'
  public static boolean Mapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mapper")) return false;
    if (!nextTokenIs(b, SOURCE_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SOURCE_WORD);
    r = r && MapperTableName(b, l + 1);
    r = r && Mapper_2(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && MapperMappings(b, l + 1);
    r = r && Mapper_5(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, MAPPER, r);
    return r;
  }

  // (FROM_WORD MapperFromField)?
  private static boolean Mapper_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mapper_2")) return false;
    Mapper_2_0(b, l + 1);
    return true;
  }

  // FROM_WORD MapperFromField
  private static boolean Mapper_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mapper_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FROM_WORD);
    r = r && MapperFromField(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Mapper*
  private static boolean Mapper_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mapper_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Mapper(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Mapper_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // MapperReference | MapperPk_Fk | MapperConcatBy | MapperReferenceType
  public static boolean MapperAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAPPER_ATTRIBUTE, "<mapper attribute>");
    r = MapperReference(b, l + 1);
    if (!r) r = MapperPk_Fk(b, l + 1);
    if (!r) r = MapperConcatBy(b, l + 1);
    if (!r) r = MapperReferenceType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean MapperColumnName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperColumnName")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, MAPPER_COLUMN_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // CONCAT_BY_WORD '[' MapperSeparator ']'
  public static boolean MapperConcatBy(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperConcatBy")) return false;
    if (!nextTokenIs(b, CONCAT_BY_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONCAT_BY_WORD);
    r = r && consumeToken(b, "[");
    r = r && MapperSeparator(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, MAPPER_CONCAT_BY, r);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean MapperDataType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperDataType")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, MAPPER_DATA_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean MapperFhirResource(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperFhirResource")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, MAPPER_FHIR_RESOURCE, r);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean MapperFirstFieldName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperFirstFieldName")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, MAPPER_FIRST_FIELD_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // MapperFirstFieldName ( '.' MapperMiddleFieldName)*
  public static boolean MapperFromField(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperFromField")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MapperFirstFieldName(b, l + 1);
    r = r && MapperFromField_1(b, l + 1);
    exit_section_(b, m, MAPPER_FROM_FIELD, r);
    return r;
  }

  // ( '.' MapperMiddleFieldName)*
  private static boolean MapperFromField_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperFromField_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MapperFromField_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MapperFromField_1", c)) break;
    }
    return true;
  }

  // '.' MapperMiddleFieldName
  private static boolean MapperFromField_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperFromField_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && MapperMiddleFieldName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' NUM ']'
  public static boolean MapperListIndex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperListIndex")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAPPER_LIST_INDEX, "<mapper list index>");
    r = consumeToken(b, "[");
    r = r && consumeToken(b, NUM);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MapperMappingPath EQUAL MapperColumnName MapperDataType MapperPrecision? MapperNullNotnull MapperAttribute?
  public static boolean MapperMapping(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperMapping")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MapperMappingPath(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && MapperColumnName(b, l + 1);
    r = r && MapperDataType(b, l + 1);
    r = r && MapperMapping_4(b, l + 1);
    r = r && MapperNullNotnull(b, l + 1);
    r = r && MapperMapping_6(b, l + 1);
    exit_section_(b, m, MAPPER_MAPPING, r);
    return r;
  }

  // MapperPrecision?
  private static boolean MapperMapping_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperMapping_4")) return false;
    MapperPrecision(b, l + 1);
    return true;
  }

  // MapperAttribute?
  private static boolean MapperMapping_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperMapping_6")) return false;
    MapperAttribute(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // MapperFirstFieldName ('.' MapperMiddleFieldName)*
  public static boolean MapperMappingPath(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperMappingPath")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MapperFirstFieldName(b, l + 1);
    r = r && MapperMappingPath_1(b, l + 1);
    exit_section_(b, m, MAPPER_MAPPING_PATH, r);
    return r;
  }

  // ('.' MapperMiddleFieldName)*
  private static boolean MapperMappingPath_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperMappingPath_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MapperMappingPath_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MapperMappingPath_1", c)) break;
    }
    return true;
  }

  // '.' MapperMiddleFieldName
  private static boolean MapperMappingPath_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperMappingPath_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && MapperMiddleFieldName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MAPPING_WORD '(' MapperMapping (COMMA MapperMapping)* ')'
  public static boolean MapperMappings(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperMappings")) return false;
    if (!nextTokenIs(b, MAPPING_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MAPPING_WORD);
    r = r && consumeToken(b, "(");
    r = r && MapperMapping(b, l + 1);
    r = r && MapperMappings_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, MAPPER_MAPPINGS, r);
    return r;
  }

  // (COMMA MapperMapping)*
  private static boolean MapperMappings_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperMappings_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MapperMappings_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MapperMappings_3", c)) break;
    }
    return true;
  }

  // COMMA MapperMapping
  private static boolean MapperMappings_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperMappings_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && MapperMapping(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID | MapperListIndex
  public static boolean MapperMiddleFieldName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperMiddleFieldName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAPPER_MIDDLE_FIELD_NAME, "<mapper middle field name>");
    r = consumeToken(b, ID);
    if (!r) r = MapperListIndex(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NOT NULL
  public static boolean MapperNotNull(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperNotNull")) return false;
    if (!nextTokenIs(b, NOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NOT, NULL);
    exit_section_(b, m, MAPPER_NOT_NULL, r);
    return r;
  }

  /* ********************************************************** */
  // NULL
  public static boolean MapperNull(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperNull")) return false;
    if (!nextTokenIs(b, NULL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NULL);
    exit_section_(b, m, MAPPER_NULL, r);
    return r;
  }

  /* ********************************************************** */
  // MapperNull | MapperNotNull
  public static boolean MapperNullNotnull(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperNullNotnull")) return false;
    if (!nextTokenIs(b, "<mapper null notnull>", NOT, NULL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAPPER_NULL_NOTNULL, "<mapper null notnull>");
    r = MapperNull(b, l + 1);
    if (!r) r = MapperNotNull(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PK | FK
  public static boolean MapperPk_Fk(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperPk_Fk")) return false;
    if (!nextTokenIs(b, "<mapper pk fk>", FK, PK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAPPER_PK_FK, "<mapper pk fk>");
    r = consumeToken(b, PK);
    if (!r) r = consumeToken(b, FK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' MapperPrecisionNumWord (','? MapperPrecisionNumWord)* ')'
  public static boolean MapperPrecision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperPrecision")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAPPER_PRECISION, "<mapper precision>");
    r = consumeToken(b, "(");
    r = r && MapperPrecisionNumWord(b, l + 1);
    r = r && MapperPrecision_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (','? MapperPrecisionNumWord)*
  private static boolean MapperPrecision_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperPrecision_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MapperPrecision_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MapperPrecision_2", c)) break;
    }
    return true;
  }

  // ','? MapperPrecisionNumWord
  private static boolean MapperPrecision_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperPrecision_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MapperPrecision_2_0_0(b, l + 1);
    r = r && MapperPrecisionNumWord(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean MapperPrecision_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperPrecision_2_0_0")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // NUM | ID
  public static boolean MapperPrecisionNumWord(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperPrecisionNumWord")) return false;
    if (!nextTokenIs(b, "<mapper precision num word>", ID, NUM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAPPER_PRECISION_NUM_WORD, "<mapper precision num word>");
    r = consumeToken(b, NUM);
    if (!r) r = consumeToken(b, ID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // REFERENCE_WORD '[' MapperFhirResource ']'
  public static boolean MapperReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperReference")) return false;
    if (!nextTokenIs(b, REFERENCE_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REFERENCE_WORD);
    r = r && consumeToken(b, "[");
    r = r && MapperFhirResource(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, MAPPER_REFERENCE, r);
    return r;
  }

  /* ********************************************************** */
  // REFERENCE_TYPE_WORD
  public static boolean MapperReferenceType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperReferenceType")) return false;
    if (!nextTokenIs(b, REFERENCE_TYPE_WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REFERENCE_TYPE_WORD);
    exit_section_(b, m, MAPPER_REFERENCE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // ',' | '.' | ''
  public static boolean MapperSeparator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperSeparator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAPPER_SEPARATOR, "<mapper separator>");
    r = consumeToken(b, ",");
    if (!r) r = consumeToken(b, ".");
    if (!r) r = consumeToken(b, "");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean MapperTableName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapperTableName")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, MAPPER_TABLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // Mapper
  static boolean Mappers(PsiBuilder b, int l) {
    return Mapper(b, l + 1);
  }

}
