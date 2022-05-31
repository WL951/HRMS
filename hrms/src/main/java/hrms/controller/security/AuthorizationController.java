package hrms.controller.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationController {


    @RequestMapping("/auth/code")
    public String getCodeImg(){
        return "hello";
    }
}
