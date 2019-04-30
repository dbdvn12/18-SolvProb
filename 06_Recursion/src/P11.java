public class P11 {
    public static void main(String[] args) {
        String s = "South, Korea";
        char v[] = s.toCharArray();
        System.out.println(countUpper(v, 0));
    }

    private static int countUpper(char[] v, int i) {

        if(i==v.length) return 0;
//        if('A'<=v[i]&&v[i]<='Z')
//            return 1+countUpper(v,i+1);
//        else return countUpper(v,i+1);
        return ((v[i]>='A'&&v[i]<='Z')?1:0)+countUpper(v,i+1);
    }
}
