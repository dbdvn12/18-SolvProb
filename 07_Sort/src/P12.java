import java.util.Arrays;
import java.util.Comparator;

public class P12 {
    public static void main(String[] args) {
        Player v[]={new Player("yhkim", 4.3),new Player("cskim", 9.8),new Player("yhlee", 9.1),new Player("cslee", 7.3)};
        Arrays.sort(v, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                if(o1.record>o2.record)
                    return 1;
                if(o1.record<o2.record)
                    return -1;
                return 0;
            }
        });
        System.out.println(Arrays.toString(v));
    }
}