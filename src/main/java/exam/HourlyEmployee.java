package exam;

public class HourlyEmployee extends Employee {
    private float hoursWorked;
    private double hourlyWage;

    public HourlyEmployee(String name, float hoursWorked, double hourlyWage,  Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    public void setHoursWorked(float hoursWorked) {
        if (hoursWorked > 0) {
            this.hoursWorked = hoursWorked;
        }else{
            System.out.println("Hours Worked cannot be a negative number");
        }
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
