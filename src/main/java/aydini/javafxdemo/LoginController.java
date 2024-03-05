package aydini.javafxdemo;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class LoginController {
    @FXML
    private Slider fontSizeSlider;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button signinButton;

    @FXML
    private TextField usernameTextField;

    @FXML
    private TextField fontSizeTextField;


    @FXML
    void onSigninButtonClick(ActionEvent event) {

    }
    public void initialize(){
     // example of a (unidirectional) bind
        signinButton.disableProperty().bind(usernameTextField.textProperty().isEmpty().or(passwordField.textProperty().isEmpty()));

        // example of adding a listener
        fontSizeSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {

                    usernameTextField.setFont(new Font(newValue.doubleValue()));
                    passwordField.setFont(new Font(newValue.doubleValue()));
            }
        });



    }
}