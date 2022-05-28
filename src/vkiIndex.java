import java.util.Scanner;
public class vkiIndex {
    public static void main(String[] args) {
        double boy,kilo,vki;
        Scanner imput=new Scanner(System.in);
        System.out.print("Lutfen Boy Uzunlugunuzu Girin(m) : ");
        boy=imput.nextDouble();
        System.out.print("Lutfen Kutlenizi Girin (kg) : ");
        kilo= imput.nextDouble();
        vki=kilo/(boy*boy);
        System.out.print("Vucut Kitle Endeksiniz : " + vki);

    }
}
