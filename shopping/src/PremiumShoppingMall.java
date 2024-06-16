public class PremiumShoppingMall extends ShoppingMall {

  public PremiumShoppingMall(int size) {
    super(size);
  }

  public Boolean checkOrderAvailability(Product product) {
    System.out.println(product.getName() + " 구매 여부 : ");
    if (product.getStock() >= 10) {
      return true;
    }
    return false;
  }
}
