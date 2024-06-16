import java.beans.PropertyDescriptor;

public abstract class ShoppingMall {

  private Product[] products;

  public ShoppingMall(int ArraySize) {
    products = new Product[ArraySize];
  }

  // 제품 추가(제품 객체와 인덱스를 매개변수로)
  public void controlProduct(Product product) {
    int originArrayLen = this.products.length;

    for(int i = 0; i< originArrayLen; i++){
      if(this.products[i] == null){
        this.products[i] = product;
        System.out.println("배열에 " + product.getName() + "을 담았습니다");
        return;
      }
    }
      // 제품 추가 시 배열이 꽉 찼다면 기존 배열 크기의 2배로 새로운 배열을 생성하고 기존 상품들을 복사한다
      Product[] tmp = this.products;
    System.out.println("배열을 2배로 늘렸습니다!");
      this.products = new Product[this.products.length * 2];
      for (int idx = 0; idx < originArrayLen; idx++) {
        this.products[idx] = tmp[idx];
      }
      this.products[originArrayLen] = product;
      System.out.println("새 배열에 " + product.getName() + "을 담았습니다");
      return;

  }

  // 제품 삭제(제품 객체를 넣어서 삭제하기)
  public void controlProduct(int index, Product product) {
    //인덱스로 삭제하는 방법
      try{
        //배열 안에 객체가 있는지 또는 정확한 위치에 있는지 확인해 준다.
          if(this.products[index].getName().equals(product.getName())){
            this.products[index] = null;
            System.out.println(product.getName() + "을 삭제했습니다!");
            //삭제 후 배열 이동
            for(int idx = index+1; idx < this.products.length; idx++){
              this.products[idx-1] = this.products[idx];
              //다음 배열이 null이면 반복문 종료
              if(this.products[idx] == null){
                return;
              }
              //마지막 배열의 값을 null로 바꾼다.
              if(idx == this.products.length-1){
                this.products[idx] = null;
              }
            }
            System.out.println("삭제 실패! 정확한 정보를 입력하세요");
            return;
          }


            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("삭제할 수 없어요! 인덱스 범위를 벗어났어요");
                 }
    /*for (int idx = 0; idx < this.products.length; idx++) {
      if (this.products[idx].equals(product)) {
        this.products[idx] = null;
        System.out.println(product.getName() + "를 삭제했습니다");
        return;
      }
    }
    System.out.println("삭제 실패! 배열 안에 " + product.getName() + "가 없습니다");
    return;*/
  }

  // 제품 목록 출력 매개변수 없음
  public void controlProduct() {
    System.out.println("제품 목록 출력");
    for (int idx = 0; idx < this.products.length; idx++) {
      if(this.products[idx] == null){
        return;
      }
      System.out.println((idx+1)+"번 " + products[idx].getName());
    }
  }

  public abstract Boolean checkOrderAvailability(Product product);
}
