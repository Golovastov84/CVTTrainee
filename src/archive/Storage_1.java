package main;


import main.model.Task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Storage_1 {

    private static int currentId = 1;
    private static final ConcurrentHashMap<Integer, Task_1> tasks = new ConcurrentHashMap<>();

    public static List<Task_1> getAllTasks() {
        ArrayList<Task_1> tasksList = new ArrayList<>();
        tasksList.addAll(tasks.values());
        return tasksList;
    }

    public static int addTask(Task_1 task) {
        int id = currentId++;
        task.setId(id);
        tasks.put(id, task);
        return id;
    }

    public static int setTask(Task_1 task) {
        int IdTask = task.getId();
        tasks.put(IdTask, task);
        return IdTask;
    }

    public static Task_1 getTask(int taskId) {
        if (tasks.containsKey(taskId)) {
            return tasks.get(taskId);
        }
        return null;
    }

    public static int dellTask(int taskId) {
        if (tasks.containsKey(taskId)) {
            tasks.remove(taskId);
            return taskId;
        }
        return 0;
    }

    public static int dellAllTask() {
        tasks.clear();
        currentId = 1;
        return 0;
    }
}