import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by po09682 on 08/10/2018.
 */
public class ShoppingBasket {

    // shopping basket
    private final List<BasketItem> shoppingBasket = new ArrayList<BasketItem>();

    // basket items count
    private int apples = 0;
    private int bananas = 0;
    private int melons = 0;
    private int limes = 0;

    // add an item to the basket
    public void addItem(final BasketItem basketItem){
        this.shoppingBasket.add(basketItem);
    }

    // remove all items from the basket
    public void removeAllItems() {
        this.shoppingBasket.clear();
        this.apples = 0;
        this.bananas = 0;
        this.melons = 0;
        this.limes = 0;
    }

    // scan the basket content to assess how many of each item are in the list
    private void scanBasketContents() {
        final Iterator<BasketItem> basketIter = this.shoppingBasket.iterator();

        while(basketIter.hasNext()) {
            final BasketItem item = basketIter.next();
            switch (item) {
                case APPLE:
                    apples++;
                    break;
                case BANANA:
                    bananas++;
                    break;
                case MELON:
                    melons++;
                    break;
                case LIME:
                    limes++;
                    break;
            }
        }
    }

    // calculate the price of the contents of the basket
    // @return the price of the contents
    public double calculateBasketPrice(){
        scanBasketContents();

        double basketPrice = 0.0;

        // add apple cost
        basketPrice = BasketItem.APPLE.getPrice() * apples;

        // add the bananas
        basketPrice += BasketItem.BANANA.getPrice() * bananas;

        // calculate and add the melon cost taking into account melons are buy 1 get 1 free
        final int offerMelons = melons/2;
        final int additionalMelons = melons%2;
        basketPrice += BasketItem.MELON.getPrice() * (offerMelons+additionalMelons);

        // calculate and add the lime cost taking into account limes are 3 for the price of 2
        final int offerLimes = (limes/3)*2;
        final int additionalLimes = limes%3;
        basketPrice += (BasketItem.LIME.getPrice() * (offerLimes+additionalLimes));

        return new BigDecimal(basketPrice).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
