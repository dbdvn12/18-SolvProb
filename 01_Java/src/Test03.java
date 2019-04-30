public class Test03 {
    public static void main(String[] args)
    {
        int[] n=new int[3];
        n[0]=77;
        n[1]=88;
        n[2]=99;
        for (int i = 0; i <n.length ; i++) {
            System.out.println(n[i]);
        }
        for (int i: n)
        {
            System.out.println(i);
        }
    }
}
