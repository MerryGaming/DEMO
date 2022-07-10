package publications.bookmanipulation;

import publications.Book;

import java.util.ArrayList;
import java.util.List;

public class Search {


    public void outputBook500()
    {
        List<Book> listBook = new ArrayList<Book>();
        for (Book bk: listBook)
        {
            if(bk.getNumberpages() > 500)
            {
                System.out.println("Sách có số trang lớn hơn 500 là: " + bk.getName());
            }
        }
        System.out.println("\n------------------------------\n");
        //return (Book) listBook;
    }
}
