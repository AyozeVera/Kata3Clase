/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.io.File;

/**
 *
 * @author Ayoze
 */
public class Kata3 {

  
    
    public static void main(String[] args) {
        // TODO code application logic here
       /* File[] roots = File.listRoots();
        File c = roots[1];
        File[] files = c.listFiles();
        
        for (File file : roots) {
            System.out.println(file.getName() + " isHidden:" + file.isHidden() + "isDirectory" + file.isDirectory());
        }*/
            
        File file = new File("C:/Users/clocal/Downloads/" /*/prueba.txt*/ );
        System.out.println(file.exists());
        file.mkdir();
        System.out.println(file.exists());
        file.mkdirs(); //ruta completa
        System.out.println(file.exists());
        //file.createNewFile(); crea un fichero
        System.out.println(file.exists());
        file.deleteOnExit(); //borra al terminar
      //  File temporalFile = File.createTempFile("test", "data");  archivo temporal
        try{
            Person person = PersonLoader.load(null);
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        
        
        //BufferedReader reader = new BufferedReader(new InputString)
    }
}
