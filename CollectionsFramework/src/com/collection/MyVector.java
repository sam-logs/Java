package com.collection;
import java.util.*;

public class MyVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vector<String> vec = new Vector<String>();  
          
         vec.add("Tiger");  
         vec.add("Lion");  
         vec.add("Dog");  
         vec.add("Elephant");  
           
         vec.addElement("Rat");  
         vec.addElement("Cat");  
         vec.addElement("Deer");  
           
         System.out.println("Elements are: "+vec);  
         System.out.println("Size of vector: "+vec.size());
         System.out.println("Capacity of vector: "+vec.capacity());
         vec.insertElementAt("Wolf", 4);
         vec.removeElementAt(2);
         System.out.println("Updated Elements are: "+vec);
         
         
      

	}

}
