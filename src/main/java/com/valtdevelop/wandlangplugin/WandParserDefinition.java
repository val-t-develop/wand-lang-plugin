package com.valtdevelop.wandlangplugin;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.valtdevelop.wandlangplugin.WandParser;
import com.valtdevelop.wandlangplugin.psi.WandFile;
import com.valtdevelop.wandlangplugin.psi.WandTokenSets;
import com.valtdevelop.wandlangplugin.psi.WandTypes;
import org.jetbrains.annotations.NotNull;

public class WandParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(WandLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new WandLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TokenSet.orSet(WandTokenSets.LINE_COMMENT, WandTokenSets.BLOCK_COMMENT);
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new WandParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new WandFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return WandTypes.Factory.createElement(node);
    }
}
