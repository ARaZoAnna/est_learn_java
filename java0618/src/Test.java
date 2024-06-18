public class Test {
  public static void main(String[] args) {
    ChildProduct<Tv, String, String> product = new ChildProduct();
    product.setKind(new Tv());
    product.setModel("smart TV");
    product.setCompany("Samsung");
//Tv[100]
    StorageImpl<Tv> tvStorage = new StorageImpl<Tv>(100);
    tvStorage.add(new Tv(),0);
  }
}
