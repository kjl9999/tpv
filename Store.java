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
;

public class Store {
    String name;
    String address;
    Catalog catalog;
    Ledger llibre;
    LinkedHashMap caixes;
    LinkedHashMap items;
    public Store(String unName, String unaAddress, Catalog unCatalog, Ledger unLedger)
    {
        name=unName;
        address=unaAddress;
        catalog=unCatalog; //Aquestes dos operacios
        llibre=unLedger;   //s'han de modificar
        caixes=new LinkedHashMap();
        items=new LinkedHashMap();
    }
    public void setName(String nom)
    {
        name=nom;
    }
    public String getName()
    {
        return name;
    }
    public void setAddress(String addr)
    {
        address=addr;
    }
    public String getAddress()
    {
        return address;
    }
    public void setRegister(Register unRegister)
    {
        if(!caixes.containsKey(unRegister.getID()))
            caixes.put(unRegister.getID(),unRegister);
    }
    public Register getRegister(int id)
    {
        return (Register)caixes.get(id);
    }
    public void removeRegister(int id)
    {
        caixes.remove(id);
    }
    public void addItem(Item unItem)
    {
        if(!items.containsKey(unItem.getDescription().getItemID()))
            items.put(unItem.getDescription().getItemID(), unItem);
    }
    public Item getItem(int id)
    {
        return (Item)items.get(id);
    }
    public Ledger getLedger()
    {
        return llibre;
    }
    public LinkedHashMap getItems()
    {
        return items;
    }

}
