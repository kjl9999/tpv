/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tpv;

/**
 *
 * @author joan
 */
public class DescProduct {
    private int itemID;
    private String Description;
    private int price;

    public DescProduct(int unID, String unaDescription, int preu)
    {
        itemID=unID;
        Description=unaDescription;
        price=preu;
    }

    public void setID(int unID)
    {
        itemID=unID;
    }
    public void setDescription(String unaDescription)
    {
        Description=unaDescription;
    }
    public void setPrice(int unPreu)
    {
        price=unPreu;
    }

    public int getItemID()
    {
        return itemID;
    }
        public String getDescription()
    {
        return Description;
    }
    public int getPrice()
    {
        return price;
    }

}
