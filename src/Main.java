import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdvOran1=0.18, kdvOran2=0.08;
        Scanner klavye=new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        int tutar=klavye.nextInt();
        double sonuc1=tutar+tutar*kdvOran1;
        double sonuc2=tutar+tutar*kdvOran2;
        boolean kosul=tutar>=0 && tutar<=1000;
        double kdv=kosul? sonuc1:sonuc2;
        System.out.println("KDV'li fiyatınız: "+kdv);

    }
}
