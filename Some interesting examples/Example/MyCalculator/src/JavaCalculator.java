import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

/**
 * Created by 1 on 27.01.2017.
 */
public class JavaCalculator {
    private JTextField textDisplay;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnDot;
    private JButton btn0;
    private JButton btnC;
    private JButton btnPlus;
    private JButton btnRes;
    private JButton btnDiv;
    private JButton btnMul;
    private JButton btnMinus;

    private boolean isDot=false;
    private int caseAction;
    private double a;
    private double b;

    public JavaCalculator() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((e.getSource()).equals(btn1)){
                    textDisplay.setText(textDisplay.getText()+"1");
                }
                if((e.getSource()).equals(btn2)){
                    textDisplay.setText(textDisplay.getText()+"2");
                }
                if((e.getSource()).equals(btn3)){
                    textDisplay.setText(textDisplay.getText()+"3");
                }
                if((e.getSource()).equals(btn4)){
                    textDisplay.setText(textDisplay.getText()+"4");
                }
                if((e.getSource()).equals(btn5)){
                    textDisplay.setText(textDisplay.getText()+"5");
                }
                if((e.getSource()).equals(btn6)){
                    textDisplay.setText(textDisplay.getText()+"6");
                }
                if((e.getSource()).equals(btn7)){
                    textDisplay.setText(textDisplay.getText()+"7");
                }
                if((e.getSource()).equals(btn8)){
                    textDisplay.setText(textDisplay.getText()+"8");
                }
                if((e.getSource()).equals(btn9)){
                    textDisplay.setText(textDisplay.getText()+"9");
                }
                if((e.getSource()).equals(btn0)){
                    textDisplay.setText(textDisplay.getText()+"0");
                }
                if((e.getSource()).equals(btnDot)){
                    dotFunction();
                }
                if((e.getSource()).equals(btnC)){
                    textDisplay.setText("0");
                    a=0;
                    b=0;
                }
            }
        };
        btn1.addActionListener(listener);
        btn2.addActionListener(listener);
        btn3.addActionListener(listener);
        btn4.addActionListener(listener);
        btn5.addActionListener(listener);
        btn6.addActionListener(listener);
        btn7.addActionListener(listener);
        btn8.addActionListener(listener);
        btn9.addActionListener(listener);
        btnDot.addActionListener(listener);
        btn0.addActionListener(listener);
        btnC.addActionListener(listener);
        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((e.getSource()).equals(btnPlus)){
                    caseAction=1;
                    a=Double.parseDouble(textDisplay.getText());
                    textDisplay.setText("0");
                }
                if((e.getSource()).equals(btnMinus)){
                    caseAction=2;
                    a=Double.parseDouble(textDisplay.getText());
                    textDisplay.setText("0");
                }
                if((e.getSource()).equals(btnMul)){
                    caseAction=3;
                    a=Double.parseDouble(textDisplay.getText());
                    textDisplay.setText("0");
                }
                if((e.getSource()).equals(btnDiv)){
                    caseAction=4;
                    a=Double.parseDouble(textDisplay.getText());
                    textDisplay.setText("0");
                }
                if((e.getSource()).equals(btnRes)){
                    switch (caseAction){
                        case 1:
                            b=Double.parseDouble(textDisplay.getText());
                            textDisplay.setText(""+addFunction(a,b));
                            break;

                        case 2:
                            b=Double.parseDouble(textDisplay.getText());
                            textDisplay.setText(""+minFunction(a,b));
                            break;

                        case 3:
                            b=Double.parseDouble(textDisplay.getText());
                            textDisplay.setText(""+mulFunction(a,b));
                            break;

                        case 4:
                            b=Double.parseDouble(textDisplay.getText());
                            textDisplay.setText(""+divFunction(a,b));
                            break;

                    }
                }
            }
        };
        btnPlus.addActionListener(listener1);
        btnRes.addActionListener(listener1);
        btnDiv.addActionListener(listener1);
        btnMul.addActionListener(listener1);
        btnMinus.addActionListener(listener1);
    }

    private void dotFunction() {
        if(!isDot){
            textDisplay.setText(textDisplay.getText()+".");
        }
    }

    private double addFunction(double a, double b){
        return a+b;
    }

    private double minFunction(double a, double b){
        return a-b;
    }

    private double mulFunction(double a, double b){
        return a*b;
    }

    private double divFunction(double a, double b){
        return a/b;
    }


}
