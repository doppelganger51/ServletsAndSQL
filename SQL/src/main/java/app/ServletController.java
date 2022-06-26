package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import repo.ICarsRepo;

@RestController
public class ServletController {
    @Autowired
    ICarsRepo cars;

    @RequestMapping(
            value="/hello",
            method= RequestMethod.GET
    )
    public String hello(){
        return "hello world";
    }

}
