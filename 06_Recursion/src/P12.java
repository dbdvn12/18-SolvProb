public class P12 {
    public static void main(String[] args) {
        String s = "수박이박수";
        System.out.println(palindrome(s, 0));
    }

    private static boolean palindrome(String s, int i) {
//        if(i==s.length()/2) return true;
//        if(s.charAt(i)==s.charAt(s.length()-1-i))
//            return palindrome(s,i+1);
//        else return false;

        if (i >= s.length() / 2) return true;
        return s.charAt(i) == s.charAt(s.length() - 1 - i) &&
                palindrome(s, i + 1);
    }
}
