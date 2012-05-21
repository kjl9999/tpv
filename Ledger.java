/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tpv;

/**
 *
 * @author joan
 */
import java.util.LinkedHashMap;
public class Ledger {
    private LinkedHashMap vendes;
    public Ledger()
    {
        vendes=new LinkedHashMap();
    }
    public void addSale(Sale unaVenda)
    {
        vendes.put(unaVenda.getID(), unaVenda);
    }
    public Sale getSale(int id)
    {
        return (Sale)vendes.get(id);
    }
}
