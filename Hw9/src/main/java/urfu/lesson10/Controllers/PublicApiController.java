package urfu.lesson10.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicApiController implements ApiController {
    @Override
    @GetMapping("public/api")
    public String execute() {
        return "Public api";
    }
}
