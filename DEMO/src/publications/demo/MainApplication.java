package publications.demo;

public class MainApplication {
    public static void main(String[] args) {
        var bookManagement = BookManagement.getBookManagementInstance();
        bookManagement.enterBook();
        bookManagement.print();

        var bookManagement1 = BookManagement.getBookManagementInstance();
        bookManagement1.enterBook();
        bookManagement1.print();
    }
}
