/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tpv;

/**
 *
 * @author joan
 */
public class Item {
    private int quantity;
    private DescProduct description;

    public Item(DescProduct desc)
    {
        quantity=0;
        description=desc;
        //description=new DescProduct(desc.getItemID(),desc.getDescription(),desc.getPrice());
    }

    public Item(int quant, DescProduct desc)
    {
        quantity=quant;
        description=desc;
        //description=new DescProduct(desc.getItemID(),desc.getDescription(),desc.getPrice());
    }
    public void setQuantity(int quant)
    {
        quantity=quant;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public DescProduct getDescription()
    {
        return description;
    }
}
