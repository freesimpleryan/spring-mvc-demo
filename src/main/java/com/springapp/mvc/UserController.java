package com.springapp.mvc;

/**
 * Created by Ryan on 4/13/2016.
 */
import models.User;
import models.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/api/user")
public class UserController {
    @RequestMapping(method = RequestMethod.GET)
    public String printAllUsers(ModelMap model) {
        ArrayList<User> allUsers = UserRepository.getAllUsers();
        String userTable = "";
        for(User u : allUsers){
            userTable += "<tr>";
            userTable += putInCell(Integer.toString(u.getId()));
            userTable += putInCell(u.getFirstName());
            userTable += putInCell(u.getLastName());
            userTable += putInCell(u.getEmail());
            userTable += "</tr>";
        }
        model.addAttribute("userList", userTable);
        return "user";
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody User save(@RequestBody User user) {
        UserRepository.addUser(user);
        return user;
    }

    private String putInCell(String value){
        return "<td>"+value+"</td>";
    }
}
