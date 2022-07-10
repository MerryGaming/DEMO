package publications.demo;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

public class Book extends Publication implements InputInterface {

    private static final Scanner SCANNER = new Scanner(System.in);
    private String id;
    private String name;
    private String author;
    private int amount;
    private long price;

    public Book() {
        super(20220710);
        this.id = UUID.randomUUID().toString();
    }

    public Book(String name, String author, int amount, long price) {
        super();
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.author = author;
        this.amount = amount;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public void enter() {
//        var book = new Book();
        System.out.printf("Nhap ten an pham: ");
        this.name = SCANNER.nextLine();

        System.out.printf("Nhap author an pham: ");
        this.author = SCANNER.nextLine();

        System.out.printf("Nhap gia thanh cua an pham: ");
        this.amount = Integer.parseInt(SCANNER.nextLine());

        System.out.printf("Nhap so trang cua sach: ");
        this.price = Long.parseLong(SCANNER.nextLine());
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", publicationDate=" + date +
                '}';
    }
}
