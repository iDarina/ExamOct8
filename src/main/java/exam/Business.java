package exam;

public class Business implements Payable{
    private String name;
    private int productQtySupplied;
    private double productPrice;

    public Business(String name, int productQtySupplied, double productPrice) {
        this.name = name;
        this.productQtySupplied = productQtySupplied;
        this.productPrice = productPrice;
    }


    public String getName() {
        return name;
    }

    public int getProductQtySupplied() {
        return productQtySupplied;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public double calculatePay() {
        return this.productQtySupplied * this.productPrice;
    }

    @Override
    public boolean payTaxOnEarnings() {
        return true;
    }
}
