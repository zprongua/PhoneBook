package com.zipcodewilmington.phonebook;

import java.lang.reflect.Array;
import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        phonebook = new LinkedHashMap<>();
    }

    public void add(String name, String phoneNumber) {
        phonebook.put(name, Collections.singletonList(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {
        phonebook.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for (String name : phonebook.keySet()) {
            if (phonebook.get(name).contains(phoneNumber)) {
                return name;
            }
        }
        return "Not found";
    }

    public List<String> getAllContactNames() {
        List<String> ls = new ArrayList<>(phonebook.keySet());
        return ls;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
