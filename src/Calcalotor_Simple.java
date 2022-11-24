import java.util.Scanner;

public class Calcalotor_Simple
{
    public static void main(String[] args)
    {
        int a; int b; int select; int sum;
        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen Sayıyı Giriniz: ");
        a=input.nextByte();
        System.out.print("Lütfen işlem yapmak istediğiniz ikinci Sayıyı Giriniz: ");
        b=input.nextByte();
        System.out.print("Lütfen çarpma işlemi için 1, Bölme işlemi için 2, Toplamı işlemi için 3, Çıkarma işlemi için 4 rakamını giriniz:  ");
        select= input.nextByte();
        switch (select) {
            case 1:
                sum = a * b;
                System.out.print("İşlemin Sonucu: " + sum);
                break;
            case 2:
                sum = a / b;
                System.out.print("İşlemin Sonucu: " + sum);
                break;
            case 3:
                sum=a+b;
                System.out.print("İşlemin Sonucu: " + sum);
                break;
            case 4:
                sum = a - b;
                System.out.print("İşlemin Sonucu: " + sum);
                break;
            default:
                System.out.print("Lütfen size önerilen rakamlar arasından bir tercih yapınız");
                break;
        }
    }
}
