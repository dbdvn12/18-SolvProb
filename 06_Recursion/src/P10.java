public class P10 {
    public static void main(String[] args) {
        String s = "South, Korea 안녕";
        char v[] = s.toCharArray();
        toUpper(v, 0);
        System.out.println(v);
    }

    private static void toUpper(char[] v, int i) {
        if(i==v.length) return;
        if ('a' <= v[i] && v[i] <= 'z')
            v[i] = (char) (v[i] - ('a'-'A'));
        toUpper(v,i+1);
    }
}
