/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tpv;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import junit.framework.TestCase;

/**
 *
 * @author joan
 */
public class SaleTest extends TestCase {
    
    public SaleTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * S'ha afegit per comprobar el flux de cades de l'operació
     */
    public void testGetFinalitzat() throws FileNotFoundException, IOException {
        Catalog unCatalog=new Catalog();
        Ledger unLedger=new Ledger();
        Store botiga=new Store("nom", "Adresa", unCatalog, unLedger);
        Cashier worker=new Cashier(1);
        Register caixa=new Register(1,worker,botiga);
        System.out.println("getFinalitzat");
        Sale instance = new Sale(caixa);
        boolean expResult = false;
        boolean result = instance.getFinalitzat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * S'ha afegit per comprobar el flux de cades de l'operació
     */
    public void testGetTime() throws FileNotFoundException, IOException {
        Catalog unCatalog=new Catalog();
        Ledger unLedger=new Ledger();
        Store botiga=new Store("nom", "Adresa", unCatalog, unLedger);
        Cashier worker=new Cashier(1);
        Register caixa=new Register(1,worker,botiga);
        System.out.println("getTime");
        Sale instance = new Sale(caixa);
        int expResult = (new Date()).getMinutes();
        int result = instance.getTime().getMinutes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * S'ha afegit per comprobar el flux de cades de l'operació
     */
    public void testGetLines() throws FileNotFoundException, IOException {
        Catalog unCatalog=new Catalog();
        Ledger unLedger=new Ledger();
        Store botiga=new Store("nom", "Adresa", unCatalog, unLedger);
        Cashier worker=new Cashier(1);
        Register caixa=new Register(1,worker,botiga);
        System.out.println("getLines");
        Sale instance = new Sale(caixa);
        LinkedHashMap expResult = new LinkedHashMap();
        LinkedHashMap result = instance.getLines();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * S'ha afegit per comprobar el flux de cades de l'operació
     */
    public void testGetTotal() throws FileNotFoundException, IOException {
        Catalog unCatalog=new Catalog();
        Ledger unLedger=new Ledger();
        Store botiga=new Store("nom", "Adresa", unCatalog, unLedger);
        Cashier worker=new Cashier(1);
        Register caixa=new Register(1,worker,botiga);
        Item item=new Item(new DescProduct(1,"prod1",10));
        System.out.println("getTotal");
        Sale instance = new Sale(caixa);
        instance.addLine(new SalesLineItem(item, 1));
        int expResult = 10;
        int result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * S'ha afegit per comprobar el flux de cades de l'operació
     */
    public void testAddLine() throws FileNotFoundException, IOException {
        Catalog unCatalog=new Catalog();
        Ledger unLedger=new Ledger();
        Store botiga=new Store("nom", "Adresa", unCatalog, unLedger);
        Cashier worker=new Cashier(1);
        Register caixa=new Register(1,worker,botiga);
        Item item=new Item(new DescProduct(1,"prod1",10));
        System.out.println("addLine");
        SalesLineItem linia = new SalesLineItem(item,1);
        Sale instance = new Sale(caixa);
        instance.addLine(linia);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * S'ha afegit per comprobar el flux de cades de l'operació
     */
    public void testGetLine() throws FileNotFoundException, IOException {
        Catalog unCatalog=new Catalog();
        Ledger unLedger=new Ledger();
        Store botiga=new Store("nom", "Adresa", unCatalog, unLedger);
        Cashier worker=new Cashier(1);
        Register caixa=new Register(1,worker,botiga);
        Item item=new Item(new DescProduct(1,"prod1",10));
        SalesLineItem line=new SalesLineItem(item,1);
        System.out.println("getLine");
        int idItem = 1;
        Sale instance = new Sale(caixa);
        instance.addLine(line);
        SalesLineItem expResult = line;
        SalesLineItem result = instance.getLine(idItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * S'ha afegit per comprobar el flux de cades de l'operació
     */
    public void testGetID() throws FileNotFoundException, IOException {
        Catalog unCatalog=new Catalog();
        Ledger unLedger=new Ledger();
        Store botiga=new Store("nom", "Adresa", unCatalog, unLedger);
        Cashier worker=new Cashier(1);
        Register caixa=new Register(1,worker,botiga);
        System.out.println("getID");
        Sale instance = new Sale(caixa);
        int expResult = 7;      //expResult es 7 perque durant el test aquesta es la 7a sale creada
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * S'ha afegit per comprobar el flux de cades de l'operació
     */
    public void testGetRegisterID() throws FileNotFoundException, IOException {
        Catalog unCatalog=new Catalog();
        Ledger unLedger=new Ledger();
        Store botiga=new Store("nom", "Adresa", unCatalog, unLedger);
        Cashier worker=new Cashier(1);
        Register caixa=new Register(1,worker,botiga);
        System.out.println("getRegisterID");
        Sale instance = new Sale(caixa);
        int expResult = 1;
        int result = instance.getRegisterID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * S'ha afegit per comprobar el flux de cades de l'operació
     */
    public void testSetPay() throws FileNotFoundException, IOException {
        Catalog unCatalog=new Catalog();
        Ledger unLedger=new Ledger();
        Store botiga=new Store("nom", "Adresa", unCatalog, unLedger);
        Cashier worker=new Cashier(1);
        Register caixa=new Register(1,worker,botiga);
        System.out.println("setPay");
        CashPayment cPay = new CashPayment(1);
        Sale instance = new Sale(caixa);
        instance.setPay(cPay);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * S'ha afegit per comprobar el flux de cades de l'operació
     */
    public void testGetPay() throws FileNotFoundException, IOException {
        Catalog unCatalog=new Catalog();
        Ledger unLedger=new Ledger();
        Store botiga=new Store("nom", "Adresa", unCatalog, unLedger);
        Cashier worker=new Cashier(1);
        Register caixa=new Register(1,worker,botiga);
        System.out.println("getPay");
        Sale instance = new Sale(caixa);
        CashPayment p = new CashPayment(1);
        CashPayment expResult = p;
        instance.setPay(p);
        CashPayment result = instance.getPay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * S'ha afegit per comprobar el flux de cades de l'operació
     */
    public void testSetCanvi() throws FileNotFoundException, IOException {
        Catalog unCatalog=new Catalog();
        Ledger unLedger=new Ledger();
        Store botiga=new Store("nom", "Adresa", unCatalog, unLedger);
        Cashier worker=new Cashier(1);
        Register caixa=new Register(1,worker,botiga);
        System.out.println("setCanvi");
        int amount = 0;
        Sale instance = new Sale(caixa);
        instance.setCanvi(amount);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * S'ha afegit per comprobar el flux de cades de l'operació
     */
    public void testGetCanvi() throws FileNotFoundException, IOException {
        Catalog unCatalog=new Catalog();
        Ledger unLedger=new Ledger();
        Store botiga=new Store("nom", "Adresa", unCatalog, unLedger);
        Cashier worker=new Cashier(1);
        Register caixa=new Register(1,worker,botiga);
        System.out.println("getCanvi");
        Sale instance = new Sale(caixa);
        instance.setCanvi(0);
        int expResult = 0;
        int result = instance.getCanvi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * S'ha afegit per comprobar el flux de cades de l'operació
     */
    public void testSetFinalitzat() throws FileNotFoundException, IOException {
        Catalog unCatalog=new Catalog();
        Ledger unLedger=new Ledger();
        Store botiga=new Store("nom", "Adresa", unCatalog, unLedger);
        Cashier worker=new Cashier(1);
        Register caixa=new Register(1,worker,botiga);
        System.out.println("setFinalitzat");
        boolean fin = true;
        Sale instance = new Sale(caixa);
        instance.setFinalitzat(fin);
        // TODO review the generated test code and remove the default call to fail.
    }

}
