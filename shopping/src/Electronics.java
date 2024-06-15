public class Electronics extends Product{
    private String brand;

    public Electronics(String name, int price, int stock, String brand) {
        super(name, price, stock);
        this.brand = brand;
    }
    @Override
    public int calculatePrice(){
        if(this.brand == "Apple"){
            return (int)(getPrice() * 1.2);
        }
        return getPrice();
    }
}
