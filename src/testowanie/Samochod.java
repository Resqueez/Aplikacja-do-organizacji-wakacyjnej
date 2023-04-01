package testowanie;

public class Samochod {
    String marka;
    int rocznik;

    public Samochod(String marka, int rocznik) {
        this.marka = marka;
        this.rocznik = rocznik;
    }

    public String silnikWlacz(){
        return "Uruchamianie silnika";
    }
}
