import java.util.TreeMap;

class Player {
    int id;
    public Player(int id) {
        this.id=id;
    }
}
public class BST04 {
    public static void main(String[] args) {
        TreeMap<Integer,Player> playerTreeMap=new TreeMap<>();
        for (int i =1; i <= 1000000; i++) {
            playerTreeMap.put(i,new Player(i));
        }
        for (int i = 1; i <=playerTreeMap.size() ; i++) {
            playerTreeMap.remove(2*i-1);
        }
    }
}
