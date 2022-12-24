import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           int n1, n2, select;
        Scanner sc = new Scanner(System.in);
        System.out.print("ilk sayıyı girin :");
        n1 = sc.nextInt();
        System.out.print("ikinci sayıyı girin :");
        n2 = sc.nextInt();

        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.print("Seçiniz : ");
        select = sc.nextInt();

        switch (select){
            case 1:
                System.out.print("Sonuç :"+(n1+n2));
                break;
            case 2:
                System.out.print("Sonuç :"+(n1-n2));
                break;
            case 3:
                System.out.print("Sonuç :"+(n1*n2));
                break;
            case 4:
                System.out.print((n2==0 || n1==0) ? "Sayı 0'a bölünürmü  ? " : "Sonuç :"+(n1/n2));
                break;
            default:
                System.out.println("Hatalı giriş yaptınız, Tekrar deneyiniz!");





        }


    }
}
