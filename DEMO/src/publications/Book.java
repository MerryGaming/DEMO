package publications;


public class Book extends  Publication {
    private int numberpages;

    public Book() {

    }


    public Book(String name, float price, int numberpages) {
        super(name, price);
        this.numberpages = numberpages;
    }


    public int getNumberpages()
    {
        return numberpages;
    }

    public void setNumberpages(int numberpages)
    {
        this.numberpages = numberpages;
    }



}
