/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tpv;

/**
 *
 * @author joan
 */
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.Iterator;
public class Sale {
    private static int cont=1;
    private Date dateTime;
    private int total;
    private LinkedHashMap lines;
    private int saleID;
    private Register register;
    private boolean finalitzat;
    private CashPayment pay;
    private int canvi;
    public Sale(Register unRegister)
    {

        dateTime= new Date();
        lines=new LinkedHashMap();
        total=0;
        saleID=cont;
        register=unRegister;
        finalitzat=false;
        cont++;
    }
    public Sale(Sale unaVenda)
    {
        dateTime=unaVenda.getTime();
        lines=unaVenda.getLines();
        saleID=unaVenda.getID();
        total=unaVenda.getTotal();
        finalitzat=unaVenda.getFinalitzat();
    }
    public boolean getFinalitzat()
    {
        return finalitzat;
    }
    public Date getTime()
    {
        return dateTime;
    }
    public LinkedHashMap getLines()
    {
        return lines;
    }
    public int getTotal()
    {
        total=0;
        Collection col = lines.values();
        Iterator cIt=col.iterator();
        while(cIt.hasNext())
        {
            SalesLineItem line=(SalesLineItem)cIt.next();
            total=total+((line.getQuantity())*line.getItem().getDescription().getPrice());
        }
        return total;

    }
    public void addLine(SalesLineItem linia)
    {
        lines.put(linia.getItem().getDescription().getItemID(), linia);
        total=this.getTotal();
    }
    public SalesLineItem getLine(int idItem)
    {
        return (SalesLineItem)lines.get(idItem);
    }
    public int getID()
    {
        return saleID;
    }

   
    public int getRegisterID()
    {
        return register.getID();
    }

   public void setPay(CashPayment cPay)
   {
        pay=cPay;
   }
   public CashPayment getPay()
   {
        return pay;
   }
   public void setCanvi(int amount)
   {
       canvi=amount;
   }
   public int getCanvi()
   {
       return canvi;
   }
   public void setFinalitzat(boolean fin)
   {
        finalitzat=fin;
   }
}