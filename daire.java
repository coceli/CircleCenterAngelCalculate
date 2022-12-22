import java.util.Scanner;
public class daire {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Yarı Çapı Giriniz : ");
        int r = input.nextInt();
        System.out.print("Merkez Açı Ölçüsü Giriniz :");
        int alfa =input.nextInt();

        double pi = 3.14;
        double alan = (pi*(r*r)*alfa) /360 ;

        System.out.println("Daire Dilimin Alanı : " + alan);

    }
}