import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Ocean Terminal");
        busStop = new BusStop("Princes Street");
        person = new Person();
    }

    @Test
    public void sampleTest(){
        assertEquals(bus, bus);
    }

    @Test
    public void busPassengerCount(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(2,bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canPickUpPassengerFromBusStop(){
        busStop.addPersonToQueue(person);
        bus.pickUpPassenger(busStop);
        assertEquals(1, bus.passengerCount());
    }

}
