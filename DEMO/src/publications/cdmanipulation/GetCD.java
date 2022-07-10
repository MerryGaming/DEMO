package publications.cdmanipulation;

import publications.Book;
import publications.CD;

import java.util.ArrayList;
import java.util.List;

public class GetCD {
    public void outputCD()
    {
        List<CD> listCD = new ArrayList<CD>();
        System.out.println("\n\nDanh sach dia CD: ");
        for (CD dia: listCD)
        {
            System.out.println("Ten CD: " + dia.getName());
            System.out.println("Gia thanh CD: " + dia.getPrice());
            System.out.println("Thoi gian cua CD: " + dia.getMinutes());
            System.out.println("------------------------------");
        }

        //return (CD) listCD;
    }
}
