package sysc4806.group20.springmongodbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringmongodbdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmongodbdemoApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    String health() {
        return "Hello World!";
    }
}
