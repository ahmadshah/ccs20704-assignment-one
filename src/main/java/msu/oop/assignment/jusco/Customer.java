package msu.oop.assignment.jusco;

/**
 * Object Orinted Programming (CCS20704) - Assignment One. Answer for question
 * five.
 * 
 * @author Ahmad Shah Hafizan Hamidin
 * @version 1.0
 */
public final class Customer
{
    /**
     * Customer's name.
     */
    private String CustName;

    /**
     * Customer's address.
     */
    private String CustAddress;

    /**
     * Customer's accumulated reward points.
     */
    private int pointRewards;

    /**
     * Maximum points collected for bonus.
     */
    private static final int MAX_POINT = 300;

    /**
     * Bonus point.
     */
    private static final int BONUS_POINT = 50;

    /**
     * Class constructor.
     * 
     * @param CustomerName Customer's name
     * @param CustomerAddress Customer's address
     * @param point Customer's reward points
     */
    public Customer(String CustomerName, String CustomerAddress, int point)
    {
        this.CustName = CustomerName;
        this.CustAddress = CustomerAddress;
        this.pointRewards = point;
    }

    /**
     * Calculate reward points.
     * 
     * @return Total accumulated points
     */
    public int calculatePoint()
    {
        if(this.pointRewards > MAX_POINT) {
            return this.pointRewards + BONUS_POINT;
        }

        return this.pointRewards;
    }
}