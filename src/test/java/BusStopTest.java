import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;
    Person person1;

    @Before
    public void before(){
        busStop = new BusStop("Ocean Terminal");
        person = new Person();
        person1 = new Person();
    }

    @Test
    public void hasPassengerInQueue(){
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        assertEquals(3, busStop.queueCount());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person1);
        busStop.removePersonFromQueue();
        assertEquals(1, busStop.queueCount());
    }


}
