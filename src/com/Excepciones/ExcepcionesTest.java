package com.Excepciones;

import java.util.ArrayList;

public class ExcepcionesTest {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");
        
        
        for (int i = 0; i < myList.size(); i++) {
            try {
                Object element = myList.get(i);
                if (element instanceof String) {//Chekea si hay elementos tipo String en el objeto
                    int castedValue = Integer.parseInt((String) element); //Transforma de string a número
                    System.out.println("El valor es: " + castedValue); 
                } else if (element == null) {
                    System.out.println("Error: el elemento es nulo");
                } else {
                    System.out.println("Error: el elemento no es una cadena");
                }
            } catch (NumberFormatException e) {//Esta excepción indica que no posee datos tipo String numéricos, por lo tanto, no se puede pasar a int
                System.out.println("Error: no se puede convertir el elemento a int");
            }
        }
    }
}

		    
		
	


