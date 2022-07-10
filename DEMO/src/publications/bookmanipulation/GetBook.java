package publications.bookmanipulation;

import publications.Book;

import java.util.ArrayList;
import java.util.List;

public class GetBook {



    public void outputBook()
    {
        List<Book> listBook = new ArrayList<Book>();
        System.out.println("\n\nDanh sach Book: ");
        for (Book bk: listBook)
        {
            System.out.println("Ten sach: " + bk.getName());
            System.out.println("Gia thanh cuon sach: " + bk.getPrice());
            System.out.println("So trang sach: " + bk.getNumberpages());
            System.out.println("------------------------------");
        }

        //return (Book) listBook;
    }


}
