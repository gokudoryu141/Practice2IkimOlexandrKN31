package practice.task22;

public class GenreStatus {
    private boolean isOnStock;
    private boolean isOnShelves;
    private boolean requiresPurchase;

    public GenreStatus(boolean isOnRoute, boolean isAvailable, boolean requiresMaintenance) {
        this.isOnStock = isOnRoute;
        this.isOnShelves = isAvailable;
        this.requiresPurchase = requiresMaintenance;
    }

    public boolean isOnStock() {
        return isOnStock;
    }

    public void setOnStock(boolean onStock) {
        isOnStock = onStock;
    }

    public boolean isOnShelves()  {
        return isOnShelves;
    }

    public void setOnShelves(boolean onShelves) {
        isOnShelves = onShelves;
    }

    public boolean RequiresPurchase() {
        return requiresPurchase;
    }

    public void setRequiresPurchase(boolean requiresPurchase) {
        this.requiresPurchase = requiresPurchase;
    }
}