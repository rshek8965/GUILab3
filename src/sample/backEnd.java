package sample;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class backEnd {
    public Label clicker;
    public int countedClicks = 0;
    private boolean counting = false;
    private boolean done = false;

    public void clickEvent(ActionEvent actionEvent) {

        if(!counting && !done)
        {
            long step = System.nanoTime() + 10000000000L;
            new AnimationTimer() {
                public void handle(long now) {
                    if(now > step)
                    {
                        clicker.setText("You ended with " + countedClicks + " points");
                        counting = false;
                        done = true;
                    }
                    if (now < step) {
                        long time2 = now - step;
                        clicker.setText("Time Left: " + -time2 + " | Points: " + String.valueOf(countedClicks));
                    }
                }
            }.start();
            counting = true;
        }
        if(counting) {
            countedClicks++;
            String num = String.valueOf(countedClicks);
            clicker.setText(num);
        }
    }
}

