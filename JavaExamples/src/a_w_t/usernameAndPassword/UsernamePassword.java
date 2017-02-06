package a_w_t.usernameAndPassword;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsernamePassword extends Frame implements ActionListener{

    Label lblname = new Label("NAME");
    TextField txtname = new TextField(10);
    Label lbluser = new Label("USERNAME");
    TextField txtuser = new TextField(10);
    Label lblpwd = new Label("PASSWORD");
    TextField txtpwd = new TextField(10);
    Button btok = new Button("OK");
    Button btreset = new Button("RESET");
    Button btcan = new Button("CANCEL");
    FlowLayout fl = new FlowLayout();

    UsernamePassword(String s){
        super(s);
        add(lblname);
        add(txtname);
        txtname.addActionListener(this);
        add(lbluser);
        add(txtuser);
        txtuser.addActionListener(this);
        add(lblpwd);
        add(txtpwd);
        txtpwd.addActionListener(this);
        add(btok);
        btok.addActionListener(this);
        add(btreset);
        btreset.addActionListener(this);
        add(btcan);
        btcan.addActionListener(this);
        setLayout(fl);
        setSize(550,350);
        show();
    }

    public void actionPerformed(ActionEvent e){
        //String s1=null;
        String s1 = "";
        if(e.getSource()==btcan){
            setBackground(Color.RED);
        }
        if(e.getSource()==btreset){
            setBackground(Color.gray);
            txtuser.setText(s1);
            txtpwd.setText(s1);
            txtname.setText(s1);
        }
        if(e.getSource()==btok){
            if("admin".equals(txtuser.getText())&&"1111".equals(txtpwd.getText())){
                btok.setBackground(Color.green);
            }
            else{
                btok.setBackground(Color.black);
                btok.setForeground(Color.white);
            }
        }


    }

    public static void main(String[] args) {
        UsernamePassword ob = new UsernamePassword("User Information");
    }

}
