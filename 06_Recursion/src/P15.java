import java.util.LinkedList;
import java.util.Random;

public class P15 {
    static int sz;
    public static void main(String[] args) {
        int R = 5, C = 5, count = 0;
        char ground[][] = new char[R][C];
        Random random = new Random();
        LinkedList<Integer> size=new LinkedList<>();
        for (int i = 0; i < ground.length; i++)
            for (int j = 0; j < ground[i].length; j++) {
                ground[i][j] = (random.nextInt(3) == 0) ? '1' : '0';
            }
        print(ground);
        for (int i = 0; i < ground.length; i++) {
            for (int j = 0; j < ground[i].length; j++) {
                if (ground[i][j] == '1') {
                    sz=0;
                    dfs(ground, R, C, i, j);
                    count++;
                    size.add(sz);
                }
            }
        }
        System.out.println("물웅덩이 개수: "+count);
        while(!size.isEmpty())
            System.out.print(size.removeFirst()+" ");
    }

    private static void dfs(char[][] ground, int R, int C, int i, int j) {
        if (ground[i][j] == '1') {
            ground[i][j] = '0';
            sz++;
        }
        else return;
        int dx[] = {-1, 0, 1, -1, 1, -1, 0, 1}, dy[] = {1, 1, 1, 0, 0, -1, -1, -1};
        for (int k = 0; k < dx.length; k++) {
            int x = i + dx[k], y = j + dy[k];
            if (x < 0 || x >= R || y < 0 || y >= C) continue;
            dfs(ground, R, C, x, y);
        }
    }

    private static void print(char[][] ground) {
        for (int i = 0; i < ground.length; i++) { // 평면 출력
            for (int j = 0; j < ground[i].length; j++) System.out.print(ground[i][j]);
            System.out.println();
        }
    }
}