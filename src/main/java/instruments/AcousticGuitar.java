package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class AcousticGuitar extends Instrument implements ISell, IPlay {

    private int strings;
    private double buyingPrice;
    private double sellingPrice;


    public AcousticGuitar(String colour, InstrumentType instrumentType, int strings, double buyingPrice, double sellingPrice) {
        super(colour, instrumentType);
        this.strings = strings;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public int getStrings(){
        return strings;
    };

    public String play() {
        return "dling!";
    }

    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
