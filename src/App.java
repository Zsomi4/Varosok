import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Gubis Zsombor Dániel, 2022.03.16");
        beker();
    }
    public static void beker() {
        Scanner scan = new Scanner(System.in);
        final int MAX_VAROS = 50;
        String[] varosok = new String[MAX_VAROS];
        int i = 0;
        String varos;
        do {
            System.out.print("Város: ");
            varos = scan.nextLine();
            if(!varos.equalsIgnoreCase("vege")) {
                varosok[i] = varos;
            }
        }while(!varos.equals("vege"));
    }
}
