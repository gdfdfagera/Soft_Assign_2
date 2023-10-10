public abstract class CharacDecorator implements IEquipment{
    IEquipment equipment;

    public CharacDecorator(IEquipment equipment){
        this.equipment = equipment;
    }

    @Override
    public String addEquipment() {
        return equipment.addEquipment();
    }
}
