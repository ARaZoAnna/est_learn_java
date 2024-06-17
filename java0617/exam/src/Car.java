public class Car<T> {
    private T carName;
    public void setCar(T carName){
        this.carName = carName;
    }
    public T getCar(){
        return this.carName;
    }
}
