public class P24 {
    static int sum=21;
    static int n[]={1,3,4,5,8,9};
    public static void main(String[] args) {
        int subset[]=new int[n.length];
        subsetSum(subset, 0);
    }
    private static void subsetSum(int[] subset, int i) {
        if(i==n.length){
            int s=0;
            for(int j=0;j<subset.length;j++)
                if(subset[j]==1) s+=n[j];
            if(s==sum) {
                for(int j=0;j<subset.length;j++) {
                    if(subset[j]==1) System.out.print(n[j]+" ");
                }
                System.out.println();
            }
            return;
        }
        subset[i]=0;
        subsetSum(subset, i+1);
        subset[i]=1;
        subsetSum(subset, i+1);
    }
}
