package msu.oop.assignment.rectangle;

/**
 * Object Orinted Programming (CCS20704) - Assignment One. Answer for question
 * four.
 * 
 * @author Ahmad Shah Hafizan Hamidin
 * @version 1.0
 */
public final class Rectangle
{
    /**
     * Rectangle length.
     */
    public double length;

    /**
     * Rectangle width.
     */
    public double width;

    /**
     * Class constructor.
     * 
     * @param l User input rectangle length
     * @param w User input rectangle width
     */
    public Rectangle(double l, double w)
    {
        this.length = l;
        this.width = w;
    }

    /**
     * Calculate rectangle perimeter
     * 
     * @return Perimeter
     */
    public double perimeter()
    {
        return (this.length + this.width) * 2;
    }
}