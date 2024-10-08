package exam;

public class UtilityMethods {


    public static boolean checkFitting(Customer customer, Cloth cloth){
        return customer.getSize() == cloth.getSize();
    }

    public static double calculateSubtotal(Cloth[] cloths){
        double total = 0;
        for(Cloth cloth : cloths){
            total += cloth.getPrice();
        }
        return total;
    }

    //???
    public static void printClassNamesOfPayableEntities(Payable[] payables){
        for (Payable pay : payables){
            System.out.println(pay);
        }
    }

    public static void checkCustomerDiscount(Customer customer){
        if (customer instanceof Employee){
            System.out.println("Has Employee discount");
        }else if(customer instanceof Student){
            System.out.println("Has Student discount");
        }else if(customer instanceof Manager){
            System.out.println("Has Manager extra discount");
        }else{
            System.out.println("Has no discount");
        }
    }

}
