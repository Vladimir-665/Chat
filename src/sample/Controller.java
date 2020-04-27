package sample;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    public TextField textField;
    public TextArea textArea;

    public void sendButton() {
       textArea.appendText(textField.getText());
    }
    public void keyListener(KeyEvent keyEvent) {
        if(keyEvent.getCode().equals(KeyCode.ENTER)) {
            sendButton();
        }
    }
}
