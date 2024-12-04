package GameController;

import Interfaces.GameController;

public class GameControllerAdapter implements GameController {
    private ThirdPartyController thirdPartyController;
    private ThirdPartyController2 thirdPartyController2;

    public GameControllerAdapter(ThirdPartyController thirdPartyController, ThirdPartyController2 thirdPartyController2) {
        this.thirdPartyController = thirdPartyController;
        this.thirdPartyController2 = thirdPartyController2;
    }

    @Override
    public void moveUp() {
        if(thirdPartyController != null)
            this.thirdPartyController.ascend();
        if(thirdPartyController2 != null)
            this.thirdPartyController2.rauf();
    }

    @Override
    public void moveDown() {
        if(thirdPartyController != null)
            this.thirdPartyController.descend();
        if(thirdPartyController2 != null)
            this.thirdPartyController2.runter();
    }

    @Override
    public void moveLeft() {
        if(thirdPartyController != null)
            this.thirdPartyController.goLeft();
        if(thirdPartyController2 != null)
            this.thirdPartyController2.links();
    }

    @Override
    public void moveRight() {
        if(thirdPartyController != null)
            this.thirdPartyController.goRight();
        if(thirdPartyController2 != null)
            this.thirdPartyController2.rechts();
    }

    @Override
    public void actionButton() {
        if(thirdPartyController != null)
            this.thirdPartyController.performAction();
        if(thirdPartyController2 != null)
            this.thirdPartyController2.duawos();
    }

}
