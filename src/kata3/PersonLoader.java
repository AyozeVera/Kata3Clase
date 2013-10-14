/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kata3;


public class PersonLoader {
  
    public static Person load(String name){
         if (name == null) throw new NullPointerException("Name can not be null");
         return new Person(name);
    }
  
}
