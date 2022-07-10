package publications.bookmanipulation;

import publications.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetBook {


    public void inputBook()
    {

        List<Book> listBook = new ArrayList<Book>();
        boolean qs = true;
        do{
            Scanner scan1 = new Scanner(System.in);
            Book bk = new Book();

            System.out.printf("Nhap ten an pham: ");
            bk.setName(scan1.nextLine());

            System.out.printf("Nhap author an pham: ");
            bk.setAuthor(scan1.nextLine());

            System.out.printf("Nhap gia thanh cua an pham: ");
            bk.setPrice(Float.parseFloat(scan1.nextLine()));

            System.out.printf("Nhap so trang cua sach: ");
            bk.setNumberpages(Integer.parseInt(scan1.nextLine()));


            System.out.print("Ban muon nhap tiep khong?(Nhap NO de ket thuc!!!)");
            String traloi;
            Scanner sc = new Scanner(System.in);
            traloi = sc.nextLine();
            listBook.add(bk);

            if(traloi.equalsIgnoreCase("no")) {
                qs = false;
            } else {
                System.out.println("------------------------------");
            }
        }while(qs != false);

        //return  ;
    }
}
