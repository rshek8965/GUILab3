package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class backEnd {
    public Label clicker;
    public int countedClicks = 0;

    public void clickEvent(ActionEvent actionEvent) {
        countedClicks++;
        String num = String.valueOf(countedClicks);
        clicker.setText(num);
    }
}

