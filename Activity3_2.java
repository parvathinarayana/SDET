import java.util.HashSet;

public class Activity3_2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("ABC");
        hs.add("PQR");
        hs.add("XYZ");
        hs.add("LMN");
        hs.add("DEF");
        hs.add("HIJ");
        
        
        System.out.println("HashSet: " + hs);        
   
        System.out.println("Size of HashSet: " + hs.size());
        
        
        System.out.println("Removing PQR from HashSet: " + hs.remove("PQR"));
            if(hs.remove("HIJ")) {
        	System.out.println("HIJ removed from the Set");
        } else {
        	System.out.println("HIJ is not present in the Set");
        }
        
              System.out.println("Checking if DEF is present: " + hs.contains("M"));
      
        System.out.println("HashSet is: " + hs);
    }
}