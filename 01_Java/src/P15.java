import java.util.Random;

public class P15 {
    public static void main(String[] args)
    {
        Random random=new Random();
        int[] arr=new int[6];
        for (int i = 0; i < 6000; i++) {
            int v=random.nextInt(6);
            switch(v)
            {
                case 0:
                    arr[0]++;
                    break;
                case 1:
                    arr[1]++;
                    break;
                case 2:
                    arr[2]++;
                    break;
                case 3:
                    arr[3]++;
                    break;
                case 4:
                    arr[4]++;
                    break;
                case 5:
                    arr[5]++;
                    break;
            }
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            if(i!=arr.length-1)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
