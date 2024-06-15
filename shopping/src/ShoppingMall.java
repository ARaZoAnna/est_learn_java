import java.beans.PropertyDescriptor;

public abstract class ShoppingMall {

  private Product[] products;

  public ShoppingMall(int ArraySize) {
    products = new Product[ArraySize];
  }

  // 제품 추가(제품 객체와 인덱스를 매개변수로)
  public void controlProduct(Product product, int no) {
    // 제품 추가 시 배열이 꽉 찼다면 기존 배열 크기의 2배로 새로운 배열을 생성하고 기존 상품들을 복사한다
    if (no > this.products.length) {
      Product[] tmp = this.products;
      this.products = new Product[this.products.length * 2];
      for (int idx = 0; idx < tmp.length; idx++) {
        this.products[idx] = tmp[idx];
      }
    }

    this.products[no - 1] = product;
    System.out.println(no + "번에 제품 " + product.getName() + "을 담았습니다");
  }

  // 제품 삭제(제품 객체를 넣어서 삭제하기)
  public void controlProduct(Product product) {
    //인덱스로 삭제하는 방법
      /*try{
                this.products[idx] = null;
                System.out.println(this.products[idx].getName() + "을 삭제했습니다!");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("삭제할 수 없어요! 인덱스 범위를 벗어났어요");
                 }
    */
    for (int idx = 0; idx < this.products.length; idx++) {
      if (products[idx].equals(product)) {
        products[idx] = null;
        System.out.println(product.getName() + "를 삭제했습니다");
        return;
      }
    }
    System.out.println("삭제 실패! 배열 안에 " + product.getName() + "가 없습니다");
    return;
  }

  // 제품 목록 출력 매개변수 없음
  public void controlProduct() {
    System.out.println("제품 목록 출력");
    for (int idx = 0; idx < this.products.length; idx++) {
      System.out.println((idx+1)+"번 " + products[idx].getName());
    }
  }

  public abstract Boolean checkOrderAvailability(Product product);
}
