/**
 * Hero
 */
public class Hero {

        private String name , gender , sign , height , age;

        public void setname(String newname){
            this.name = newname;
        }
        public String getname(){
            return name;
        }
        public void setgender(String newgender){
            this.gender = newgender;
        }
        public String getgender(){
            return gender;
        }
        public void setsign(String newsign){
            this.sign = newsign;
        }
        public String getsign(){
            return sign;
        }
        public void setheight(String newheight){
            this.height = newheight;
        }
        public String getheight(){
            return height;
        }
        public void setage(String newage){
            this.age = newage;
        }
        public String getage(){
            return age;
        }
        public void setAll(String name , String gender , String sign , String height , String age){
            this.name = name;
            this.gender = gender;
            this.sign = sign;
            this.height = height;
            this.age = age;
        }
        public void showinfo(){
            System.out.println("name:"+name);
            System.out.println("gender:"+gender);
            System.out.println("sign:"+sign);
            System.out.println("height:"+height);
            System.out.println("age:"+age);
        }
}