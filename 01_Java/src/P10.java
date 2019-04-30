public class P10 {
    public static void main(String[] args) {
        String s1 = "9999999999999999999999999999999999999999999999999";
        String s2 = "88888888888888888888888888888";
        System.out.println(add(s1,s2));
    }

    public static String add(String s1, String s2) {
        while(true){
            if(s1.length()==s2.length())
                break;
            if(s1.length()>s2.length())
                s2="0"+s2;
            else s1="0"+s1;
        }
        int[] a = new int[s1.length()];
        int n = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            int sum = (Character.getNumericValue(s1.charAt(i)) + Character.getNumericValue(s2.charAt(i)));
            if (i == 0) {
                a[i] = sum + n;
                break;
            }
            if (sum + n == 10) {
                a[i] = 0;
                n = 1;
            } else if (sum + n != 10) {
                a[i] = (sum + n)%10;
                n = sum / 10;
            }
        }
        String s = Integer.toString(a[0]);
        for (int i = 1; i < a.length; i++) {
            s = s + Integer.toString(a[i]);
        }
        return s;

//        String result="";
//
//        for(int i=0;i<Math.abs(s1.length()-s2.length());i++) {
//
//        }
//        int carry=0;
//        for(int i=s1.length()-1;i>=0;i--) {
//            int v=s1.charAt(i)-'0'+s2.charAt(i)-'0'+carry;
//            carry=v/10;
//            result=v%10+result;
//        }
    }
}