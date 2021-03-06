package com.lian.programanalysis.service;

import com.lian.programanalysis.model.DotNode;
import com.lian.programanalysis.model.GoConnectLine;
import com.lian.programanalysis.model.GoNode;
import com.lian.programanalysis.vistor.DotASTVistor;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.springframework.stereotype.Service;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.List;

@Service
public class NodeService {
    static String SOURCE_PATH="C:\\Users\\0817\\Desktop\\";//暂时先写死文件
    static String FILE_NAME="demo.java";
public List<DotNode> getDotNode(){
    try {
        ASTParser astParser = ASTParser.newParser(AST.JLS3);
        String pathname = String.format("%s%s", SOURCE_PATH, FILE_NAME);
        BufferedInputStream bufferedInputStream = new
                BufferedInputStream(new FileInputStream(pathname));
        byte input[] = new byte[bufferedInputStream.available()];
        bufferedInputStream.read(input);
        bufferedInputStream.close();
        astParser.setSource(new String(input).toCharArray());
        final CompilationUnit root = (CompilationUnit) astParser.createAST(null);

        boolean makedot = true;
        DotASTVistor visitor = new DotASTVistor(input, makedot,root);
        root.accept(visitor);

        return visitor.dotnodeList;

    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;

}


    public List<GoNode> getGoNode(){
        try {
            ASTParser astParser = ASTParser.newParser(AST.JLS3);
            String pathname = String.format("%s%s", SOURCE_PATH, FILE_NAME);
            BufferedInputStream bufferedInputStream = new
                    BufferedInputStream(new FileInputStream(pathname));
            byte input[] = new byte[bufferedInputStream.available()];
            bufferedInputStream.read(input);
            bufferedInputStream.close();
            astParser.setSource(new String(input).toCharArray());
            final CompilationUnit root = (CompilationUnit) astParser.createAST(null);

            boolean makedot = true;
            DotASTVistor visitor = new DotASTVistor(input, makedot,root);
            root.accept(visitor);

            return visitor.gonodeList;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public List<GoConnectLine> getGoConnectLine(){
        try {
            ASTParser astParser = ASTParser.newParser(AST.JLS3);
            String pathname = String.format("%s%s", SOURCE_PATH, FILE_NAME);
            BufferedInputStream bufferedInputStream = new
                    BufferedInputStream(new FileInputStream(pathname));
            byte input[] = new byte[bufferedInputStream.available()];
            bufferedInputStream.read(input);
            bufferedInputStream.close();
            astParser.setSource(new String(input).toCharArray());
            final CompilationUnit root = (CompilationUnit) astParser.createAST(null);

            boolean makedot = true;
            DotASTVistor visitor = new DotASTVistor(input, makedot,root);
            root.accept(visitor);

            return visitor.goConnectLineList;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }









}
