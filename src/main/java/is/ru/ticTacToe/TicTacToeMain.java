package is.ru.ticTacToe;

import static spark.Spark.*;

public class TicTacToeMain {
    public static void main(String[] args){
        //ConsoleUI console = new ConsoleUI();
        port(getHerokuPort());
        get("/", (reg, res) -> {
            return "Hello TicTacToe with TRAVIS";
        });
    }

    static int getHerokuPort(){
        ProcessBuilder psb = new ProcessBuilder();
        if(psb.environment().get("PORT") != null){
            return Integer.parseInt(psb.environment().get("PORT"));
        }

        return 4567;
    }
}
