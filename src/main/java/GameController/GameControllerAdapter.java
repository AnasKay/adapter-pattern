package GameController;

import Interfaces.GameController;

public class GameControllerAdapter implements GameController {
    private ThirdPartyController thirdPartyController;
    private OtherPartyController otherPartyController;

    public GameControllerAdapter(ThirdPartyController thirdPartyController, OtherPartyController otherPartyController) {
        this.thirdPartyController = thirdPartyController;
        this.otherPartyController = otherPartyController;
    }

    @Override
    public void moveUp() {
        if(thirdPartyController != null)
            this.thirdPartyController.ascend();
        if(otherPartyController != null)
            this.otherPartyController.rauf();
    }

    @Override
    public void moveDown() {
        if(thirdPartyController != null)
            this.thirdPartyController.descend();
        if(otherPartyController != null)
            this.otherPartyController.runter();
    }

    @Override
    public void moveLeft() {
        if(thirdPartyController != null)
            this.thirdPartyController.goLeft();
        if(otherPartyController != null)
            this.otherPartyController.links();
    }

    @Override
    public void moveRight() {
        if(thirdPartyController != null)
            this.thirdPartyController.goRight();
        if(otherPartyController != null)
            this.otherPartyController.rechts();
    }

    @Override
    public void actionButton() {
        if(thirdPartyController != null)
            this.thirdPartyController.performAction();
        if(otherPartyController != null)
            this.otherPartyController.duawos();
    }

}
