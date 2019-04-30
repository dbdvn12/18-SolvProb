import java.util.LinkedList;
import java.util.Stack;

public class P08 {
    public static void main(String[] args) {
        class Point {
            int x, y;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            @Override
            public String toString() {
                return "(" + x + ", " + y + ")";
            }
        }
        String input =
                "0000000#" +
                        "##0#0#0#" +
                        "0000000#" +
                        "0#####0#" +
                        "00000###" +
                        "###00000";
        int R = 6, C = 8;
        char maze[][] = new char[R][C];
        for (int i = 0; i < input.length(); i++)
            maze[i / C][i % C] = input.charAt(i);
        LinkedList<Point> queue = new LinkedList<Point>();
        int[][] cost = new int[R][C];
        maze[0][0] = 'v';
        queue.addLast(new Point(0, 0));
        int dx[] = {0, 0, 1, -1}, dy[] = {1, -1, 0, 0,};
        cost[0][0] = 1;
        while (!queue.isEmpty()) {
            Point p = queue.removeFirst();
            //p에서 갈수있는 위치를 방문표시 후 큐에 삽입
            for (int i = 0; i < dx.length; i++) {
                int x = p.x + dx[i], y = p.y + dy[i];
                if (x < 0 || x >= R || y < 0 || y >= C || maze[x][y] == '#' || maze[x][y] == 'v')
                    continue;
                maze[x][y] = 'v';
                cost[x][y] = cost[p.x][p.y] + 1;
                queue.addLast(new Point(x, y));
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++)
                System.out.printf("%02d ", cost[i][j]);
            System.out.println();
        }

        System.out.println();
        Stack<Point> shortest = new Stack<>();
        shortest.push(new Point(5, 7));
        while (shortest.size() > 0) {
            Point p = shortest.peek();
            if (p.x == 0 && p.y == 0) break;
            for (int i = 0; i < dx.length; i++) {
                int x = p.x + dx[i], y = p.y + dy[i];
                if (x < 0 || x >= R || y < 0 || y >= C || maze[x][y] == '#')
                    continue;
                if (cost[x][y] == cost[p.x][p.y] - 1) {
                    shortest.push(new Point(x, y));
                    break;
                }
            }
        }
        while (!shortest.isEmpty())
            System.out.print(shortest.pop());
    }
}
