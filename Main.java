/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.setname("Frank");
        hero1.setgender("male");
        hero1.setsign("Aries");
        hero1.setheight("174");
        hero1.setage("17");
        hero1.showinfo();
        System.out.println();
        Hero hero2 = new Hero();
        hero2.setname("Jack");
        hero2.setgender("male");
        hero2.setsign("Leo");
        hero2.setheight("180");
        hero1.setage("22");
        hero2.showinfo();
        System.out.println();
        Hero hero3 = new Hero();
        hero3.setname("Joker");
        hero3.setgender("male");
        hero3.setsign("Aries");
        hero3.setheight("188");
        hero3.setage("40");
        hero3.showinfo();
        System.out.println();
    }
}