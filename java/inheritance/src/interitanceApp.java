public class interitanceApp {
    public static void main(String[] args) {
        Original original = new Original(1,2);
        Upgrade upgrade = new Upgrade(2,1);
        System.out.println(original);
        System.out.println(upgrade);
    }
}
