package exam;

public abstract class Customer extends Person {
    private Cloth[] clothingItems;

    public Customer(String name, Size size, Cloth[] clothingItems) {
        super(name, size);
        this.clothingItems = clothingItems;
    }

    public double printPriceAfterDiscount(Cloth cloth){
        return cloth.getPrice();
    }

    public Cloth[] getClothingItems() {
        return clothingItems;
    }

    public void setClothingItems(Cloth[] clothingItems) {
        this.clothingItems = clothingItems;
    }
}
