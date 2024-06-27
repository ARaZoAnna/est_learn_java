public class Book<T> {
    private String title;
    private String author;
    private T identifier;

    public Book(String title, String author, T identifier) {
        this.title = title;
        this.author = author;
        this.identifier = identifier;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public T getIdentifier() {
        return identifier;
    }

    @Override
    public boolean equals(Object o){
        Book<T> b2 = (Book<T>) o;
        if (this.title.equals(b2.getTitle()) && this.author.equals(b2.getAuthor()) && identifier.equals(b2.getIdentifier())){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return title + " " + author + " " + identifier;
    }
}
