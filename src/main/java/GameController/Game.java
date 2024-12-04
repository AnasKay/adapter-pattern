package GameController;

import GameController.Interfaces.GameController;

public class Game {
    private GameController controller;

    public Game(GameController controller) {
        this.controller = controller;
    }

    public void onGameLoop() {
        controller.moveUp();
        controller.moveDown();
        controller.moveLeft();
        controller.moveRight();
        controller.actionButton();
    }
}
