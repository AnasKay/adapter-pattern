package GameController;

import GameController.Interfaces.GameController;

public class GameControllerAdapter implements GameController {
    private ThirdPartyController thirdPartyController;
    private OtherPartyController otherPartyController;

    public GameControllerAdapter(ThirdPartyController thirdPartyController, OtherPartyController otherPartyController) {
        this.thirdPartyController = thirdPartyController;
        this.otherPartyController = otherPartyController;
    }

    @Override
    public void moveUp() {
        this.thirdPartyController.ascend();
        this.otherPartyController.rauf();
    }

    @Override
    public void moveDown() {
     this.thirdPartyController.descend();
     this.otherPartyController.runter();
    }

    @Override
    public void moveLeft() {
        this.thirdPartyController.goLeft();
        this.otherPartyController.links();
    }

    @Override
    public void moveRight() {
        this.thirdPartyController.goRight();
        this.otherPartyController.rechts();
    }

    @Override
    public void actionButton() {
        this.thirdPartyController.performAction();
        this.otherPartyController.duawos();
    }
}
