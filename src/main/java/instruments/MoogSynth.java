package instruments;

import behaviours.IElectric;
import behaviours.IPlay;
import behaviours.ISell;

public class MoogSynth extends Instrument implements IPlay, IElectric, ISell {

    private int keyNumber;
    private double buyingPrice;
    private double sellingPrice;
    private boolean pluggedIn;

    public MoogSynth(String colour, InstrumentType instrumentType, int keyNumber, double buyingPrice, double sellingPrice) {
        super(colour, instrumentType);
        this.keyNumber = keyNumber;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.pluggedIn = false;
    }

    public void plug() {
        if (pluggedIn == false){
            pluggedIn = true;
        }
    }

    public void unplug() {
        if (pluggedIn != true){
            pluggedIn = false;
        }
    }

    public String play() {
        if (pluggedIn == false){
            return "*click*";
        } else {
            return "bowowowowow";
        }
    }

    public String getDescription() {
        return "a beautiful new moog synthesizer";
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }

    public int getKeyNumber() {
        return keyNumber;
    }

    public boolean getPluggedInStatus() {
        return pluggedIn;
    }
}
