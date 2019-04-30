import java.util.Arrays;
import java.util.LinkedList;

public class P06 {
    public static void main(String[] args) {
        int V = 10;
        String input = "0 1 2 3 3 4 5 6 6 7 7 8 8 9";
//        String input="0 1 2 3 3 4 5 6 6 7 7 8 8 9 4 5";
        LinkedList<Integer> adjList[] = new LinkedList[V];
        for (int i = 0; i < adjList.length; i++) adjList[i] = new LinkedList<>();
        String s[] = input.split("\\s+");
        for (int i = 0; i < s.length; i += 2) {
            int v1 = Integer.parseInt(s[i]);
            int v2 = Integer.parseInt(s[i + 1]);
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }
        int groups[] = connected(adjList, V);
        System.out.println(Arrays.toString(groups));
        System.out.println(isFriend(groups, 1, 4));
        System.out.println(isFriend(groups, 5, 9));
    }

    private static boolean isFriend(int[] groups, int i, int j) {
        return groups[i] == groups[j];
    }

    private static int[] connected(LinkedList<Integer>[] adjList, int V) {
        int[] groups = new int[V];
        int g = 1;
        for (int i = 0; i < V; i++) {
            if (groups[i] == 0) {
                dfs(adjList, V, groups, i, g);
                g++;
            }
        }
        return groups;
    }

    private static void dfs(LinkedList<Integer>[] adjList, int V, int[] groups, int v, int g) {
        groups[v] = g;
        for (Integer i : adjList[v]) {
            if (groups[i] == 0) dfs(adjList, V, groups, i, g);
        }
    }
}
