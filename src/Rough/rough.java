package Rough;
import java.awt.*;
import javax.swing.*;
import javax.swing.*;
public class rough {

    JFrame a;
    rough(){
        a = new JFrame("example");
        String courses[] = { "core java","advance java", "java servlet"};
        JComboBox c = new JComboBox(courses);
        c.setBounds(40,40,90,20);
        a.add(c);
        a.setSize(400,400);
        a.setLayout(null);
        a.setVisible(true);
    }
    public static void main(String args[])
    {
        new rough();
    }
}
