import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public int queueCount() {
        return this.queue.size();
    }

    public void addPersonToQueue(Person person) {
        this.queue.add(person);
    }

    public Person removePersonFromQueue() {
        return this.queue.remove(0);
    }

//    public Person listAllQueue() {
//        return this.queue;
//    }
}
