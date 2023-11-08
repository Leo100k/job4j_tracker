package ru.job4j.collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSearch {
    Set<String> tasks2 = new HashSet<>();

    public Set<String> extractNumber(List<Task> tasks) {
       for (Task task: tasks) {
           tasks2.add(task.getNumber());
       }
       return tasks2;
    }
}
