/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

public class Mercedes implements Car {

   @Override
   public void draw() {
      System.out.println("Brand: Mercedes");
   }
}