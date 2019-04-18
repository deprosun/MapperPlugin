package com.deprosun;

import com.deprosun.lexer.MapperLexer;
import com.intellij.lexer.FlexAdapter;

import java.io.Reader;


public class MapperLexerAdapter extends FlexAdapter {
    public MapperLexerAdapter() {
        super(new MapperLexer((Reader) null));
    }
}
