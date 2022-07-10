package publications.cdmanipulation;

import publications.Book;
import publications.CD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetCD {

    public void inputCD()
    {

        List<CD> listCD = new ArrayList<CD>();
        boolean qs = true;
        do{
            Scanner scan1 = new Scanner(System.in);
            CD dia = new CD();

            System.out.printf("Nhap ten an pham: ");
            dia.setName(scan1.nextLine());

            System.out.printf("Nhap gia thanh cua an pham: ");
            dia.setPrice(Float.parseFloat(scan1.nextLine()));

            System.out.printf("Nhap so phut cua dia CD: ");
            dia.setMinutes(Integer.parseInt(scan1.nextLine()));


            System.out.print("Ban muon nhap tiep khong?(Nhap NO de ket thuc!!!)");
            String traloi;
            Scanner sc = new Scanner(System.in);
            traloi = sc.nextLine();
            listCD.add(dia);

            if(traloi.equalsIgnoreCase("no")) {
                qs = false;
            } else {
                System.out.println("------------------------------");
            }
        }while(qs != false);

        //return (CD) listCD;
    }
}
