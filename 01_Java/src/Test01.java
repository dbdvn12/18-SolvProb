public class Test01 {
    public static void main(String[] args){
        String s1="123"+"456";
        System.out.println(s1);

        String s2="123"+456;
        System.out.println(s2);

        String s3=123+"456";
        System.out.println(s3);

        String s4=""+123+456;
        System.out.println(s4);

        String s5=123+456+"";
        System.out.println(s5);
    }
}
