package main;


import main.model.People;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class StoragePeople {

    private static int currentId = 1;
    private static final ConcurrentHashMap<Integer, People> folk = new ConcurrentHashMap<>();

    public static List<People> getAllFolk() {

        ArrayList<People> folkList = new ArrayList<>();
        folkList.addAll(folk.values());
        return folkList;
    }

    public static int addFolk(People people) {
        int id = currentId++;
        people.setId(id);
        folk.put(id, people);
        return id;
    }

    public static int setPeople(People people) {
        int IdPeople = people.getId();
        folk.put(IdPeople, people);
        return IdPeople;
    }

    public static People getPeople(int peopleId) {
        if (folk.containsKey(peopleId)) {
            return folk.get(peopleId);
        }
        return null;
    }

    public static int dellTask(int taskId) {
        if (folk.containsKey(taskId)) {
            folk.remove(taskId);
            return taskId;
        }
        return 0;
    }

    public static int dellAllTask() {
        folk.clear();
        currentId = 1;
        return 0;
    }
}