package leetcode;

public class Q1678 {
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }
    public static String interpret(String command) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                result.append('G');
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                result.append('o');
                i += 2;
            } else {
                result.append("al");
                i += 4;
            }
        }

        return result.toString();

        // It will create new object because String is immutable.
//        String str = command.replace("()", "o");
//        String str2 = str.replace("(al)","al");


    }
}
