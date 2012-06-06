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

    FileInputStream cataleg = new FileInputStream("Cataleg.csv");
    InputStreamReader catalegReader = new InputStreamReader(cataleg);

    BufferedReader buf = new BufferedReader(catalegReader);

    String lineaFitxer;
    DescProduct desc;
    while((lineaFitxer=buf.readLine()) != null)
    {
        String[] par = lineaFitxer.split(",");
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
