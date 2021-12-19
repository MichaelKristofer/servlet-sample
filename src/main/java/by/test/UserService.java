package by.test;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private static List<User> allUsers = new ArrayList<>();

    void save(User user){
        allUsers.add(user);
    }

    User getByLogin(String login){
        for (User allUser : allUsers) {
            allUsers.lastIndexOf(allUser);
            if (allUser.getLogin().equals(login)){
                return allUser;
            }
        }
        return null;
    }

    public boolean containsAuth(String login, String password) {
        return allUsers.contains(new User(login, password));
    }


    User changeLogin(String login, String newLogin) {
        for (User allUser : allUsers) {
            if(allUser.getLogin().equals(login)){
                allUser.setLogin(newLogin);
                return allUser;
            }
        }
        return null;
    }

    User changeName(String login, String name) {
        for (User allUser : allUsers) {
            if(allUser.getLogin().equals(login)){
                allUser.setName(name);
                return allUser;
            }
        }
        return null;
    }

    User changePassword(String login, String password) {
        for (User allUser : allUsers) {
            if(allUser.getLogin().equals(login)){
                allUser.setPassword(password);
                return allUser;
            }
        }
        return null;
    }

    public List<User> findAll(){
        return allUsers;
    }
}
