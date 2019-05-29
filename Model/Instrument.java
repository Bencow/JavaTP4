/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author benco
 */
public class Instrument {
    private ArrayList<Fonds> m_liste;
    
    //Constructors
    public Instrument()
    {
        m_liste = new ArrayList<>();
    }
    
    public void ajouterFond(Fonds f)
    {
        m_liste.add(f);
    }
    public ArrayList<Fonds> getList()
    {
        return m_liste;
    }
    
}
