public class PremiumShoppingMall extends ShoppingMall{

    public PremiumShoppingMall(int size){
        super(size);
    }
    public Boolean checkOrderAvailability(Product product){
        if(product.getStock() >= 10){
            return true;
        }
        return false;
    }
}
