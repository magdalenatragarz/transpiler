import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
            String inputFile = "/home/magda/transpil/transpiler/src/main/java/Circle.txt";
            String outputFile = "/home/magda/transpil/transpiler/src/main/java/result.m";
        try {

            FileReader reader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String testString = bufferedReader.lines().collect(Collectors.joining());

            FileWriter writer = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            JavaLikeListenerImpl listener = new JavaLikeListenerImpl();

            CharStream testStream = new ANTLRInputStream(testString);
            JavaLikeLexer lexer = new JavaLikeLexer(testStream);
            ParseTreeWalker walker = new ParseTreeWalker();

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            JavaLikeParser parser = new JavaLikeParser(tokens);

            ParseTree parseTree = parser.compilationUnit();
            walker.walk(listener,parseTree);
            bufferedWriter.write(listener.builder.render());
            System.out.println(listener.builder.render());
            System.out.println(parseTree.toStringTree(parser)); // print LISP-style tree
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException ei) {

            return;
        }
        finally {
        }
        }
}
