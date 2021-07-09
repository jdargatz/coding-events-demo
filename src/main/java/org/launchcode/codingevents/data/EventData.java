package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class EventData {

    //contains static methods and properties
    //single point of truth for how data is stored

    // place to put events
    private static final Map<Integer, Event> events = new HashMap<>();

    // behaviors - get all events
    public static Collection<Event> getAll(){
        return events.values();
        //values on Map
        //Collection is an interface, loops over a collection - extends iterable
    }

    // behaviors - get single event
    public static Event getById(int id) {
        //get an event by Id
        return events.get(id);
    }

    // behaviors - add an event
    public static void add(Event event){
        //void - not returning anything
        events.put(event.getId(),event);
    }

    // behaviors - delete an event
    public static void remove(int id) {
        events.remove(id);
    }

}
