/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listex;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author camil
 */
public class ListEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> colors = new ArrayList<String>();
        colors.add("blue");
        String[] array = new String[]{"red", "green", "white"};
        List colors2 = Arrays.asList(array);
        colors.addAll(colors2);
        colors.set(1, "purple");
        int size = colors.size();
        System.out.println("Last color added: " + colors.get(colors.size()-1));
        System.out.println("All Colors added: " + colors);
        System.out.println("Object size: " + size);
        if(colors.contains("purple")){
            colors.remove("purple");
        }
        System.out.println("All Colors added: " + colors);
        System.out.println("Object size: " + colors.size());
    }
    
}
