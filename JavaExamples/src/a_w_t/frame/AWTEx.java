package a_w_t.frame;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class AWTEx extends Frame
{
    Label lblname = new Label("NAME");
    TextField txtname = new TextField(10);
    Label lbladdr = new Label("ADDRESS");
    TextArea txtaddr = new TextArea("Address",4,20);
    FlowLayout fl = new FlowLayout();

    AWTEx(String s){
        super(s);
        add(lblname);
        add(txtname);
        add(lbladdr);
        add(txtaddr);
        setLayout(fl);
        setSize(700,500);
        show();
    }

    public static void main(String[] args) {
        AWTEx ob1 = new AWTEx("EAMPLE 1");
    }

}
