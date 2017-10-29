package is.ru.ticTacToe;

import com.google.common.collect.ImmutableMap;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class FrontendController {

    private GameLogic logicForController = new GameLogic();
    private JsonResponse response = new JsonResponse();

    @RequestMapping(value = "/board", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String board() {
        String jsonBoard = "";
        char [][] charBoard = logicForController.getBoard();
        char counter = '1';
        for (int i = 0; i < charBoard.length; i++ ) {
            for (int j = 0; j < charBoard[i].length; j++){
                jsonBoard += "{\"square\":\""+ charBoard[i][j] +"\"},";
                counter++;
            }
        }
        jsonBoard = jsonBoard.substring(0,jsonBoard.length()-1);
        jsonBoard = "{\"board\":[" + jsonBoard + "]}";
        return jsonBoard;
    }

    @RequestMapping(value = "/Winner", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String Winner() {
      String jsonWinner = "{\"Winner\":" + Integer.toString(logicForController.winner()) + "}";
       return jsonWinner;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/markBoard", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void markBoard(@RequestBody String data){
        logicForController.markBoard(Integer.parseInt(data));
    }
}
