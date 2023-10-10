public class Main {
    public static void main(String[] args) {
        IEquipment c = new Shield(new Weapon(new Character()));


        System.out.println(c.addEquipment());
    }
}
