/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minishell;

import java.util.Scanner;

/**
 *
 * @author Doris Lehner
 */
public class MiniShell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Dorli's-Macbook: ");
        Scanner s = new Scanner(System.in);
        String input = s.next();
        String[] Args = null;
        int argscount=0;
        for(int i = 0; i < input.length();i++)
        {
            if(i == ' ')
            {
                
                Args[argscount] = input+i;
                argscount++;
            }
            if(i == '&')
            {
                ProcessBuilder pb = new ProcessBuilder(input);
                pb.inheritIO(); 
                 try {
                    Process p = pb.start(); // <-- forkAndExec on Unix
                     p.waitFor(); // <-- waits for the forked process to complete.
                    } catch (Exception e) {
                    e.printStackTrace();
                    }


            }
        }
    }
    
}
