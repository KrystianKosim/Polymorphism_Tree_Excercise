package Zadanie2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


    }

    private static boolean removeUser(User userToRemove){
        return User.getUsers().remove(userToRemove);
    }

    private static List<User> filterUserByName(Predicate<User> predicate){
        List<User> replacementList = new LinkedList<>();
        for (User u:User.getUsers()) {
            if(predicate.test(u))
                replacementList.add(u);
        }
        return replacementList;
    }
}
