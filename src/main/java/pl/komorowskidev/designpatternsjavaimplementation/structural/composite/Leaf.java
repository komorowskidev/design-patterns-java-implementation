package pl.komorowskidev.designpatternsjavaimplementation.structural.composite;

public class Leaf implements Department {

    private String name;

    private int profit;

    public Leaf(String name, int profit){
        this.name = name;
        this.profit = profit;
    }

    @Override
    public int getProfit() {
        return profit;
    }

    @Override
    public String getName() {
        return name;
    }
}
