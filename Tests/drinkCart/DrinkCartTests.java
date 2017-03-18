package drinkCart;

import org.junit.Assert;
import org.junit.Test;


public class DrinkCartTests {
    @Test
    public void test001_CartStartsEmpty(){
        DrinkCart aCart = new DrinkCart();
        Assert.assertTrue(aCart.isEmpty());
    }

    @Test
    public void test002_AddItemToCart(){
        DrinkCart aCart = new DrinkCart();
        aCart.addDrink("CocaCola 2lts");

        Assert.assertFalse(aCart.isEmpty());
        Assert.assertEquals(1, aCart.quantity());
    }

    @Test
    public void test003_RemoveItemToCart(){
        DrinkCart aCart = new DrinkCart();
        aCart.addDrink("CocaCola 2lts");
        aCart.removeDrink("CocaCola 2lts");

        Assert.assertTrue(aCart.isEmpty());
        Assert.assertEquals(0, aCart.quantity());
    }

}
