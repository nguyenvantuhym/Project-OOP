/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Dictionary extends ArrayList<Word>{
    private static Dictionary instance = null;
    public static Dictionary getInstance()
    {
        if(instance ==null)
        {
            instance = new Dictionary();
            return instance;
        }
        else return instance;
    }
    protected Dictionary()
    {
        
    }
    
}
