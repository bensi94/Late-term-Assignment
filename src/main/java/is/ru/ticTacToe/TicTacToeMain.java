package is.ru.ticTacToe;

import static spark.Spark.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.core.env.StandardEnvironment;


@SpringBootApplication
public class TicTacToeMain {
    public static void main(String[] args){
        //ConsoleUI console = new ConsoleUI();;
        //Logger logger = LoggerFactory.getLogger(TicTacToeMain.class);
        SpringApplication.run(TicTacToeMain.class, args);
        // port(getHerokuPort());
        // get("/", (reg, res) -> {
        //     return "<h1>Steini er maðurinn</h1>";
        // });
    }

    static int getHerokuPort(){
        ProcessBuilder psb = new ProcessBuilder();
        if(psb.environment().get("PORT") != null){
            return Integer.parseInt(psb.environment().get("PORT"));
        }

        return 4567;
    }
}
