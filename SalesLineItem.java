/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tpv;

/**
 *
 * @author joan
 */
public class SalesLineItem {
    private Item item;
    private int quantity;
    public SalesLineItem(Item unItem, int quant) //no em surt fen servir itemID enlloc de intem
    {
            item=unItem;
            quantity=quant;
    }
    public SalesLineItem(SalesLineItem linia)
    {
        item=linia.getItem();
        quantity=linia.getQuantity();
    }
    public void setSalesItem(Item prod)
    {
        item=prod;
    }
    public void setQuantity(int quant)
    {
        quantity=quant;
    }
    public Item getItem()
    {
        return item;
    }
    public int getQuantity()
    {
        return quantity;
    }
}
