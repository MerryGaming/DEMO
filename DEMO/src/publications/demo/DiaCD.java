package publications.demo;

import java.util.Scanner;
import java.util.UUID;

public class DiaCD extends Publication{
    private static final Scanner SCANNER = new Scanner(System.in);
    private String id;
    private String name;
    private String type;
    private long minutes;

    public DiaCD() {
        super(20220710);
        this.id = UUID.randomUUID().toString();
    }

    public DiaCD(String name, String type, long minutes) {
        super();
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.type = type;
        this.minutes = minutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getMinutes() {
        return minutes;
    }

    public void setMinutes(long minutes) {
        this.minutes = minutes;
    }

    public void enterCD()
    {
        System.out.printf("Nhap ten an pham: ");
        this.name = SCANNER.nextLine();

        System.out.printf("Nhap loai cua an pham: ");
        this.type = SCANNER.nextLine();

        System.out.printf("Nhap so phut cua dia CD: ");
        this.minutes = Long.parseLong(SCANNER.nextLine());
    }
}
