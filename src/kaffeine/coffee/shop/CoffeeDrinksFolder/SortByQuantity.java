/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaffeine.coffee.shop;

import java.util.Comparator;

/**
 *
 * @author jeewan
 */
public class SortByQuantity implements Comparator<Item>{

    @Override
    public int compare(Item o1, Item o2) {
        
         if(o1.getQuantity() < o2.getQuantity())
            return -1;
        
        else if(o1.getQuantity() == o2.getQuantity())
            return 0;
        
        else
            return 1;
    }
    
    
    
}
