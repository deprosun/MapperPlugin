package com.deprosun.formatter;

import com.deprosun.psi.SimpleTypes;
import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiErrorElement;
import com.intellij.psi.formatter.common.AbstractBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MapperBlock extends AbstractBlock {
    private SpacingBuilder spacingBuilder;

    protected MapperBlock(@NotNull ASTNode node, @Nullable Wrap wrap, @Nullable Alignment alignment,
                          SpacingBuilder spacingBuilder) {
        super(node, wrap, alignment);
        this.spacingBuilder = spacingBuilder;
    }

    @Override
    protected List<Block> buildChildren() {
        if (this.isIncomplete()) {
            return AbstractBlock.EMPTY;
        }

        List<Block> blocks = new ArrayList<Block>();
        ASTNode child = myNode.getFirstChildNode();

        while (child != null) {
            if (child.getElementType() == SimpleTypes.MAPPER) {
                Block block = new MapperBlock(child, Wrap.createWrap(WrapType.NONE, false), Alignment.createAlignment(),
                        spacingBuilder);

                blocks.add(block);
            } else if (child.getElementType() == SimpleTypes.MAPPER_MAPPINGS) {
                Block block = new MappingListBlock(child, Wrap.createWrap(WrapType.NONE, false), Alignment.createAlignment(),
                        spacingBuilder);
                blocks.add(block);
            } else if (child.getElementType() == SimpleTypes.SOURCE_WORD) {

                Block block = new MapperSourceWordBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        myAlignment,
                        spacingBuilder);

                blocks.add(block);
            } else if (child.getElementType() == SimpleTypes.MAPPER_TABLE_NAME) {
                Block block = new MapperTableNameBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        myAlignment,
                        spacingBuilder);

                blocks.add(block);
            } else if (child.getElementType() == SimpleTypes.OPEN_PARENTH) {
                Block block = new MapperOpenParenthBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        myAlignment,
                        spacingBuilder);

                blocks.add(block);
            } else if (child.getElementType() == SimpleTypes.CLOSE_PARENTH) {
                Block block = new MapperCloseParenthBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        myAlignment,
                        spacingBuilder);

                blocks.add(block);
            } else if (child.getElementType() == SimpleTypes.FROM_WORD) {
                Block block = new MapperFromWordBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        myAlignment,
                        spacingBuilder);

                blocks.add(block);
            } else if (child.getElementType() == SimpleTypes.MAPPER_FROM_FIELD) {
                Block block = new MapperFromFieldBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        myAlignment,
                        spacingBuilder);

                blocks.add(block);
            } else if (child.getPsi() instanceof PsiErrorElement) {
                return new ArrayList<Block>();
            }
            child = child.getTreeNext();
        }
        return blocks;
    }

    @Override
    public Indent getIndent() {
        return Indent.getNormalIndent();
    }

    @Nullable
    @Override
    public Spacing getSpacing(@Nullable Block child1, @NotNull Block child2) {
        return spacingBuilder.getSpacing(this, child1, child2);
    }

    @Override
    public boolean isLeaf() {
        return myNode.getFirstChildNode() == null;
    }
}
