
public class DailyQuiz {
    public static void main(String[] args){

        Junior junior = new Junior();

        try{
            junior.takeABreak(20);
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }

    }
}
