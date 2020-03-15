/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("The Mamba Mentality: How I Play");
        book1.setAuthor("Andrew D. Bernstein");
        book1.setPages("208 pages");
        book1.setISBN("9780374201234");
        book1.setPublisher("McD");
        book1.showinfo();
        System.out.println();
        Book book2 = new Book();
        book2.setName("Thirteen Reasons Why");
        book2.setAuthor("Asher, Jay");
        book2.setPages("320 pages");
        book2.setISBN("9780451478290");
        book2.setPublisher("Razorbill");
        book2.showinfo();
        System.out.println();
        Book book3 = new Book();
        book3.setName("Less");
        book3.setAuthor("Greer, Andrew Sean");
        book3.setPages("272 pages");
        book3.setISBN("9780316316132");
        book3.setPublisher("Back Bay Books");
        book3.showinfo();
    }
}