import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 1 on 27.01.2017.
 */
public class MyCalculator {
    private JTextField textDisplay;
    private JPanel panel1;
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
    private JButton btn_plus;
    private JButton btn_res;
    private JButton btn_mul;
    private JButton btn_div;
    private JButton btn_min;
    private JButton btn_dot;
    private JButton btn_c;

    public MyCalculator() {

        //boolean isdDot=false;

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText()+"1");
            }
        });
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.equals(btn2.getAction())){
                    textDisplay.setText(textDisplay.getText()+"2");
                }
                if(e.equals(btn3.getAction())){
                    textDisplay.setText(textDisplay.getText()+"3");
                }
                if(e.equals(btn4.getAction())){
                    textDisplay.setText(textDisplay.getText()+"4");
                }
                if(e.equals(btn5.getAction())){
                    textDisplay.setText(textDisplay.getText()+"5");
                }
                if(e.equals(btn6.getAction())){
                    textDisplay.setText(textDisplay.getText()+"6");
                }
                if(e.equals(btn7.getAction())){
                    textDisplay.setText(textDisplay.getText()+"7");
                }
                if(e.equals(btn8.getAction())){
                    textDisplay.setText(textDisplay.getText()+"8");
                }
                if(e.equals(btn9.getAction())){
                    textDisplay.setText(textDisplay.getText()+"9");
                }
                if(e.equals(btn0.getAction())){
                    textDisplay.setText(textDisplay.getText()+"0");
                }
                if(e.equals(btn_dot.getAction())){
                   // if(!isdDot) {
                        textDisplay.setText(textDisplay.getText() + ".");
                     //   isdDot=true;
                    //}
                }
                if(e.equals(btn_c.getAction())){
                    textDisplay.setText("0");
                }
            }
        };
        btn4.addActionListener(listener);
        btn7.addActionListener(listener);
        btn8.addActionListener(listener);
        btn2.addActionListener(listener);
        btn5.addActionListener(listener);
        btn9.addActionListener(listener);
        btn6.addActionListener(listener);
        btn3.addActionListener(listener);
        btn0.addActionListener(listener);
        btn_dot.addActionListener(listener);
        btn_c.addActionListener(listener);
    }
}
