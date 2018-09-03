package maven_springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Haha {

    @RequestMapping("/haha")
    public String haha(){
        return "哈哈哈哈哈哈";
    }
}
