package a_w_t.colors;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorButtonEx extends Frame implements ActionListener {

    Button bt1 = new Button("Red");
    Button bt2 = new Button("Yellow");
    Button bt3 = new Button("Blue");
    Button bt4 = new Button("Green");
    TextArea tx = new TextArea(25,20);
    FlowLayout fl = new FlowLayout();

    ColorButtonEx(String s){
        super(s);
        add(bt1);
        bt1.addActionListener(this);
        add(bt2);
        bt2.addActionListener(this);
        add(bt3);
        bt3.addActionListener(this);
        add(bt4);
        bt4.addActionListener(this);
        add(tx);
        setLayout(fl);
        setSize(500,500);
        show();
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==bt1){
            bt1.setBackground(Color.red);
            tx.setBackground(Color.PINK);
        }
        if(e.getSource()==bt2){
            bt2.setBackground(Color.YELLOW);
            tx.setBackground(Color.ORANGE);
        }
        if(e.getSource()==bt3){
            bt3.setBackground(Color.blue);
            tx.setBackground(Color.CYAN);
        }
        if(e.getSource()==bt4){
            bt4.setBackground(Color.GREEN);
            tx.setBackground(Color.LIGHT_GRAY);
        }

    }

    public static void main(String[] args) {
        ColorButtonEx obj = new ColorButtonEx("Colors");
    }


}


