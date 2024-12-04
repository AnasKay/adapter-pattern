package GameController;

import GameController.Interfaces.GameController;

public class Main {
    public static void main(String[] args) {
        ThirdPartyController thirdPartyController = new ThirdPartyController();
        OtherPartyController otherPartyController = new OtherPartyController();
        GameController gameControllerAdapter = new GameControllerAdapter(thirdPartyController, otherPartyController); // Note: not working until the exercise is done

        Game game = new Game(gameControllerAdapter);
        game.onGameLoop();
    }
}
