import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by po09682 on 08/10/2018.
 */
public class ShoppingBasketTest {

    @Test
    public void testCalculateBasketPrice(){
        final ShoppingBasket basket = new ShoppingBasket();

        // basket1
        basket.addItem(BasketItem.APPLE);
        basket.addItem(BasketItem.BANANA);
        assertEquals(0.55, basket.calculateBasketPrice());

        // basket2
        basket.removeAllItems();
        basket.addItem(BasketItem.APPLE);
        basket.addItem(BasketItem.BANANA);
        basket.addItem(BasketItem.MELON);
        assertEquals(1.05, basket.calculateBasketPrice());

        // basket3
        basket.removeAllItems();
        basket.addItem(BasketItem.APPLE);
        basket.addItem(BasketItem.MELON);
        basket.addItem(BasketItem.MELON);
        assertEquals(0.85,basket.calculateBasketPrice());

        // basket4
        basket.removeAllItems();
        basket.addItem(BasketItem.MELON);
        basket.addItem(BasketItem.MELON);
        basket.addItem(BasketItem.MELON);
        assertEquals(1.00,basket.calculateBasketPrice());

        // basket5
        basket.removeAllItems();
        basket.addItem(BasketItem.APPLE);
        basket.addItem(BasketItem.LIME);
        basket.addItem(BasketItem.LIME);
        assertEquals(0.65,basket.calculateBasketPrice());

        // basket6
        basket.removeAllItems();
        basket.addItem(BasketItem.APPLE);
        basket.addItem(BasketItem.LIME);
        basket.addItem(BasketItem.LIME);
        basket.addItem(BasketItem.LIME);
        assertEquals(0.65,basket.calculateBasketPrice());

        // basket7
        basket.removeAllItems();
        basket.addItem(BasketItem.APPLE);
        basket.addItem(BasketItem.LIME);
        basket.addItem(BasketItem.LIME);
        basket.addItem(BasketItem.LIME);
        basket.addItem(BasketItem.LIME);
        basket.addItem(BasketItem.LIME);
        assertEquals(0.95,basket.calculateBasketPrice());

        // basket8
        basket.removeAllItems();
        basket.addItem(BasketItem.MELON);
        basket.addItem(BasketItem.MELON);
        basket.addItem(BasketItem.MELON);
        basket.addItem(BasketItem.MELON);
        basket.addItem(BasketItem.LIME);
        basket.addItem(BasketItem.LIME);
        basket.addItem(BasketItem.LIME);
        basket.addItem(BasketItem.LIME);
        basket.addItem(BasketItem.LIME);
        basket.addItem(BasketItem.LIME);
        basket.addItem(BasketItem.LIME);
        basket.addItem(BasketItem.LIME);
        basket.addItem(BasketItem.LIME);
        basket.addItem(BasketItem.LIME);
        assertEquals(2.05,basket.calculateBasketPrice());
    }
}
