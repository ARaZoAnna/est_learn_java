public class Clothing extends Product{
    private String size;

    public Clothing(String name, int price, int stock, String size) {
        super(name, price, stock);
        this.size = size;
    }

    @Override
    public int calculatePrice(){
        //L사이즈 이상이면 10% 가격을 추가해서 반환한다
        if(this.size == "L"){
            return (int)(getPrice() * 1.1);
        }
        else if(this.size == "XL"){
            return (int)(getPrice() * 1.1);
        }
        else if(this.size == "XXL"){
            return (int)(getPrice() * 1.1);
        }
        return getPrice();
    }
}
