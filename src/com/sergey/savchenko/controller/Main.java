package com.sergey.savchenko.controller;

import com.sergey.savchenko.view.CalcView;

/**
 * Created by SergeySavchenko on 26.12.2017.
 */
public class Main {
    public static void main(String[] args) {
        CalcView calcView = new CalcView("Calculator");
        calcView.setVisible(true);
    }
}
