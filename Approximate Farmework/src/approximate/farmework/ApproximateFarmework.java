/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package approximate.farmework;

import java.util.List;

/**
 *
 * @author Mehran
 */
public class ApproximateFarmework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Importing the basic model
        MDPGraph g = new MDPGraph(10); 
        g.transition(1, 0, 0.1, 'a'); 
        g.transition(0, 2, 0.2, 'b'); 
        g.transition(2, 1, 0.35, 'a'); 
        g.transition(0, 3, 1, 'a'); 
        g.transition(3, 4, 0.2, 'c'); 
  
        System.out.println("The list of SCCs are as follows:"); 
        List C=g.SCC();
        List tra = g.trans;
        g.TransPrint();
        g.SCCPrint();
        

        
    }
    
}
