package utils;

public class JavaKeywords {

    private static String[] javaKeywords = {"abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"};


    public static boolean checkKeywords (String string){

        for (String x : javaKeywords ) {
            if (string.contains(x)){
                return true;
            }
        }

        return false;
    }


}