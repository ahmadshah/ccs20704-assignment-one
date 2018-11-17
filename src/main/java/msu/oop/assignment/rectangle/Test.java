package msu.oop.assignment.rectangle;

import javax.swing.JOptionPane;

/**
 * Object Orinted Programming (CCS20704) - Assignment One. Answer for question
 * four.
 * 
 * @author Ahmad Shah Hafizan Hamidin
 * @version 1.0
 */
public final class Test
{
    /**
     * Main method
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {   
        double length, width;
        length = Double.parseDouble(JOptionPane.showInputDialog("Rectangle length"));
        width = Double.parseDouble(JOptionPane.showInputDialog("Rectangle width"));

        Rectangle R = new Rectangle(length, width);

        String output = "Perimeter is " + R.perimeter();

        JOptionPane.showMessageDialog(null, output);
        System.exit(1);
    }
}