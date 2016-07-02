/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample_java;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Yoshiyasu
 */
public class Sample_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] s_array1 = {"Tom", "Cris", "Kate"};
        System.out.println(Arrays.toString(s_array1));
        int[] i_array1 = new int[5];
        System.out.println(Arrays.toString(i_array1));
        char[] c_array1 = new char[5];
        System.out.println(Arrays.toString(c_array1));
        ArrayList s_array2 = new ArrayList();
        System.out.println(s_array2);
        HashMap<String, String> s_hmap1 = new HashMap<>();
        System.out.println(s_hmap1);
        for (String value : s_array1) {
            System.out.println(value);
        }
        for (Map.Entry<String, String> val : s_hmap1.entrySet()) { 
            System.out.println(val.getKey());
            System.out.println(val.getValue());
//            System.out.println(val);
            }
        }
    }
    
        
   
    
