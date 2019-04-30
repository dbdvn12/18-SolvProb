public class P22 {
    public static void main(String[] args) {
        long s=fact(20);
        int y=86400*365;
        int d=86400;
        int h=3600;
        int m=60;
        System.out.println((s/y)/(1024*1024*1024)+"년");
        System.out.println((s/d)/(1024*1024*1024)+"일");
        System.out.println((s/h)/(1024*1024*1024)+"시간");
        System.out.println((s/m)/(1024*1024*1024)+"분");
        System.out.println((s)/(1024*1024*1024)+"초");
    }
    public static long fact(int i) {
        if(i==0) return 1;
        return i*fact(i-1);
    }
}
