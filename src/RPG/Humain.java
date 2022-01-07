package RPG;

public class Humain extends Personnage{

    private int age;
    private String sex;


    public Humain(String nom, int age, String sex){
        super(nom);
        this.age = age;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
