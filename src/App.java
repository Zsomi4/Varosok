import java.util.Scanner;

public class App {
    static final int MAX_VAROS = 5;
    public static void main(String[] args) throws Exception {
        System.out.println("Gubis Zsombor Dániel, 2022.03.16");
        String[] tomb = beker();
        kiir(tomb);
    }
    public static String[] beker() {
        Scanner scan = new Scanner(System.in);
        String[] varosok = new String[MAX_VAROS];
        int i = 0;

        System.out.println("Maximum ennyi város tárolható: " + MAX_VAROS);
        String varos;
        do {
            if(i < MAX_VAROS) {
                System.out.print("Város: ");
                varos = scan.nextLine();
                if(!varos.equalsIgnoreCase("vege")) {
                varosok[i] = varos;
                i++;
                }
            
            } else {
                System.out.println("Nincs több helye.");
                System.out.println("Folytatáshoz Enter.");
                varos = "vege";
            }
        }while(!varos.equals("vege"));
            return varosok;
    }

    public static void kiir(String[] tomb) {
        for (int i = 0; i < 5; i++) {
            System.out.print(tomb[i] + " ");
        }            
    }
}
