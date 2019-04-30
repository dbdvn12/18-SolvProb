public class P23_F {
    public static void main(String[] args) {
        int v[]=new int[3];
        bitString(v, 0);
    }
    private static void bitString(int[] v, int i) {
        if(i==v.length){
            System.out.print("{");
            for(int j=0;j<v.length;j++) {
                if(v[j]==1) System.out.print(j+" ");
            }
            System.out.println("}");
            return;
        }
        v[i]=0;
        bitString(v, i+1);
        v[i]=1;
        bitString(v, i+1);
    }
}
