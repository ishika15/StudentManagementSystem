/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

/**
 *
 * @author Ishika Gupta
 */
public class DriverLoaded {
     
    public static void main(String[] args){
        
        String className="com.mysql.cj.jdbc.Driver";
        try{
            Class.forName(className);
            System.out.println("Driver loaded successfully");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Driver failed to loaded successfully");
            System.out.println("Exception"+ ex.getMessage());
        }
    }
}
