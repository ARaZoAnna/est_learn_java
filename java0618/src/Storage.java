public interface Storage <T>{
    //배열에 add 한다
    void add(T item, int index);
    //배열에서 get한다
    T get(int index);

}
