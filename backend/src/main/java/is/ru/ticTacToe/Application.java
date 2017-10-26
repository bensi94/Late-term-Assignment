package is.ru.ticTacToe;

import com.github.springfox.loader.EnableSpringfox;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;;

@EnableSpringfox
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        //ConsoleUI console = new ConsoleUI();
        // port(getHerokuPort());
        // get("/", (reg, res) -> {
        //     return "<h1>Steini er maðurinn</h1>";
        // });
        SpringApplication.run(Application.class, args);
    }

    // static int getHerokuPort(){
    //     ProcessBuilder psb = new ProcessBuilder();
    //     if(psb.environment().get("PORT") != null){
    //         return Integer.parseInt(psb.environment().get("PORT"));
    //     }
    //
    //     return 4567;
    //}
}
