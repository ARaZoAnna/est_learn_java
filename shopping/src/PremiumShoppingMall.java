public class PremiumShoppingMall extends ShoppingMall {

  private Product[] arryProducts;
  public PremiumShoppingMall(int size) {
    super(size);
    this.arryProducts = super.getProducts();
  }

  @Override
  public Boolean checkOrderAvailability() {
      int sumStock = 0;
      for(int i = 0; i < arryProducts.length; i++){
        sumStock += arryProducts[i].getStock();
      }

    System.out.println("구매 여부 : ");
      if(sumStock >= 10){
        return true;
      } else{
        return false;
      }
  }
}
