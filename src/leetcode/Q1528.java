package leetcode;

public class Q1528 {
    //defanging the String
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
    public static String defangIPaddr(String address) {
        String name = address.replace(".","[.]");

        return  (name);
    }
}
