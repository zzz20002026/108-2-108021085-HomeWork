public class Chess {

    private String name , color , amount , material , development;

    public void setname(String newname){
        this.name = newname;
    }
    public String getname(){
        return name;
    }
    public void setcolor(String newcolor){
        this.color = newcolor;
    }
    public String getcolor(){
        return color;
    }
    public void setamount(String newamount){
        this.amount = newamount;
    }
    public String getamount(){
        return amount;
    }
    public void setmaterial(String newmaterial){
        this.material = newmaterial;
    }
    public String getmaterial(){
        return material;
    }
    public void setdevelopment(String newdevelopment){
        this.development = newdevelopment;
    }
    public String getdevelopment(){
        return development;
    }
    public void setAll(String name , String color , String amount , String material , String development){
        this.name = name;
        this.color = color;
        this.amount = amount;
        this.material = material;
        this.development = development;
    }
    public void showinfo(){
        System.out.println("name:"+name);
        System.out.println("color:"+color);
        System.out.println("amount:"+amount);
        System.out.println("material:"+material);
        System.out.println("development:"+development);
    }
}