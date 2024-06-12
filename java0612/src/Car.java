public class Car {
    private int speed;
    private int gear;

    public int getGear() {
        return gear;
    }

    public String getWheel() {
        return Wheel;
    }

    public int getCc() {
        return cc;
    }

    public String getLogo() {
        return logo;
    }

    public String getEngine() {
        return engine;
    }

    private String Wheel;
    private int cc;
    private String logo;
    private String engine;

    public double getSpeed(){
        return this.speed * 1.6;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setWheel(String wheel) {
        Wheel = wheel;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Car(){
        this.speed = 0;
        this.gear = 1;
    }
    public void setSpeed(int speed){
        this.speed = speed;
        if (this.speed < 0){
            this.speed = 0;
            this.gear =1;
        }
        else if (this.speed <= 30){
            this.gear = 1;
        }
        else if(this.speed <= 60){
            this.gear = 2;
        }
        else if(this.speed <= 90){
            this.gear = 3;
        }
        else {
            this.speed = 90;
            this.gear = 3;
        }
    };
    public void checkSpeed(){
        System.out.println("스피드: " + this.speed);
        System.out.println("기어: " + this.gear);
    }

}
