package com.deprosun.formatter;

import com.deprosun.psi.SimpleTypes;
import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.formatter.common.AbstractBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MappingBlock extends AbstractBlock {
    private SpacingBuilder spacingBuilder;

    protected MappingBlock(@NotNull ASTNode node,
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
            if (child.getElementType() == SimpleTypes.MAPPER_MAPPING_PATH) {
                Block block = new MapperMappingPathBlock(child, Wrap.createWrap(WrapType.NONE, false), myAlignment,
                        spacingBuilder);
                blocks.add(block);
            } else if (child.getElementType() == SimpleTypes.EQUAL) {
                Block block = new MapperEqualBlock(child, Wrap.createWrap(WrapType.NONE, false), myAlignment,
                        spacingBuilder);
                blocks.add(block);
            } else if (child.getElementType() == SimpleTypes.MAPPER_COLUMN_NAME) {
                Block block = new MapperColumnNameBlock(child, Wrap.createWrap(WrapType.NONE, false), myAlignment,
                        spacingBuilder);
                blocks.add(block);
            } else if (child.getElementType() == SimpleTypes.MAPPER_DATA_TYPE) {
                Block block = new MapperDataTypeBlock(child, Wrap.createWrap(WrapType.NONE, false), myAlignment,
                        spacingBuilder);
                blocks.add(block);
            } else if (child.getElementType() == SimpleTypes.MAPPER_PRECISION) {
                Block block = new MapperPrecisionBlock(child, Wrap.createWrap(WrapType.NONE, false), myAlignment,
                        spacingBuilder);
                blocks.add(block);
            } else if (child.getElementType() == SimpleTypes.MAPPER_NULL_NOTNULL) {
                Block block = new MapperNullNotNullBlock(child, Wrap.createWrap(WrapType.NONE, false), myAlignment,
                        spacingBuilder);
                blocks.add(block);
            } else if (child.getElementType() == SimpleTypes.MAPPER_ATTRIBUTE) {
                Block block = new MapperAttributeBlock(child, Wrap.createWrap(WrapType.NONE, false), myAlignment,
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
