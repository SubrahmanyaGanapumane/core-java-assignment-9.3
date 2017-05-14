package session9;


import java.util.HashMap;
public class Hashmap{ 
  

public static void main(String[] args) {
     // Create a HashMap
     HashMap<String, String> hmap = new HashMap<String, String>();
 
   
     hmap.put("Empcode", "Empname");
     
 
    
     String val=hmap.get("Empcode");
     System.out.println("The Value mapped to Key Empcode is:"+ val);
     
      
}
 
}
