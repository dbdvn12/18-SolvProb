import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class P01 {
    static class Edge implements Comparable<Edge>{
        int v1,v2;
        double weight;
        public Edge(int v1, int v2, double weight) {
            this.v1=v1;
            this.v2=v2;
            this.weight=weight;
        }
        @Override
        public String toString() {
            return "("+v1+","+v2+","+weight+")";
        }
        @Override
        public int compareTo(Edge that) {
            return this.weight<that.weight? -1 : this.weight>that.weight? 1 : 0;
        }
    }
    public static void main(String[] args) {
        String input="0 1 70 0 3 10 1 2 80 3 2 50 3 4 40 2 5 20 4 2 30 4 5 60"; // for Kruskal's
        int V=6;
        LinkedList<Edge> adjList[]=new LinkedList[V];
        for (int i = 0; i < adjList.length; i++) adjList[i]=new LinkedList<>();
        String s[]=input.split("\\s+");
        for (int i = 0; i < s.length; i+=3){
            int v1=Integer.parseInt(s[i]), v2=Integer.parseInt(s[i+1]);
            double weight=Double.parseDouble(s[i+2]);
            adjList[v1].add(new Edge(v1,v2,weight));
            adjList[v2].add(new Edge(v2,v1,weight));
        }
        System.out.println(KruskalMST(adjList, V));
    }
    private static LinkedList<Edge> KruskalMST(LinkedList<Edge>[] adjList, int V) {
        LinkedList<Edge> mst=new LinkedList<>();
        LinkedList<Edge> edges=new LinkedList<>();
        for (int i = 0; i < adjList.length; i++) edges.addAll(adjList[i]);
        PriorityQueue<Edge> minPQ=new PriorityQueue<>(edges);
        UF uf=new UF(V);
        while(mst.size()<V-1 && minPQ.size()>0){
            Edge e=minPQ.remove();
            if(uf.find(e.v1)==uf.find(e.v2)) continue;
            mst.add(e);
            uf.union(e.v1, e.v2);
        }
        return mst;
    }
}

class UF {
    int parent[], rank[], count;
    public UF(int N) {
        parent=new int[N];
        rank=new int[N];
        for (int i = 0; i < parent.length; i++){
            parent[i]=i;
        }
    }
    public void union(int i, int j) { // union by rank
        i=find(i);
        j=find(j);
        if(i==j) return;
        if(rank[i]<rank[j]) parent[i]=j;
        else if(rank[i]>rank[j]) parent[j]=i;
        else{
            parent[i]=j;
            rank[j]++;
        }
    }
    public int find(int i) { // path compression
        if(i!=parent[i]) parent[i]=find(parent[i]);
        return parent[i];
    }
    @Override
    public String toString() {
        return Arrays.toString(parent);
    }
}