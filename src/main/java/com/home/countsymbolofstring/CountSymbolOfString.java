/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.home.countsymbolofstring;
import java.util.*;
/**
 *
 * @author PC
 */
public class CountSymbolOfString 
{

    public static void main(String[] args) throws Exception
    {
        System.out.println("Input a string");
        var oScanner = new Scanner(System.in);
        var strLine = oScanner.nextLine();
        System.out.println("Input a symbol");
        var c = 0;
        var chSym = (char)System.in.read();
        var nLen = strLine.length();
        for (int i = 0; i < nLen; i++)
        {
            if (strLine.charAt(i) == chSym)
            {
               c++;
            }
        }
        oScanner.close();
        var fltPart = ((float)c / nLen) * 100f;
        System.out.printf("The symbol \"%c\" occurs %d times\r\n", chSym, c);
        System.out.printf
        (
            "The symbol \"%c\" occupies %.2f %% of the string \"%s\"\r\n",
            chSym, fltPart, strLine
        );
    }
}
