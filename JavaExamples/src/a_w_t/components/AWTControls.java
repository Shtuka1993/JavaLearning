package a_w_t.components;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;

public class AWTControls extends Frame {

    Label lblname = new Label("Name");
    TextField txtname = new TextField(20);
    Label lbladdr = new Label("Adress");
    TextArea txtaddr = new TextArea("Adress",15,45);
    Label lblmat = new Label("Maths");
    TextField txtmat = new TextField(5);
    Label lblsci = new Label("Science");
    TextField txtsci = new TextField(5);
    Label lbleng = new Label("English");
    TextField txteng = new TextField(5);
    Label lbltot = new Label("Total");
    TextField txttot = new TextField(5);
    Choice ch = new Choice();
    List lis = new List();
    Button btok = new Button("OK");
    Button btreset = new Button("RESET");
    Button btcan = new Button("CANCEL");
    FlowLayout fl = new FlowLayout();

    AWTControls(String s){
        super(s);
        add(lblname);
        add(txtname);
        add(lbladdr);
        add(txtaddr);
        add(lblmat);
        add(txtmat);
        add(lblsci);
        add(txtsci);
        add(lbleng);
        add(txteng);
        add(lbltot);
        add(txttot);
        ch.add("Physics");
        ch.add("Chemistry");
        ch.add("Maths");
        ch.add("Computer");
        ch.add("Biology");
        add(ch);
        lis.add("Music");
        lis.add("Drama");
        lis.add("Dance");
        lis.add("Martial arts");
        lis.add("Writing");
        add(lis);
        add(btok);
        add(btreset);
        add(btcan);
        setLayout(fl);

        setSize(700,500);
        show();

    }

    public static void main(String[] args) {
        AWTControls ob1 = new AWTControls("Student Information");
    }

}
