package com.deprosun.psi;

import com.deprosun.MapperLanguage;
import com.intellij.psi.tree.IElementType;

public class MapperElementType extends IElementType {

    public MapperElementType(String debugName) {
        super(debugName, MapperLanguage.INSTANCE);
    }
}
