package com.aadebuger.stock.ai;

/**
 * Hello world!
 *
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BiMap<String,String> bm =  HashBiMap.create();
        bm.put("600050", "301");
        bm.put("600050", "302");
        BiMap<String,String> ibm=bm.inverse();
        System.out.println("ibm = "+ibm);
    }
}
