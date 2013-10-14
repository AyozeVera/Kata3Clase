
package kata3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kata3 {

  
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
       /* File[] roots = File.listRoots();
        File c = roots[1];
        File[] files = c.listFiles();
        
        for (File file : roots) {
            System.out.println(file.getName() + " isHidden:" + file.isHidden() + "isDirectory" + file.isDirectory());
        }*/
           
     /*   
        File file = new File("C:/Users/clocal/Downloads/"  );// /prueba.txt
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
     */    
        
        // falla y no se xk: BufferedReader reader = new BufferedReader(new InputStreamReader());
        //String line = reader.readLine();
         BufferedInputStream inputStream = 
                 new BufferedInputStream(
                 new FileInputStream(
                 new File("C:/Users/Ayoze/prueba.txt")));
         while(true){
             int data = inputStream.read();
             if(data < 0) break;
             System.out.print((char) data);
                 
         }
         //Click derecho en el proyecto, propiedades, run, y en arguements pongo la ruta del archivo
         //para hacerte un software de consola con introducción de parámetros
            
         //Pruebas con UTF8 en sublime
         
         
    
    
    }
}
