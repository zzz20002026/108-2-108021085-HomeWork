/**
 * Book
 */
public class Book {
    private String name , Author , Pages , ISBN , Publisher;
    public Book(){
        System.out.println("Book object has created!");
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return name;
    }
    public void setAuthor(String newAuthor){
        this.Author = newAuthor;
    }
    public String getAuthor(){
        return Author;
    }
    public void setPages(String newPages){
        this.Pages = newPages;
    }
    public String getPages(){
        return Pages;
    }
    public void setISBN(String newISBN){
        this.ISBN = newISBN;
    }
    public String getISBN(){
        return ISBN;
    }
    public void setPublisher(String newPublisher){
        this.Publisher = newPublisher;
    }
    public String getPublisher(){
        return Publisher;
    }
    public void setbook(String name , String Author , String Pages , String ISBN , String Publisher){
        this.name = name;
        this.Author = Author;
        this.Pages = Pages;
        this.ISBN = ISBN;
        this.Publisher = Publisher;
    }
    public void showinfo(){
        System.out.println("Name:"+name);
        System.out.println("Author:"+Author);
        System.out.println("Pages:"+Pages);
        System.out.println("ISBN:"+ISBN);
        System.out.println("Publisher:"+Publisher);
    }
}