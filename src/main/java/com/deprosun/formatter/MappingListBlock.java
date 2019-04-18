package com.deprosun.formatter;

import com.deprosun.psi.SimpleTypes;
import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.formatter.common.AbstractBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MappingListBlock extends AbstractBlock {
    private SpacingBuilder spacingBuilder;

    protected MappingListBlock(@NotNull ASTNode node,
                               @Nullable Wrap wrap,
                               @Nullable Alignment alignment,
                               SpacingBuilder spacingBuilder) {
        super(node, wrap, alignment);
        this.spacingBuilder = spacingBuilder;
    }

    @Override
    protected List<Block> buildChildren() {

        if(this.isIncomplete()){
            return AbstractBlock.EMPTY;
        }

        List<Block> blocks = new ArrayList<Block>();
        ASTNode child = myNode.getFirstChildNode();
        while (child != null) {
            if (child.getElementType() == SimpleTypes.MAPPER_MAPPING) {
                Block block = new MappingBlock(child, Wrap.createWrap(WrapType.NONE, false), Alignment.createAlignment(true, Alignment.Anchor.LEFT),
                        spacingBuilder);
                blocks.add(block);
            } else if (child.getElementType() == SimpleTypes.MAPPING_WORD) {
                Block block = new MapperMappingWordBlock(child, Wrap.createWrap(WrapType.NONE, false), myAlignment,
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
            } else if (child.getElementType() == SimpleTypes.COMMA) {
                Block block = new MapperMappingComma(child, Wrap.createWrap(WrapType.NONE, false), myAlignment,
                        spacingBuilder);
                blocks.add(block);
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
