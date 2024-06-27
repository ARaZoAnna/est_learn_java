import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T>{
    private List<Book<T>> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book<T> book) {
        this.books.add(book);
    }

    @Override
    public void removeBook(Book<T> book) {

        this.books.remove(book);
        /*for(int i = 0; i<books.size(); i++){
            if(books.get(i).equals(book)){

                this.books.remove(book);//삭제 안될거 같음
            }
        }*/


    }

    @Override
    public List<Book<T>> searchByTitle(String title) {
        List<Book<T>> searchingTitle = new ArrayList<>();
        //리스트가 비어있다면
        if (books.isEmpty()){
            System.out.println("BookShelf가 비어있습니다");
        }else{
            //대문자로 변환하여 비교한다
            String upperTitle = title.toUpperCase();
            for(int i = 0; i < books.size(); i++){
                //대문자로 변환하여 비교한다
                String upperBooksTitle = books.get(i).getTitle().toUpperCase();
                //부분 일치하는 제목도 검색 결과에 포함하기 위해 contains함수 사용
                if(upperBooksTitle.contains(upperTitle)){
                    searchingTitle.add(books.get(i));
                }
            }
        }
        return searchingTitle;
    }

    @Override
    public List<Book<T>> searchByAuthor(String author) {
        List<Book<T>> searchingAuthor = new ArrayList<>();
        //리스트가 비어있다면
        if (books.isEmpty()){
            System.out.println("BookShelf가 비어있습니다");
        }else {
            //대문자로 변환하여 비교한다.
            String upperAuthor = author.toUpperCase();
            for(int i = 0;i<books.size(); i++){
                //대문자로 변환하여 비교한다
                String upperBooksAuthor = books.get(i).getAuthor().toUpperCase();
                //부분 일치하는 저자도 검색 결과에 포함하기 위해 contains함수 사용
                if(upperBooksAuthor.contains(upperAuthor)){
                    searchingAuthor.add(books.get(i));
                }
            }
        }
        return searchingAuthor;
    }
}
