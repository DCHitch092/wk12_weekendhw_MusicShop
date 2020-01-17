package shop;

import behaviours.ISell;
import instruments.MoogSynth;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return new ArrayList<ISell>(stock);
    }

    public void addStock(ISell item) {
        stock.add(item);
    }

    public void removeStock(ISell item) {
        stock.remove(item);
    }

    public double calculateStockTotalProfit() {
        double profit = 0;
        for(ISell item : stock){
            profit += item.calculateMarkup();
        }

        return profit;
    }
}
