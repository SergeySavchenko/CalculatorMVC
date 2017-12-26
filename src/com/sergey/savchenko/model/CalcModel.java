package com.sergey.savchenko.model;

/**
 * Created by SergeySavchenko on 26.12.2017.
 */
public class CalcModel {
    private double firstNumber;
    private double secondNumber;
    private int operationCode;
    private int errorCode;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperationCode(int operationCode) {
        this.operationCode = operationCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    private double add() {
        errorCode = 0;
        return firstNumber + secondNumber;
    }

    private double sub() {
        errorCode = 0;
        return firstNumber - secondNumber;
    }

    private double mul() {
        errorCode = 0;
        return firstNumber * secondNumber;
    }

    private double div() {
        if (this.secondNumber != 0) {
            errorCode = 0;
            return firstNumber / secondNumber;
        } else {
            errorCode = -1;
            return 0;
        }
    }

    private double expon() {
        return Math.pow(firstNumber, secondNumber);
    }

    public double getResult() {
        double result = 0;
        switch (this.operationCode) {
            case 0:
                result = add();
                break;
            case 1:
                result = sub();
                break;
            case 2:
                result = mul();
                break;
            case 3:
                result = div();
                break;
            case 4:
                result = expon();
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
