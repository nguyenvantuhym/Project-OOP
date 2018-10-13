/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class DictionaryManagement{
    private final String PATH = "Dictionary.txt";
    private static DictionaryManagement instance = null;
    public static DictionaryManagement getInstance() throws IOException
    {
        if(instance ==null)
        {
            instance = new DictionaryManagement();
            return instance;
        }
        else return instance;
    }
    protected DictionaryManagement() throws IOException
    {
        init();
    }
    private void init() throws IOException
    {
        getDataFromFile();
    }
    public void getDataFromFile() throws IOException
    {
        try
        {
            FileReader reader = new FileReader(PATH);
            BufferedReader read = new BufferedReader(reader);
            String data;
            while ((data = read.readLine()) != null) {
                //System.out.println(data);
                int index = data.indexOf("\t");
                Dictionary.getInstance().add(new Word(data.substring(0, index), data.substring(index + 1, data.length())));

            }
        }catch(IOException e)
        {
            System.out.println(e);
        }
    }
   
}
