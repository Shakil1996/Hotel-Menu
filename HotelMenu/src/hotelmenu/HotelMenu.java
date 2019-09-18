/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmenu;

import java.util.Scanner;

/**
 *
 * @author Mohammed Shakil Uddin
 * w1549747
 */
public class HotelMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  
{
    Scanner Input = new Scanner (System.in);
    String Option;
    String roomName;
    String deleteRoom;
    int roomNumber = 0;

    String[] hotel = new String[10];
    initialise(hotel);
    
    while (roomNumber <10)
        {
        for (int x = 0; x < 10; x++)
         {
        if (hotel[x].equals("e")) System.out.println("Room " + x + " is Empty"); 
         } 
        
    System.out.println("Enter A to Add Room for Guest");
    System.out.println("Enter V to View all Rooms");
    System.out.println("Enter E to Edit Room");
    System.out.println("Enter D to Delete Room");
    System.out.println("Enter F to Find Room");
    System.out.println("Enter Z to Exit Program");
    Option = Input.next();
    
    if ("A".equals(Option)) {
    System.out.println("Enter A Room Number Between 0 - 9");            
    roomNumber = Input.nextInt();
    System.out.println("Enter The Name For That  Room  Number " + roomNumber + " :");
    roomName = Input.next();
    hotel[roomNumber] = roomName;
    }
    
    if ("V".equals(Option)) {
        for (int x = 0; x < 10; x++)
                 {
                System.out.println("Room " + x + " Occupied By: " + hotel[x]);
                 }
    }
    
    if ("E".equals(Option)) {
    System.out.println("Enter A Room Number Between 0 - 9 That You Want To Change");            
    roomNumber = Input.nextInt();
    System.out.println("Enter The New Name For That  Room  Number " + roomNumber + " :");
    roomName = Input.next();
    hotel[roomNumber] = roomName;
    }
    
    if ("D".equals(Option)) {
    System.out.println("Enter A Room Number Between 0 - 9");            
    deleteRoom = Input.next();
    hotel[roomNumber] = "e";
    }
    
    if ("F".equals(Option)) {
    System.out.println("Which Room Do You Wish To See 0 - 9");            
    roomNumber = Input.nextInt();
    int x = roomNumber;
                 {
                System.out.println("Room " + x + " Occupied By: " + hotel[x]);
                 }
    }
    
    if ("Z".equals(Option)) {
    System.out.println("Program Has Shut Down");
    System.exit(roomNumber);
    }
    }    
}    
    
    private static void initialise(String hotelRef[] ) 
    {
        for (int x = 0; x < 10; x++) hotelRef[x] = "e"; 
        System.out.println("Initialise");    
    }
}
