import java.awt.*;
import javax.swing.*;
class DemoGul
{
public static void main (String arg[])

{
    JFrame frm =new JFrame();
    Container con= frm.getContentpane ();
    FlowLayout flw=new FlowLayout();
    con.setLayout(flw);
    JButton btn1=new JButton("clic me1");
    JButton btn2=new JButton ("clic me 2");
    con.add(btn1);
    con.add(btn2);
 frm.setSize(300,600);
 frm.setVisible(true);
 frm.setDefaultCloseOperation(3);

}
}