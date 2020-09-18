package Lab2;
import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(241,321);
        Ball b2 = new Ball(6,1);
        Ball b3 = new Ball(95,11);
        Ball b4 = new Ball(23,34);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        b1.move(340,654);
        b2.move(77,22);
        b3.move(64,32);
        b4.move(465,341);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}