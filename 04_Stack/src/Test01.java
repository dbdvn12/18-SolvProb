public class Test01 {
    public static void main(String[] args) {
        String e="123  213/ .*";
        for(int i=e.length()-1;i>=0;i--) {
            e=e.replace("/"," /");
        }
        System.out.println(e);
    }
}
