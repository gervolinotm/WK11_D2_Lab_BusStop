import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination){
        this.destination = destination;
        this.capacity = 10;
        this.passengers = new ArrayList<Person>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        this.passengers.add(person);
    }

    public void removePassenger(Person person) {
        this.passengers.remove(person);
    }

    public void pickUpPassenger(BusStop busStop) {
        if (this.capacity > this.passengers.size() && busStop.queueCount() != 0){
            Person person = busStop.removePersonFromQueue();
            this.passengers.add(person);
        }

    }
}
