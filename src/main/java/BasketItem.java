public enum BasketItem {
    APPLE(0.35),
    BANANA(0.20),
    MELON(0.50),
    LIME(0.15);

    private double basketItem;

    BasketItem(final double basketItem) {
        this.basketItem = basketItem;
    }

    public double getPrice() {
        return this.basketItem;
    }
}
