package GameController;

import Interfaces.GameController;

public class Main {
    public static void main(String[] args) {
        ThirdPartyController thirdPartyController = new ThirdPartyController();
        GameController gameControllerAdapter = new GameControllerAdapter(thirdPartyController,null); // Note: not working until the exercise is done

        ThirdPartyController2 thirdPartyController2 = new ThirdPartyController2();
        GameController gameControllerAdapter2 = new GameControllerAdapter(null, thirdPartyController2);

        Game game = new Game(gameControllerAdapter);
        game.onGameLoop();

        Game game2 = new Game(gameControllerAdapter2);
        game2.onGameLoop();
    }
}
