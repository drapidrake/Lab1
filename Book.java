package Lab3;
import java.lang.*;
public class Book {
    private String Author;
    private String name;
    private int pages;
    private int Price;

    public Book(String author,String name,  int pages, int Price) {
        this.name = name;
        Author = author;
        this.pages = pages;
        this.Price = Price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getBasePrice() {
        return Price;
    }

    public void setBasePrice(int basePrice) {
        this.Price = basePrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Author='" + Author + '\'' +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", basePrice=" + Price +
                '}';
    }
    public void GetPrice(){
        System.out.println(" Автор: "+Author+"  Наименование книги: "+name+"  Кол-во стр.: "+pages+"  Цена: "+ Price);
    }
}