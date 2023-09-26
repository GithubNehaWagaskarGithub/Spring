package Spring5AuthenticationAndAuthority.Spring5AuthenticationAndAuthority.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getMessage()
    {
        return "index";
    }
    //----------------------------
    @GetMapping("/adminLogin")
    public String admin()
    {
        return "admin";
    }
    //-----------------------------
    @GetMapping("/hrLogin")
    public String hr()
    {
        return "hr";
    }
    //-----------------------------
    @GetMapping("/trackerLogin")
    public String tracker()
    {
        return "tracker";
    }
    //------------------------------
    @GetMapping("/trainerLogin")
    public String trainer()
    {
        return "trainer";
    }
    //------------------------------
    @GetMapping("/access-denied")
    public String noAccess()
    {
        return "noaccess";
    }
    //--------------------------------
}
