package com.deprosun.formatter;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.formatter.common.AbstractBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MapperFromWordBlock extends AbstractBlock {
    private SpacingBuilder spacingBuilder;

    protected MapperFromWordBlock(@NotNull ASTNode node, @Nullable Wrap wrap, @Nullable Alignment alignment,
                                  SpacingBuilder spacingBuilder) {
        super(node, wrap, alignment);
        this.spacingBuilder = spacingBuilder;
    }

    @Override
    protected List<Block> buildChildren() {
        return new ArrayList<Block>();
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

//    @Override
//    public Indent getIndent() {
//        return Indent.getNoneIndent();
//    }
}
