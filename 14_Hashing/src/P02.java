public class P02 {
    public static void main(String[] args) {
        SimpleChainHashTable ht = new SimpleChainHashTable(1000);
        ht.put("Korea");
        ht.put("Japan");
        System.out.println(ht.get("Korea"));
        System.out.println(ht.get("Japan"));
        System.out.println(ht.get("China"));
    }
}
