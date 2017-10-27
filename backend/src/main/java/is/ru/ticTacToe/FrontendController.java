package is.ru.ticTacToe;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class FrontendController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }
}
