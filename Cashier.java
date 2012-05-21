/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tpv;

/**
 *
 * @author joan
 */
public class Cashier {
    private int cashierID;
    public Cashier(int id)
    {
        cashierID=id;
    }
    public void setID(int id)
    {
        cashierID=id;
    }
    public int getID()
    {
        return cashierID;
    }
}
