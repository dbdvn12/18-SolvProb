import java.util.Random;

public class BS01_A {
    public static void main(String[] args) {
        int v[] = new int[1000000];
        Random random = new Random();
        for (int i = 0; i < v.length; i++) v[i] = random.nextInt(1000000);
        int key = 1234;
        System.out.println(search(v, key));
    }

    private static int search(int[] v, int key) {
        for (int i = 0; i <v.length ; i++) {
            if(v[i]==key)
                return i;
        }
        return -1;
    }
}
