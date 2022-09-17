import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] sayilar=new int[]{5,9,12,17,23,28,33,37,38};
        System.out.println("aramak istediğiniz sayıyı giriniz");
        Scanner scanner=new Scanner(System.in);
        int arananSayi=scanner.nextInt();
        boolean sayiVar=true;
        for (int sayi:sayilar){
            if (arananSayi==sayi){
                sayiVar=true;
            }
        }
        if (sayiVar){
            System.out.println("aranan sayi mevcut");
        }else {
            System.out.println("aranan sayı mevcut değil");
        }
    }
}