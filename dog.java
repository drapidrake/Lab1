package Lab1;
import java.lang.*;
public class dog {
    private String name;
    private int age;

    public dog(String n, int a){
        name = n;
        age = a;
    }

    public dog(String n) {
        name = n;
        age = 0;
    }
    public dog(){
        name = "Собачка";
        age = 0;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void intoHumanAge(){
        System.out.println(name+" Собачий возраст на человеческом:  " +age*7+ " лет");
    }
}