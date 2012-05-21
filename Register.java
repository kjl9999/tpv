/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tpv;

/**
 *
 * @author joan
 */
import java.util.Collection;
import java.util.Iterator;
public class Register {
    private int registerID;
    private Cashier treballador;
    private Sale venda;
    private Store botiga;
    public Register(int id, Cashier worker, Store store)
    {
        registerID=id;
        treballador=worker;
        botiga=store;
    }
    public Register(Register unRegister)
    {
        registerID=unRegister.getID();
        treballador=unRegister.getCashier();
        botiga=unRegister.getStore();
    }
    public void setID(int id)
    {
        registerID=id;
    }
    public int getID()
    {
        return registerID;
    }
    public void setCashier(Cashier worker)
    {
        treballador.setID(registerID);
    }
    public Cashier getCashier()
    {
        return treballador;
    }

    public Sale getSale()
    {
        return venda;
    }
    public Store getStore()
    {
        return botiga;
    }

        public Sale crearNovaVenda()
    {
        Sale v=new Sale(this);
        venda=v;
        return v;
    }
    public void ferPagament(int amount)
    {
        CashPayment p=new CashPayment(amount);
        venda.setPay(p);
        botiga.getLedger().addSale(venda);
        int canvi = amount-venda.getTotal();
        if(canvi>=0)
            venda.setCanvi(canvi);
    }
        public SalesLineItem introduirProducte(Item item, int quant)
    {
        SalesLineItem lvp=new SalesLineItem(item, quant);
        venda.getLines().put(item.getDescription().getItemID(), lvp);
        return lvp;
    }
    public void finalitzaVenda()
    {
        Collection col = venda.getLines().values();
        Iterator cIt=col.iterator();
        while(cIt.hasNext())
        {
            SalesLineItem line=(SalesLineItem)cIt.next();
            int quant=line.getQuantity();
            int newQuant=line.getItem().getQuantity();
            newQuant=newQuant-quant;
            line.getItem().setQuantity(newQuant);
        }
        venda.setFinalitzat(true);
    }
}
