public class Main2 {

    public static void main(String[] args) {
        Chess chess1 = new Chess();
        chess1.setname("Chess");
        chess1.setcolor("black and red");
        chess1.setamount("32");
        chess1.setmaterial("wood");
        chess1.setdevelopment("Sengoku");
        chess1.showinfo();
        System.out.println();
        Chess chess2 = new Chess();
        chess2.setname("Chess");
        chess2.setcolor("white and black");
        chess2.setamount("32");
        chess2.setmaterial("wood");
        chess1.setdevelopment("India");
        chess2.showinfo();
        System.out.println();
        Chess chess3 = new Chess();
        chess3.setname("Checkers");
        chess3.setcolor("green and red and yellow");
        chess3.setamount("256");
        chess3.setmaterial("plastic");
        chess3.setdevelopment("China");
        chess3.showinfo();
        System.out.println();
    }
}