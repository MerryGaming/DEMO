package publications;

public class Publication {
    private String name;
    private float price;

    private String author;

    public Publication() {

    }
    public Publication(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
