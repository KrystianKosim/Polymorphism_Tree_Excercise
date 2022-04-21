package Zadanie2;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Task {
    private static List<Task> tasksList;
    private String title;
    private String description;
    private StatusOfTask statusOfTask;
    private LocalDateTime deadLine;
    private List<User> users;

    public Task(String title, String description, StatusOfTask statusOfTask, LocalDateTime deadLine) {
        this.title = title;
        this.description = description;
        this.statusOfTask = statusOfTask;
        this.deadLine = deadLine;
        users = new ArrayList<>();
        tasksList.add(this);
    }

    public void addUserToTask(User user){
        users.add(user);
    }

    public void changeStatusOfTask(StatusOfTask statusOfTask){
        this.statusOfTask = statusOfTask;
    }

}
