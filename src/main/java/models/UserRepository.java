package models;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Ryan on 4/13/2016.
 */
public class UserRepository {

    private static ArrayList<User> userRepository = new ArrayList<User>();
    private static int idAssigner = 0;

    static {
        userRepository.add(new User(0, "Bob", "Sillyman", "Bob@bob.com"));
        userRepository.add(new User(1, "Jane", "Jackman", "Jane@jd.com"));
        idAssigner = 2;
    }

    public static void addUser(User u){
        u.setId(idAssigner);
        userRepository.add(u);
        idAssigner++;
    }

    public static ArrayList<User> getAllUsers(){return userRepository;}

    public static User getUserById(int id){
        for(User u : userRepository){
            if(u.getId() == id){
                return u;
            }
        }
        return new User();
    }

    public static boolean deleteUser(User user){
        for(User u : userRepository){
            if(u.equals(user)){
                userRepository.remove(u);
                return true;
            }
        }
        return false;
    }

}
