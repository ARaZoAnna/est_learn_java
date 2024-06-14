public class Junior {
    int limit;

    public Junior(){
        super();
        this.limit = 10;
    }

    public void takeABreak(int stress) throws InsufficientBalanceException{
        if (stress > this.limit){
            throw new InsufficientBalanceException("이제 쉴 시간이야");
        }
        System.out.println("현재 스트레스 정도: " + stress);
    }
}
