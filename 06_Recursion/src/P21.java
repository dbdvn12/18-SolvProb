public class P21 {
    public static void main(String[] args) {
        String s[]={"서울", "대구", "부산"};
//        perm(s, 0);
        int n[]=new int[3];
        for (int i = 0; i < n.length; i++) n[i]=i;
        perm(s, n, 0);
    }
    private static void perm(String[] s,int[] n, int i) {
        if(i==n.length){
//            System.out.println(Arrays.toString(n));
            for(int j=0; j<s.length; j++) {
                System.out.print(s[n[j]]);
            }
            System.out.println();
            return;
        }
        for (int j = i; j < n.length; j++) {
            int temp=n[i]; n[i]=n[j]; n[j]=temp; // swap
            perm(s,n, i+1);
            temp=n[i]; n[i]=n[j]; n[j]=temp; // swap
        }
    }
}