package GameController;

import GameController.Interfaces.GameController;

public class Main {
    public static void main(String[] args) {
        ThirdPartyController thirdPartyController = new ThirdPartyController();
        GameController gameControllerAdapter = new GameControllerAdapter(thirdPartyController,null); // Note: not working until the exercise is done

        OtherPartyController otherPartyController = new OtherPartyController();
        GameController gameControllerAdapter2 = new GameControllerAdapter(null, otherPartyController);

        Game game = new Game(gameControllerAdapter);
        game.onGameLoop();

        Game game2 = new Game(gameControllerAdapter2);
        game2.onGameLoop();
    }
}
