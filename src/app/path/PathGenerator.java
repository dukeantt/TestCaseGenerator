package app.path;

import openjava.ojc.CommandArguments;
import openjava.ojc.CustomCompiler;

public class PathGenerator {
    public void generate(String[] args) {
        System.err.println("OpenJava Compiler Version 1.1 " + "build 20031119");
        CommandArguments arguments;
//        String[] filePath = new String[2];
//        filePath[0] = "-d=./out";
//        filePath[1] = "src/app/CheckTriangle.oj";
        try {
            arguments = new CommandArguments(args);
        } catch (Exception e) {
            return;
        }
        new CustomCompiler(arguments).run();
    }
}
