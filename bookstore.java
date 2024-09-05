class Book{
    String title;
    String author;
    int price;

    Book(String title, String author, int price){
        this.title= title;
        this.author= author;
        this.price= price;
    }

    public void displayInfo(){
        System.out.println("Title of book: " + title);
        System.out.println("Title of author: " + author);
        System.out.println("Title of price: " + price);
    }

}

public class bookstore {
    public static void main(String[] args) {

        Book book1 = new Book("book1", "abc", 259);
        book1.displayInfo();
    
    }
}
