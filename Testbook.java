package Lab3;
import java.lang.*;
public class Testbook {
    public static void main(String[] args) {
        Book b1 = new Book("Оскар Уайльд","Портрет Дориана Грея", 352 ,354);
        Book b2 = new Book("Джордж Оруэлл","1984",546,230);
        Book b3 = new Book("Анджей Сапковский","Ведьмак",6142,1834);
        Book b4 = new Book("Говард Филлипс Лавкрафт","Цвет из иных миров",54,145);
        b1.GetPrice();
        b2.GetPrice();
        b3.GetPrice();
        b4.GetPrice();
    }
}