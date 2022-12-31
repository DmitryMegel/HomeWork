package homeWork.homeWork7.instruments;

public class InstrumentsMain {

    public static void main(String[] args) {
        Instrument[] instruments = {new Guitar(7), new Drum(30), new Tuba(45)};
        for(Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
