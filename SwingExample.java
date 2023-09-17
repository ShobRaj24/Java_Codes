package Shob_RAj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample implements ActionListener {
    private JFrame frame;
    private JTextField num1TextField;
    private JTextField num2TextField;
    private JButton addButton;
    private JLabel resultLabel;

    public SwingExample() {
        frame = new JFrame("Addition GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
       // frame.setLayout(new GridLayout(4, 1));
        //JFrame frameobj = new JFrame();  //creating frame
		frame.setSize(500, 500);  //declaring frame size
		
		GridLayout g1=new GridLayout(4,2);  // layout of the frame
		frame.setLayout(g1);		
        num1TextField = new JTextField();
        num2TextField = new JTextField();
        addButton = new JButton("Add");
        resultLabel = new JLabel();

        addButton.addActionListener(this);

        frame.add(new JLabel("Number 1:"));
        frame.add(num1TextField);
        frame.add(new JLabel("Number 2:"));
        frame.add(num2TextField);
        frame.add(addButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(num1TextField.getText());
            int num2 = Integer.parseInt(num2TextField.getText());
            int sum = num1 + num2;
            resultLabel.setText("Result: " + sum);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new SwingExample();
    }
}

