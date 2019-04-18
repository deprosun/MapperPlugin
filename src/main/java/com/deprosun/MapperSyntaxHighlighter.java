package com.deprosun;

import com.deprosun.psi.SimpleTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class MapperSyntaxHighlighter extends SyntaxHighlighterBase {

//    IElementType COMMENT = new MapperTokenType("COMMENT");
//    IElementType CONCAT_BY_WORD = new MapperTokenType("CONCAT_BY_WORD");
//    IElementType EQUAL = new MapperTokenType("EQUAL");
//    IElementType FROM_WORD = new MapperTokenType("FROM_WORD");
//    IElementType ID = new MapperTokenType("ID");


//    IElementType MAPPING_WORD = new MapperTokenType("MAPPING_WORD");

//    IElementType NOT = new MapperTokenType("NOT");
//    IElementType NULL = new MapperTokenType("NULL");
//    IElementType NUM = new MapperTokenType("NUM");
//    IElementType REFERENCE_TYPE_WORD = new MapperTokenType("REFERENCE_TYPE_WORD");
//    IElementType REFERENCE_WORD = new MapperTokenType("REFERENCE_WORD");
//    IElementType SOURCE_WORD = new MapperTokenType("SOURCE_WORD");

    public static final TextAttributesKey EQUAL =
            createTextAttributesKey("MAPPER_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    public static final TextAttributesKey KEY =
            createTextAttributesKey("MAPPER_KEY", DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey VALUE =
            createTextAttributesKey("MAPPER_VALUE", DefaultLanguageHighlighterColors.STRING);

    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("MAPPER_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] EQUAL_KEYS = new TextAttributesKey[]{EQUAL};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new MapperLexerAdapter();
    }

    private Boolean isKeyType(IElementType tokenType) {
        return tokenType.equals(SimpleTypes.SOURCE_WORD)
                || tokenType.equals(SimpleTypes.CONCAT_BY_WORD)
                || tokenType.equals(SimpleTypes.MAPPING_WORD)
                || tokenType.equals(SimpleTypes.NOT)
                || tokenType.equals(SimpleTypes.NULL)
                || tokenType.equals(SimpleTypes.REFERENCE_WORD)
                || tokenType.equals(SimpleTypes.PK)
                || tokenType.equals(SimpleTypes.FK)
                || tokenType.equals(SimpleTypes.FROM_WORD)
                || tokenType.equals(SimpleTypes.REFERENCE_TYPE_WORD);

    }

    private Boolean isValueType(IElementType tokenType) {
        return tokenType.equals(SimpleTypes.MAPPER_FROM_FIELD)
                || tokenType.equals(SimpleTypes.MAPPING_WORD)
                || tokenType.equals(SimpleTypes.ID);

    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(SimpleTypes.EQUAL)) {
            return EQUAL_KEYS;
        } else if (isKeyType(tokenType)) {
            return KEY_KEYS;
        } else if (tokenType.equals(SimpleTypes.ID)) {
            return VALUE_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
