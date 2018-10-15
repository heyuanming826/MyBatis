package com.newer.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Customer implements Serializable {

    private List<Person> persons;
    private Map<String ,Person> map;

    public Map<String, Person> getMap() {
        return map;
    }

    public void setMap(Map<String, Person> map) {
        this.map = map;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
