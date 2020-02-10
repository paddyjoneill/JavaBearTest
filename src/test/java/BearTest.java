import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    private Bear bear;

    @Before
    public void before() {
        bear = new Bear("Bob", 1, 85.72);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", bear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(1, bear.getAge());
    }

    @Test
    public void hasWeight(){
        assertEquals(85.72, bear.getWeight(), 0.01);
    }

    @Test
    public void bear_ready_to_hibernate_if_weight_80_or_more(){
        assertEquals(true, bear.canHibernate());
    }

    @Test
    public void bear_not_ready_to_hibernate_if_weight_less_than_80(){
        Bear skinnyBear = new Bear("bob",1,75.23);
        assertEquals(false, skinnyBear.canHibernate());
    }

}
