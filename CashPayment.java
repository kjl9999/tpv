/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tpv;

/**
 *
 * @author joan
 */
public class CashPayment {
    private int amountTendered;
    public CashPayment(int amount)
    {
        amountTendered=amount;
    }
    public int getAmount()
    {
        return amountTendered;
    }
    public void setAmout(int amount)
    {
        amountTendered=amount;
    }

}
