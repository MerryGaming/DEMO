package publications;

import publications.bookmanipulation.GetBook;
import publications.bookmanipulation.Search;
import publications.bookmanipulation.SetBook;
import publications.cdmanipulation.Check;
import publications.cdmanipulation.GetCD;
import publications.cdmanipulation.SetCD;

import java.util.Scanner;

public class MainPublication {
    public static void main(String[] args) {

        SetBook setBook = new SetBook();
        GetBook getBook = new GetBook();
        Search search = new Search();



        System.out.println("Nhap Sach");
        setBook.inputBook();
        getBook.outputBook();


        System.out.println("Sách có số trang >500 la: \n");
        search.outputBook500();


        SetCD setCD = new SetCD();
        GetCD getCD = new GetCD();
        Check check = new Check();


        System.out.println("Nhap dia CD");
        setCD.inputCD();
        getCD.outputCD();

        String name2;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Nhap dia CD cần tìm: ");
        name2 = scan.nextLine();

        check.checkCD(name2);






    }
}
