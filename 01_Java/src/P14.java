import java.util.Random;

public class P14 {
    public static void main(String[] args)
    {
        Random random=new Random();
        for (int i = 0; i < 20; i++) {
            int v=random.nextInt(6)+1;
            System.out.print(v+" ");
        }
    }
}
