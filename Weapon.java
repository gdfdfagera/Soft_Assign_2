public class Weapon extends CharacDecorator{
    public Weapon(IEquipment equipment){
        super(equipment);
    }

    public String addWeapon(){
        return "Sword ";
    }

    @Override
    public String addEquipment() {
        return addWeapon() + super.addEquipment();
    }
}
