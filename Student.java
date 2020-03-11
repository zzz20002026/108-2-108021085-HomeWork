/**
 * student
 */
public class Student {

    private String Name , Id , Gender , Age , Sign;
    
    public void setName(String newName){
        this.Name = newName;
    }
    public String getName(){
        return Name;
    }
    public void setId(String newId){
        this.Id = newId;
    }
    public String getId(){
        return Id;
    }
    public void setGender(String newGender){
        this.Gender = newGender;
    }
    public String getGender(){
        return Gender;
    }
    public void setAge(String newAge){
        this.Age = newAge;
    }
    public String getAge(){
        return Age;
    }
    public void setSign(String newSign){
        this.Sign = newSign;
    }
    public String getSign(){
        return Sign;
    }
    public void setStudent(String name,String Id,String Gender,String Age,String Sign){
        this.Name = Name;
        this.Id = Id;
        this.Gender = Gender;
        this.Age = Age;
        this.Sign = Sign;
    }
    public void showinfo(){
        System.out.println("Name:"+Name);
        System.out.println("Id:"+Id);
        System.out.println("Gender:"+Gender);
        System.out.println("Age:"+Age);
        System.out.println("Sign:"+Sign);
    }
}