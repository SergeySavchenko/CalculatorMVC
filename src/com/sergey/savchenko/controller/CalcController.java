package com.sergey.savchenko.controller;

import com.sergey.savchenko.model.CalcModel;

import javax.swing.JTextField;

/**
 * Created by SergeySavchenko on 26.12.2017.
 */

public class CalcController {
    private JTextField ditString;
    private static CalcController instance;
    private CalcModel calcModel;

    public static CalcController getInstance() {
        if (instance == null) {
            instance = new CalcController();
        }
        return instance;
    }

    public void setTextComponent(JTextField textComponent) {
        this.ditString = textComponent;
    }

    public CalcController() {
        calcModel = new CalcModel();
    }

    public void setNumberText(String num) {
        String lastDit = this.ditString.getText();
        if (((lastDit.equals("")) && (num.equals("."))) ||
                ((lastDit.length() != 0) && (lastDit.charAt(lastDit.length() - 1) == '.') && (num.equals(".")))) {
            num = "";
        }
        this.ditString.setText(lastDit + num);
    }

    public void clearNumberText() {
        this.ditString.setText("");
    }

    public void setNegativeSign() {
        String lastDit = this.ditString.getText();
        if (lastDit.charAt(0) == '-') {
            this.ditString.setText(lastDit.substring(1));
        } else {
            this.ditString.setText("-" + lastDit);
        }
    }

    public void setOperation(int operationCode) {
        calcModel.setOperationCode(operationCode);
        if (calcModel.getErrorCode() == 0)
            calcModel.setFirstNumber(Double.parseDouble(this.ditString.getText()));
        this.ditString.setText("");
    }

    public void getResult() {
        String resultString = "";
        double result = 0;
        calcModel.setSecondNumber(Double.parseDouble(this.ditString.getText()));
        result = calcModel.getResult();
        if (calcModel.getErrorCode() == -1) resultString = "Division by 0!";
        else resultString = String.valueOf(result);
        this.ditString.setText(resultString);
    }
}
