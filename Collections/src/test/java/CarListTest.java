import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarListTest {
    private CarList carList;
    @Before
    public void setUp() throws Exception {
        carList = new CarArrayList();
        for (int i = 0; i <100; i++) {
            carList.add(new Car("Brand"+i,i));
        }
    }
    @Test
    public void whenAdded100ElementsResultMustBe100(){
        assertEquals(100, carList.size());
    }
    @Test
    public void whenRemovedElementByIndexResultMustBeDecreased(){
        assertTrue(carList.removeAt(10));
        assertEquals(99, carList.size());
    }
    @Test
    public void whenRemovedElementResultMustBeDecreased(){
        Car car = new Car("Toyota", 15);
        carList.add(car);
        assertEquals(101, carList.size());
        assertTrue(carList.remove(car));
        assertEquals(100, carList.size());
    }
    @Test
    public void whenRemovedNonExistentElementResultMustBeFalse(){
        Car car = new Car("Toyota", 15);
        assertFalse(carList.remove(car));
        assertEquals(100, carList.size());
    }
    @Test
    public void whenListClearedResultMusBe0(){
        carList.clear();
        assertEquals(0, carList.size());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIndexOutOfBoundResultMustBeException(){
        carList.get(100);
    }
    @Test
    public void methodGetRightValue(){
        Car car = carList.get(0);
        assertEquals("Brand0", car.getBrand());
    }
    @Test
    public void insertIntoMiddlePosition(){
        Car car = new Car("BMW", 1);
        carList.add(car, 50);
        Car carFromList = carList.get(50);
        assertEquals("BMW", carFromList.getBrand());
    }
    @Test
    public void insertIntoFirstPosition(){
        Car car = new Car("BMW", 1);
        carList.add(car, 0);
        Car carFromList = carList.get(0);
        assertEquals("BMW", car.getBrand());
    }
    @Test
    public void insertIntoLastPosition(){
        Car car = new Car("Yaz", 5);
        carList.add(car, 100);
        Car carFromList = carList.get(100);
        assertEquals("Yaz", carFromList.getBrand());
        assertEquals(5, carFromList.getNumber());
    }

}
