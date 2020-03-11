/**
 * Main2
 */
public class Main2 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Frank");
        student1.setId("108021085");
        student1.setGender("male");
        student1.setAge("17");
        student1.setSign("Aries");
        student1.showinfo();
        System.out.println();
        Student student2 = new Student();
        student2.setName("Shark");
        student2.setId("108021160");
        student2.setGender("male");
        student2.setAge("17");
        student2.setSign("Leo");
        student2.showinfo();
        System.out.println();
        Student student3 = new Student();
        student3.setName("Elsa");
        student3.setId("108021184");
        student3.setGender("female");
        student3.setAge("17");
        student3.setSign("Aries");
        student3.showinfo();
    }
}