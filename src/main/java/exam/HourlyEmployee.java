package exam;

public class HourlyEmployee extends Employee {
    private float hoursWorked;
    private double hourlyWage;

    public HourlyEmployee(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public boolean canGetFired() {
        return true;
    }

    @Override
    public double calculatePay() {
        return this.hoursWorked * this.hourlyWage;
    }

    @Override
    public boolean payTaxOnEarnings() {
        return false;
    }

    @Override
    public void printInfo() {

    }
}
