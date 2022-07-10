package publications.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class BookManagement {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String ANSWER_ENTER_QUESTION_IS_NO = "no";

    private static BookManagement bookManagementInstance = new BookManagement();

    private List<Book> books;

    private BookManagement() {
        this.books = new ArrayList<>();
    }

    public static BookManagement getBookManagementInstance() {
        return bookManagementInstance;
    }

    public void enterBook() {
        boolean checkEnterContinue = true;
        do{
            var book = new Book();
            book.enter();
            books.add(book);

            System.out.print("Ban muon nhap tiep khong?(Nhap NO de ket thuc!!!)");
            String answer = SCANNER.nextLine();
            if(answer.equalsIgnoreCase(ANSWER_ENTER_QUESTION_IS_NO)) {
                checkEnterContinue = false;
            } else {
                System.out.println("------------------------------");
            }
        }while(checkEnterContinue);

    }

    public void print() {
        System.out.println(books);
    }

    public void search()
    {

    }

}
