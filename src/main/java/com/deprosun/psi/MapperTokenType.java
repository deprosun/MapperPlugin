package com.deprosun.psi;

import com.intellij.psi.tree.IElementType;
import com.deprosun.MapperLanguage;

public class MapperTokenType extends IElementType {

    public MapperTokenType(String debugName) {
        super(debugName, MapperLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "MapperTokenType." + super.toString();
    }
}
