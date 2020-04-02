/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendual;

/**
 *
 * @author unaii
 */
public interface doc
{
   
   // Devuelve el contenido del archivo tras insertar la linea line en la linea numero x, el contenido de la linea x, pasa a ser la linea x+1 y asi sucesivamente.
   public abstract String escribirLinea(int x, String line, String file);
   
   
}
