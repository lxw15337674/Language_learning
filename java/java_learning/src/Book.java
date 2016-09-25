/**
 * Created by 40417 on 2016/9/25 0025.
 */
public class Book {
    private String name;
    public String getName(){
        int id = 0;
        setName("java");
        return id + this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Book getBook(){
        return this;
    }
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.getName());
        System.out.println(book.getBook());
    }
}
