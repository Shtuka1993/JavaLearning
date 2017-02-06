package a_w_t.actionListener;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StudentFormEx extends Frame implements ActionListener {
    Label lblname = new Label("Name");
    TextField txtname = new TextField(20);
    Label lbladdr = new Label("Address");
    TextArea txtaddr = new TextArea("Adress",15,45);
    Label lblmat = new Label("Math");
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

    StudentFormEx(String s){
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
        ch.add("Phisics");
        ch.add("Chemistry");
        ch.add("Maths");
        ch.add("Computer");
        ch.add("Biology");
        add(ch);
        lis.add("Music");
        lis.add("Drama");
        lis.add("Dance");
        lis.add("Martil arts");
        lis.add("Writing");
        add(lis);
        add(btok);
        add(btreset);
        btreset.addActionListener(this);
        add(btcan);
        btcan.addActionListener(this);
        setLayout(fl);

        setSize(700,500);
        show();

    }

    public void actionPerformed(ActionEvent e){

        String s1=null;
        if(e.getSource()==btreset){
            txtname.setText("Yuriy");
            lis.select(1);
            s1=txtname.getText();
            ch.select("Computer");
        }
        if(e.getSource()==btcan){
            System.exit(0);
        }
        System.out.println(s1);
    }

    public static void main(String[] args) {
        StudentFormEx ob1 = new StudentFormEx("Student Information");
    }

}
