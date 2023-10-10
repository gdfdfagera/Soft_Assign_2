public class Shield extends CharacDecorator{
    public Shield(IEquipment equipment){
        super(equipment);
    }

    public String addShield(){
        return "Shield ";
    }

    @Override
    public String addEquipment() {
        return addShield() + super.addEquipment();
    }
}
