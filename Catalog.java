/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tpv;

/**
 *
 * @author joan
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Catalog {
    LinkedHashMap ProdCatalog;

    public Catalog() throws FileNotFoundException, IOException
    {
      ProdCatalog=new LinkedHashMap();

    FileInputStream cat = new FileInputStream("Cataleg.csv");
    InputStreamReader catRead = new InputStreamReader(cat);

    BufferedReader buf = new BufferedReader(catRead);

    String st;
    DescProduct desc;
    while((st=buf.readLine()) != null)
    {
        String[] par = st.split(",");
        desc=new DescProduct(Integer.valueOf(par[0]),par[1],Integer.valueOf(par[2]));
        ProdCatalog.put(desc.getItemID(), desc);
    }

    }
    public void AddProdToCatalog(DescProduct prod)
    {
        ProdCatalog.put(prod.getItemID(),prod);
    }
    public DescProduct GetProdFromCatalog(int prodID)
    {
        return (DescProduct)ProdCatalog.get(prodID);
    }
    public LinkedHashMap getList()
    {
        return ProdCatalog;
    }
}
