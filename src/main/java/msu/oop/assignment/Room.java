package msu.oop.assignment;

public final class Room
{
    int length;

    int width;

    public Room(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public int getLength()
    {
        return this.length;
    }

    public int getWidth()
    {
        return this.width;
    }

    public int calculateFloorSpace()
    {
        return this.getLength() * this.getWidth();
    }

    @Override
    public String toString()
    {
        int area = this.calculateFloorSpace();

        return String.format("The floor space is %d square feet", area);
    }

    public static void main(String[] args)
    {
        int length = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        
        Room room = new Room(length, width);
        
        System.out.println(room.toString());
    }
}