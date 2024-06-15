import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Food extends Product{
    private LocalDate expirationDate;

    public Food(String name, int price, int stock, String expirationDate) {
        super(name, price,stock);
        //입력받은 String 타입의 날짜를 변환한기 위한 형태 정의
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // String 타입의 날짜를 LocalDate로 변환
        this.expirationDate = LocalDate.parse(expirationDate, formatter);
    }
    @Override
    public int calculatePrice(){
        //지금 현재 날짜 생성
        LocalDate todayDate = LocalDate.now();
        //유통기한 지나면 안판다.
        /*if(this.expirationDate.compareTo(todayDate) == -1){
            return 0;
        }*/
        // 현재 날짜와 설정된 유통기한 날짜를 뺀 값
        long daysBetween = this.expirationDate.toEpochDay()-todayDate.toEpochDay() ;

        if(daysBetween < 0){
            return 0;
        }

        else if(daysBetween <= 7){
            return (int)(getPrice() * 0.8);
        }
        return getPrice();
    }
}
