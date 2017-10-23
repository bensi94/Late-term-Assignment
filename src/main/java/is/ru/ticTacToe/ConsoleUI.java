package is.ru.ticTacToe;

public class ConsoleUI {

    ConsoleUI (){
        GameLogic runningGame = new GameLogic();
        welcomeMessage();
    }

    void welcomeMessage(){
        System.out.println("Welcome to Tic Tac Toe");
    }
}
