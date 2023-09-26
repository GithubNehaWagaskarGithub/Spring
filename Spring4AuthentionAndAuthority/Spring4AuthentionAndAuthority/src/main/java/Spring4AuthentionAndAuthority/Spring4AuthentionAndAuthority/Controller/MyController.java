package Spring4AuthentionAndAuthority.Spring4AuthentionAndAuthority.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getMessage()
    {
        return "home";
    }
    //-----------------------------
    @GetMapping("/adminLogin")
    public String admin()
    {
        return "admin";
    }
    //------------------------------------
    @GetMapping("/hrLogin")
    public String hr()
    {
        return "hr";
    }
    //------------------------------------
    @GetMapping("/access-denied")
    public String noAccess()
    {
        return "noAccess";
    }
    //------------------------------------
}
