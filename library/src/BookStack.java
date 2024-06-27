import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {
    private Stack<Book<T>> books;

    public BookStack() {
        this.books = new Stack<>();
    }

    public void pushBook(Book<T> book){
        books.push(book);
    }
    public Book<T> popBook() throws EmptyStackException{
        Book<T> tempBook = null;
        try{
            tempBook = books.pop();
        }catch (EmptyStackException e){
            System.out.println("Stack이 비어있어요");
        }
        return tempBook;

    }
    public Book<T> peekBook() throws EmptyStackException{
        Book<T> tempBook = null;
        try{
            tempBook = books.peek();

        }catch (EmptyStackException e){
            System.out.println("Stack이 비어있어요");
        }
        return tempBook;

    }
    public boolean isEmpty(){
        if(books.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
