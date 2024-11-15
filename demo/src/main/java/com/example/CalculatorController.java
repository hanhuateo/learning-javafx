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

    private String operator = new String();

    private Double[] calculation = new Double[2];

    @FXML
    public void handleNumberDecimalClick(Event event) {
        Button btn = (Button) event.getSource();
        switch (btn.getId()) {
            case "zero":
                display.appendText("0");
                break;
            case "one":
                display.appendText("1");
                break;
            case "two":
                display.appendText("2");
                break;
            case "three":
                display.appendText("3");
                break;
            case "four":
                display.appendText("4");
                break;
            case "five":
                display.appendText("5");
                break;
            case "six":
                display.appendText("6");
                break;
            case "seven":
                display.appendText("7");
                break;
            case "eight":
                display.appendText("8");
                break;
            case "nine":
                display.appendText("9");
                break;
            case "decimal":
                if (display.getText().contains(".")) {
                    return;
                } else {
                    display.appendText(".");
                }
                break;
        }
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

    @FXML
    public void toPercentage() {
        double number = Double.parseDouble(display.getText());
        try {
            if (number != 0) {
                number = number / 100;
                display.setText(Double.toString(number));
                System.out.println(number);
            } else {
                return;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleOperatorClick(Event event) {
        Button btn = (Button) event.getSource();
        double number = Double.parseDouble(display.getText());
        this.calculation[0] = number;
        switch (btn.getId()) {
            case "plus":
                display.setText("0");
                this.operator = "plus";
                break;
            case "minus":
                display.setText("0");
                this.operator = "minus";
                break;
            case "multiply":
                display.setText("0");
                this.operator = "multiply";
                break;
            case "divide":
                display.setText("0");
                this.operator = "divide";
                break;
        }
    }

    @FXML
    public void handleEqualBtnClick() {
        double number = Double.parseDouble(display.getText());
        this.calculation[1] = number;
        double result = 0;
        switch(this.operator) {
            case "plus":
                result = this.calculation[0] + this.calculation[1];
                display.setText(Double.toString(result));
                this.calculation[0] = 0.0;
                this.calculation[1] = 0.0;
                this.operator = "";
                break;
            case "minus":
                result = this.calculation[0] - this.calculation[1];
                display.setText(Double.toString(result));
                this.calculation[0] = 0.0;
                this.calculation[1] = 0.0;
                this.operator = "";
                break;
            case "multiply":
                result = this.calculation[0] * this.calculation[1];
                display.setText(Double.toString(result));
                this.calculation[0] = 0.0;
                this.calculation[1] = 0.0;
                this.operator = "";
                break;
            case "divide":
                result = this.calculation[0] * this.calculation[1];
                display.setText(Double.toString(result));
                this.calculation[0] = 0.0;
                this.calculation[1] = 0.0;
                this.operator = "";
                break;
        }
    }

    @FXML
    public void handleDeleteButtonClick() {
        display.setText("0");
        this.operator = "";
        this.calculation[0] = 0.0;
        this.calculation[1] = 0.0;
    }
}
