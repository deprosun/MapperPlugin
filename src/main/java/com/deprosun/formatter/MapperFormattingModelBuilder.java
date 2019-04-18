package com.deprosun.formatter;

import com.deprosun.MapperLanguage;
import com.deprosun.psi.SimpleTypes;
import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiErrorElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MapperFormattingModelBuilder implements FormattingModelBuilder {

    @NotNull
    @Override
    public FormattingModel createModel(PsiElement element, CodeStyleSettings settings) {
        MapperBlock block = new MapperBlock(element.getNode(),
                Wrap.createWrap(WrapType.NONE, false),
                Alignment.createAlignment(),
                createSpaceBuilder(settings));

        return FormattingModelProvider.createFormattingModelForPsiFile(element.getContainingFile(), block, settings);
    }

    private static SpacingBuilder createSpaceBuilder(CodeStyleSettings settings) {
        SpacingBuilder builder = new SpacingBuilder(settings, MapperLanguage.INSTANCE);

        return builder
                .after(SimpleTypes.MAPPER)
                .blankLines(1)
                .after(SimpleTypes.MAPPER_MAPPINGS)
                .blankLines(1)
                .after(SimpleTypes.COMMA)
                .spacing(0, 0, 1, false, 0)
                .before(SimpleTypes.COMMA)
                .spacing(0, 0, 0, false, 0)
                .after(SimpleTypes.OPEN_PARENTH)
                .spacing(0, 0, 1, false, 0)
//                .before(SimpleTypes.EQUAL)
//                .spacing(1, 18, 0, false, 0)
                .between(SimpleTypes.SOURCE_WORD, SimpleTypes.MAPPER_TABLE_NAME)
                .spacing(1, 1, 0, false, 0)
                .between(SimpleTypes.MAPPER_TABLE_NAME, SimpleTypes.FROM_WORD)
                .spacing(1, 1, 0, false, 0)
                .between(SimpleTypes.MAPPER_TABLE_NAME, SimpleTypes.OPEN_PARENTH)
                .spacing(1, 1, 0, false, 0)
                .between(SimpleTypes.FROM_WORD, SimpleTypes.MAPPER_FROM_FIELD)
                .spacing(1, 1, 0, false, 0)
                .between(SimpleTypes.MAPPER_FROM_FIELD, SimpleTypes.OPEN_PARENTH)
                .spacing(1, 1, 0, false, 0)
                .between(SimpleTypes.MAPPING_WORD, SimpleTypes.OPEN_PARENTH)
                .spacing(1, 1, 0, false, 0)
//                .between(SimpleTypes.MAPPER_MAPPING_PATH, SimpleTypes.EQUAL)
//                .spacing(18, 18, 0, false, 0)
                .between(SimpleTypes.MAPPER_NULL_NOTNULL, SimpleTypes.MAPPER_ATTRIBUTE)
                .spacing(2, 6, 0, false, 0)
                ;
    }

    @Nullable
    @Override
    public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
        return null;
    }
}