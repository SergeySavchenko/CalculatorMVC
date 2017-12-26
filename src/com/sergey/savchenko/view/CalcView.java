package com.sergey.savchenko.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import com.sergey.savchenko.controller.CalcController;

/**
 * Created by SergeySavchenko on 26.12.2017.
 */

public class CalcView extends JFrame {
    private CalcController calcController;
    private JTextField ditString;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn0;
    private JButton btnC;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMul;
    private JButton btnDiv;
    private JButton btnNegative;
    private JButton btnPoint;
    private JButton btnEquals;
    private JButton btnExpon;

    public CalcView(String title) {
        super(title);
        calcController = CalcController.getInstance();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(320, 195);
        this.setLocation(700, 400);
        this.setLayout(new FlowLayout());
        ditString = new JTextField(26);
        calcController.setTextComponent(ditString);
        ditString.setHorizontalAlignment(JTextField.RIGHT);
        btn1 = new JButton("1");
        btn1.setActionCommand("1");
        btn1.setPreferredSize(new Dimension(55, 26));
        btn2 = new JButton("2");
        btn2.setActionCommand("2");
        btn2.setPreferredSize(new Dimension(55, 26));
        btn3 = new JButton("3");
        btn3.setActionCommand("3");
        btn3.setPreferredSize(new Dimension(55, 26));
        btnC = new JButton("C");
        btnC.setPreferredSize(new Dimension(115, 26));
        btn4 = new JButton("4");
        btn4.setActionCommand("4");
        btn4.setPreferredSize(new Dimension(55, 26));
        btn5 = new JButton("5");
        btn5.setActionCommand("5");
        btn5.setPreferredSize(new Dimension(55, 26));
        btn6 = new JButton("6");
        btn6.setActionCommand("6");
        btn6.setPreferredSize(new Dimension(55, 26));
        btnPlus = new JButton("+");
        btnPlus.setActionCommand("0");
        btnPlus.setPreferredSize(new Dimension(55, 26));
        btnMinus = new JButton("-");
        btnMinus.setActionCommand("1");
        btnMinus.setPreferredSize(new Dimension(55, 26));
        btn7 = new JButton("7");
        btn7.setActionCommand("7");
        btn7.setPreferredSize(new Dimension(55, 26));
        btn8 = new JButton("8");
        btn8.setActionCommand("8");
        btn8.setPreferredSize(new Dimension(55, 26));
        btn9 = new JButton("9");
        btn9.setActionCommand("9");
        btn9.setPreferredSize(new Dimension(55, 26));
        btnMul = new JButton("*");
        btnMul.setActionCommand("2");
        btnMul.setPreferredSize(new Dimension(55, 26));
        btnDiv = new JButton("/");
        btnDiv.setActionCommand("3");
        btnDiv.setPreferredSize(new Dimension(55, 26));
        btn0 = new JButton("0");
        btn0.setActionCommand("0");
        btn0.setPreferredSize(new Dimension(55, 26));
        btnNegative = new JButton("+/-");
        btnNegative.setPreferredSize(new Dimension(55, 26));
        btnPoint = new JButton(".");
        btnPoint.setActionCommand(".");
        btnPoint.setPreferredSize(new Dimension(55, 26));
        btnEquals = new JButton("=");
        btnEquals.setPreferredSize(new Dimension(55, 26));
        btnExpon = new JButton("x^y");
        btnExpon.setPreferredSize(new Dimension(55, 26));

        ActionListener numActionListener = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                calcController.setNumberText(e.getActionCommand());
            }
        };

        btn1.addActionListener(numActionListener);
        btn2.addActionListener(numActionListener);
        btn3.addActionListener(numActionListener);
        btn4.addActionListener(numActionListener);
        btn5.addActionListener(numActionListener);
        btn6.addActionListener(numActionListener);
        btn7.addActionListener(numActionListener);
        btn8.addActionListener(numActionListener);
        btn9.addActionListener(numActionListener);
        btn0.addActionListener(numActionListener);
        btnC.addActionListener(new ActionListener() {
                                   public void actionPerformed(ActionEvent e) {
                                       calcController.clearNumberText();
                                   }
                               }
        );

        btnNegative.addActionListener(new ActionListener() {
                                          public void actionPerformed(ActionEvent e) {
                                              calcController.setNegativeSign();
                                          }
                                      }
        );

        btnPlus.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent e) {
                                          calcController.setOperation(0);
                                      }
                                  }
        );

        btnMinus.addActionListener(new ActionListener() {
                                       public void actionPerformed(ActionEvent e) {
                                           calcController.setOperation(1);
                                       }
                                   }
        );

        btnMul.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                         calcController.setOperation(2);
                                     }
                                 }
        );

        btnDiv.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                         calcController.setOperation(3);
                                     }
                                 }
        );

        btnExpon.addActionListener(new ActionListener() {
                                       public void actionPerformed(ActionEvent e) {
                                           calcController.setOperation(4);
                                       }
                                   }
        );

        btnPoint.addActionListener(new ActionListener() {
                                       public void actionPerformed(ActionEvent e) {
                                           calcController.setNumberText(".");
                                       }
                                   }
        );

        btnEquals.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            calcController.getResult();
                                        }
                                    }
        );

        this.add(ditString);
        this.add(btn7);
        this.add(btn8);
        this.add(btn9);
        this.add(btnC);
        this.add(btn4);
        this.add(btn5);
        this.add(btn6);
        this.add(btnPlus);
        this.add(btnMinus);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btnMul);
        this.add(btnDiv);
        this.add(btn0);
        this.add(btnNegative);
        this.add(btnPoint);
        this.add(btnExpon);
        this.add(btnEquals);
    }
}
