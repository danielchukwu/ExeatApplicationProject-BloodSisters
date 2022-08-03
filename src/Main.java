import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class Main {

    public static void main (String [] args) {
        // Here we will call our gui
        JFrame frame = new JFrame("Blood Sisters Exeat");
        frame.setSize(500, 1000);
        frame.setLayout(new GridLayout(7, 1));

        // create name label and name text field
        JLabel nameLabel = new JLabel("NAME:");
        JTextField nameText = new JTextField();
        frame.add(nameLabel); // add
        frame.add(nameText);  // add

        // create matric label and matric text field
        JLabel matricnumLabel = new JLabel("MATRIC NUMBER:");
        JTextField matricnumText = new JTextField();
        frame.add(matricnumLabel);  // add
        frame.add(matricnumText);  // add

        // create why label and why text field
        JLabel whyLabel = new JLabel("WHY:");
        JTextField whyText = new JTextField();
        frame.add(whyLabel);  // add
        frame.add(whyText);   // add

        // create enterbutton label and enterbutton text field
        JButton enterButton = new JButton("ENTER");
        enterButton.setBackground(Color.darkGray);
        enterButton.setForeground(Color.white);
        frame.add(enterButton);

        // visibility of frame = true
        frame.setVisible(true);

        // do something when button is clicked on
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x = nameText.getText();
                String y = matricnumText.getText();
                String z = whyText.getText();

                // write to file
                try {
                    FileWriter file = new FileWriter("exeats.txt");  // create file with name -> exeats.txt
                    file.append("Name: " + x);  // append
                    file.append("\nMatric Number: " + y);  // append
                    file.append("\nWhy: " + z);  // append
                    file.append("\n");  // append
                    file.append("\nStatus: " + "ALLOWED");  // append
                    file.close(); // close project
                } catch (Exception ex) {
                    System.out.println();
                }
            }
        });
    }
}
