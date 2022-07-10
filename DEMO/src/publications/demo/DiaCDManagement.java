package publications.demo;

import publications.CD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiaCDManagement {
    private static final Scanner SCANNER = new Scanner(System.in);



    private static final String ANSWER_ENTER_QUESTION_IS_NO = "no";
    private static final DiaCDManagement diaCDManagementInstane = new DiaCDManagement();
    private List<DiaCD> diaCDS;
    private DiaCDManagement()
    {
        this.diaCDS = new ArrayList<>();
    }

    public static DiaCDManagement getDiaCDManagementInstane()
    {
        return diaCDManagementInstane;
    }

    public void enterCD()
    {
        boolean checkEnterContinue = true;
        do{
            var diacd = new DiaCD();
            diacd.enterCD();
            diaCDS.add(diacd);

            System.out.print("Ban muon nhap tiep khong?(Nhap NO de ket thuc!!!)");
            String answer = new ;

            if(answer.equalsIgnoreCase(ANSWER_ENTER_QUESTION_IS_NO)) {
                qs = false;
            } else {
                System.out.println("------------------------------");
            }
        }while(qs != false);
    }
}
