/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.*;

/**
 *
 * @author benco
 */
public class TestMain {
    public static void main(String args[])
    {
        try
        {
            Portefeuille p = new Portefeuille();
            p.ajouterFond("Livret jeune", 1000);
            double x = p.trouverFond("Lvret jeune");
            
            p.ajouterInstrument("instrument1", )
            
            System.out.println("salut " + x);
        }
        catch(InstrumentInexistant e)
        {
            System.out.println("Exception Instrument Inexistant");

        }
        catch(FondsInexistant e)
        {
            System.out.println("Exception Fonds Inexistant");
        }
    }
}
