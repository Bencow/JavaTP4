/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author benco
 */
public class Portefeuille {
    private HashMap<String, Fonds> m_map1;
    private HashMap<String, Instrument> m_map2;
    
    //Constructors
    public Portefeuille()
    {
        m_map1 = new HashMap<>();
        m_map2 = new HashMap<>();
    }
    public double trouverFond(String key)throws FondsInexistant
    {
        if(m_map1.containsKey(key))
        {
            //retourne la valeur du Fond
            return m_map1.get(key).getVal();
        }
        else
        {
            //jeter l'exception
            throw new FondsInexistant();
        }
    }
    public ArrayList<Fonds> trouverInstrument(String key)throws InstrumentInexistant
    {
        if (m_map2.containsKey(key)) 
        {
            //retourne la valeur du Fond
            return m_map2.get(key).getList();
        }
        else
        {
            throw new InstrumentInexistant();
        }
    }
    public void ajouterFond(String key, double val)
    {
        Fonds f = new Fonds(val);
        m_map1.put(key, f);
    }
    public void ajouterFondAInstrument(String key_instrument, Fonds f)
    {
        try
        {
            trouverInstrument(key_instrument);
        }
        catch(Exception e)
        {
            
        }
        m_map2.put(key_instrument, f);
    }
}
