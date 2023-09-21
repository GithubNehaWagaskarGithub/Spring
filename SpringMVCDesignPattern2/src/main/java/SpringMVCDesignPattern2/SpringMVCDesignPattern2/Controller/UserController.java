package SpringMVCDesignPattern2.SpringMVCDesignPattern2.Controller;

import SpringMVCDesignPattern2.SpringMVCDesignPattern2.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    List<User> userList=new ArrayList<>();
    {
        User u1=new User(101,"Neha","neha16@gmail.com",9673922516l);
        User u2=new User(102,"Aaku","wagaskar2001@gmail.com",9876543210l);
        userList.add(u1);
        userList.add(u2);
    }

    public String getMessage(){
        return "index";
    }
    //----------------------------------------------------------
    @GetMapping("/displayUsers")
    public String displayInfo(Model model){
        model.addAttribute("userInfo",userList);
        return "displayUsers";
    }
    //----------------------------------------------------------
    @GetMapping("/addUser")
    public String addTempUser(Model model){
        model.addAttribute("tempUser",new User());
        return "addUser";
    }
    //----------------------------------------------------------
    @PostMapping("/addUserInfo")
    public String addUserInfo(User u){
        userList.add(u);
        return "redirect:/displayUsers";
    }
    //---------------------------------------------------------
    @GetMapping("/updateUser/{id}")
    public String getCurrentUser(@PathVariable("id") int id, Model model)
    {
        User temp=userList.get(id-101);
        model.addAttribute("tempUser1",temp);
        return "update";
    }
    //----------------------------------------------------------

    @GetMapping("/updateTempObject")
    public String updateUser(User u)
    {
        userList.set(u.getUId()-101,u);
        return "redirect:/displayUsers";
    }
    //------------------------------------------------------------
    @GetMapping("/deleteUser/{id}")
    public String getCurrentUser1(@PathVariable("id") int id, Model model)
    {
        User temp2=userList.get(id-101);
        model.addAttribute("tempUser2",temp2);
        return "delete";
    }
    //---------------------------------------------------------
    @GetMapping("/deleteTempObject")
    public String deleteCurrentObject(User s)
    {
        userList.remove(s.getUId()-101);
        return "redirect:/displayUsers";
    }
    //-------------------------------------------------------------------
}
