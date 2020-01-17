package instruments;

public abstract class Instrument {

    private String colour;
    private InstrumentType instrumentType;

    public Instrument(String colour, InstrumentType instrumentType) {
        this.colour = colour;
        this.instrumentType = instrumentType;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
