package exam;

public class Main {
    public static void main(String[] args) {

        Cloth clothingItem1 = new Cloth("Jeans", 20.00, Size.S);
        Cloth clothingItem2 = new Cloth("T-shirt", 8.00, Size.M);
        Cloth clothingItem3 = new Cloth("Hat", 2.00, Size.L);

        Cloth[] shoppingBag = {clothingItem1, clothingItem2, clothingItem3};

        System.out.println("Subtotal: " + UtilityMethods.calculateSubtotal(shoppingBag));


        Student student1 = new Student("Mike", Size.L, shoppingBag);
        Student student2 = new Student("Jane", Size.S, shoppingBag);

        Student[] listOfStudents = {student1, student2};

        for (Student student : listOfStudents){
            student.printInfo();
        }

        System.out.println(Student.getStudentsCounter());


        HourlyEmployee hourlyEmployee = new HourlyEmployee("Alex", 40, 20.0, Size.S, shoppingBag);
        hourlyEmployee.setHoursWorked(-20);


        Manager manager = new Manager("Terry", 1000.00, Size.L, shoppingBag);
        manager.printInfo();

        System.out.println(hourlyEmployee.printPriceAfterDiscount(clothingItem1));

        System.out.println(UtilityMethods.checkFitting(student1, clothingItem3));

        Business business = new Business("Acme", 10000, 20);
        business.payTaxOnEarnings();

        Payable[] payables = {hourlyEmployee, manager, business};
        UtilityMethods.printClassNamesOfPayableEntities(payables);








//        Business business = new Business("Dog food", 100, 79.99 );
//        System.out.println("Business class:");
//        System.out.println(business.calculatePay());
//        System.out.println(business.payTaxOnEarnings());
//        System.out.println(" ");
//
//        System.out.println("Cloth class:");
//        Cloth cloth1 = new Cloth("T-shirt", 10.55, Size.M);
//        Cloth cloth2 = new Cloth("Pants", 60.50, Size.L);
//        System.out.println(" ");
//
//        Cloth[] clothes = {cloth1, cloth2};
//
//        System.out.println("Student class: ");
//        Student student = new Student("Agafia", Size.S, clothes);
//        student.printStudentsCounter();
//
//        System.out.println("Utility methods: ");
//        UtilityMethods.checkCustomerDiscount(student);
//        System.out.println(UtilityMethods.calculateSubtotal(clothes));
//        System.out.println(" ");
//
//        System.out.println("Hourly Employee:");
//        HourlyEmployee hourlyEmployee = new HourlyEmployee("Boby", Size.L, clothes);
//        hourlyEmployee.setHourlyWage(21.00);
//        hourlyEmployee.setHoursWorked(40);
//        System.out.println(hourlyEmployee.calculatePay());
//        System.out.println(" ");





    }
}
