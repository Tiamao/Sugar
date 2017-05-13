package recipeserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import recipeserver.models.User;
import recipeserver.models.UserDao;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<User> getAllUsers() {
        return userDao.getAll();
    }

    @RequestMapping(value = "/users/{pesel}")
    @ResponseBody
    public User getPasswordByPesel(@PathVariable String pesel) {
        return userDao.getByPesel(pesel);
    }

}
