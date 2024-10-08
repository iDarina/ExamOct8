package exam;

public class Manager extends Employee{
    protected final double EXTRA_DISCOUNT = 0.5;
    private double salary;

    public Manager(String name, double salary, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double getEXTRA_DISCOUNT() {
        return EXTRA_DISCOUNT + DISCOUNT;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean canGetFired() {
        return true;
    }

    @Override
    public double calculatePay() {
        return this.salary;
    }

    @Override
    public boolean payTaxOnEarnings() {
        return false;
    }

    @Override
    public void printInfo() {
        System.out.print(getName() + " Makes " + getSalary() + " and his shopping consist of the following clothing items: ");
        for (Cloth item : getClothingItems()){
            System.out.print(item);
        }
    }
}
