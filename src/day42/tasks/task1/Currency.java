package day42.tasks.task1;

public enum Currency {
    USD("$"), EU("€");

    private String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }

}
