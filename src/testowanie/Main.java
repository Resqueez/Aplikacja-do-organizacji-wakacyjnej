package testowanie;

public class Main {

    public static void main(String[] args) {

        Samochod samochod = new Samochod("Fiat",2000);

        System.out.println(samochod.marka);
        System.out.println(samochod.rocznik);

        System.out.println(samochod.silnikWlacz());

    }
}
