package a_w_t.mouseListener1;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerEx extends Frame implements MouseListener{

    Label l1 = new Label("Maths");
    Label l2 = new Label("Science");
    Label l3 = new Label("English");
    TextField t1 = new TextField(20);
    TextField t2 = new TextField(20);
    TextField t3 = new TextField(20);
    TextField t4 = new TextField(20);
    Button b1 = new Button("Find avg");
    Button b2 = new Button("Submit");
    GridLayout gl = new GridLayout(5,2);

    public MouseListenerEx(){
        setSize(300,300);
        show();
        setLayout(gl);
        setTitle("marks");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(t4);
        add(b1);
        add(b2);
        b2.setVisible(false);
        b1.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e){

        int sci,math,eng,avg=0;
        String s1 = t1.getText();
        String s2 = t2.getText();
        String s3 = t3.getText();
        sci = Integer.parseInt(s1);
        math = Integer.parseInt(s2);
        eng = Integer.parseInt(s3);
        avg = (sci + math + eng)/3;

        if(avg>=75){
            b2.setVisible(true);
            t4.setText(avg+"");
            t4.setBackground(Color.GREEN);
        }else{
            t4.setText("You r not eligibel ");
            t4.setBackground(Color.red);
        }

    }

    @Override
    public void mousePressed(MouseEvent e){
    }

    @Override
    public void mouseReleased(MouseEvent e){
    }

    @Override
    public void mouseEntered(MouseEvent e){
    }

    @Override
    public void mouseExited(MouseEvent e){
    }

    public static void main(String[] args) {
        MouseListenerEx ob1 = new MouseListenerEx();
    }

}
