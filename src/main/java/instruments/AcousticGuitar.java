package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class AcousticGuitar extends Instrument implements ISell, IPlay {

    private int strings;

    public AcousticGuitar(String colour, InstrumentType instrumentType, int strings) {
        super(colour, instrumentType);
        this.strings = strings;
    }

    public int getStrings(){
        return strings;
    };

    public String play() {
        return "dling!";
    }

    public double calculateMarkup(double buyingPrice, double sellingPrice) {
        return 0;
    }
}
