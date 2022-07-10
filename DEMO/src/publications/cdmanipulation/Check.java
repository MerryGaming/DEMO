package publications.cdmanipulation;

import publications.Book;
import publications.CD;

import java.util.ArrayList;
import java.util.List;

public class Check {

    public void checkCD(String name2)
    {
        List<CD> listCD = new ArrayList<CD>();
        for (CD dia: listCD)
        {
            if(dia.getName().equals(name2))
            {
                System.out.printf("Trùng với tên bạn nhập!!");
            }
            else
            {
                System.out.printf("Tên bạn nhập không trùng!!!");
            }
        }
        System.out.println("\n------------------------------\n");
        //return (CD) listCD;
    }
}
