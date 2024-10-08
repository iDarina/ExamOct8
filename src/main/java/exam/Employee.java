package exam;

public abstract class Employee extends Customer implements TerminateAble, Payable{
    protected final double DISCOUNT = 0.1;


    public Employee(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }
}
