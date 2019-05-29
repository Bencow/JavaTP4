/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author benco
 */
public class Fonds {
    private double m_val;

    //Constructors
    public Fonds()
    {
        m_val = 0;
    }
    public Fonds(double val)
    {
        m_val = val;
    }
    public double getVal()
    {
        return m_val;
    }
}
