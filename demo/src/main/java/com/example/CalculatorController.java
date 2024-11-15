package com.example;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class CalculatorController {
    @FXML
    private TextArea display;
    @FXML
    private Button one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, multiply, divide, percent, change, buttonDelete, decimal, equal;

    private String actualText;

    @FXML
    public void handleClick(Event event) {

    }

    @FXML
    public void changeSign() {
        double number = Double.parseDouble(display.getText());
        try {
            if (number != 0) {
                number = number * -1;
                display.setText(Double.toString(number));
                System.out.println(number);
            } 
            else {
                return;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

}
