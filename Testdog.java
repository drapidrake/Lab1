package Lab1;
import java.lang.*;
public class Testdog {
    public static void main(String[] args) {
        dog d1 = new dog("Игнат",1);
        dog d2 = new dog("Собакин", 5);
        dog d3 = new dog("Владимир");
        dog d4 = new dog("Анастасия");
        d3.setAge(15);
        d4.setAge(7);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
        d4.intoHumanAge();
    }
}