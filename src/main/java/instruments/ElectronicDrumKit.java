package instruments;

import behaviours.IElectric;
import behaviours.IPlay;
import behaviours.ISell;

public class ElectronicDrumKit extends Instrument implements IElectric, IPlay, ISell {

    private boolean pluggedIn;
    private double buyingPrice;
    private double sellingPrice;
    private int padNumbers;

    public ElectronicDrumKit(String colour, InstrumentType instrumentType, int padNumbers, double buyingPrice, double sellingPrice) {
        super(colour, instrumentType);
        this.pluggedIn = false;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.padNumbers = padNumbers;

    }

    public void plug() {
        if(pluggedIn == false){
            pluggedIn = true;
        }
    }

    public void unplug() {
        if(pluggedIn == true){
            pluggedIn = false;
        }
    }

    public String play() {
        if (pluggedIn == true){
            return "DOOF!";
        } else {
            return "tft";
        }
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

    public int getPadNumbers() {
        return padNumbers;
    }
}
