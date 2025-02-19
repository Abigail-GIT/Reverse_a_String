public class Reverse_String {
    public static void main(String[] args) {
        String str = "Hello";
        String rstr = " ";
        char ch;

        for (int i = 0; i<str.length();i++){
            ch = str.charAt(i);
            rstr = ch + rstr;
        }
        System.out.println("Reverse String is " + rstr);
    }

}
