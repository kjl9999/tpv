/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tpv;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author joan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        Catalog cataleg=new Catalog();

        Ledger llibre=new Ledger();

        FinestraConfiguraBotiga f=new FinestraConfiguraBotiga(cataleg, llibre);
        f.show();
    }

}
