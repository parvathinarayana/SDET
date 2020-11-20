import java.util.ArrayList;

public class Activity3_1 {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("abc");
		myList.add("def");
		myList.add("ghi");
		myList.add("jkm");
		myList.add("lmn");
        System.out.println("Array is:");
    	
        for(String arr:myList){
	
            System.out.println(arr);
		
	    }
        System.out.println("abc present?: " + myList.contains("abc"));
        System.out.println("Size of ArrayList: " + myList.size());
        myList.remove("lmn");
        System.out.println("After removing lmn, size of ArrayList is: " + myList.size());
	}

}
