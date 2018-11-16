package msu.oop.assignment;

/**
 * Object Orinted Programming (CCS20704) - Assignment One.
 * Answer for question one.
 * 
 * @author Ahmad Shah Hafizan Hamidin
 * @version 1.0
 */
public final class Room
{   
    /**
     * Room length.
     */
    int length;

    /**
     * Room width.
     */
    int width;

    /**
     * Class contsructor.
     * 
     * @param length Room length
     * @param width Room width
     */
    public Room(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    /**
     * Get length value.
     * 
     * @return Specified room length
     */
    public int getLength()
    {
        return this.length;
    }

    /**
     * Set length value.
     * 
     * @param length Room length
     */
    public void setLength(int length)
    {
        this.length = length;
    }

    /**
     * Get with value.
     * 
     * @return specified room width
     */
    public int getWidth()
    {
        return this.width;
    }

    /**
     * Set width value.
     * 
     * @param width Room width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Calculate floor space. (area = length * witdh)
     * 
     * @return Floor space in square foot
     */
    public int calculateFloorSpace()
    {
        return this.getLength() * this.getWidth();
    }

    /**
     * String representation for calculated floor space.
     * 
     * @return The floor space is calculatedFloorSpace() square feet
     */
    @Override
    public String toString()
    {
        int area = this.calculateFloorSpace();

        return String.format("The floor space is %d square feet.", area);
    }

    /**
     * Main method
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        int length = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        
        Room room = new Room(length, width);
        //calculate floor space
        room.calculateFloorSpace();

        System.out.println(room);
    }
}