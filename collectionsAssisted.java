import java.util.*;

public class collectionsAssisted {

	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Hyderabad");//
	      city.add("Bangalore");    	   
	      System.out.println(city);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vector = new Vector();
	      vector.addElement(2); 
	      vector.addElement(3); 
	      System.out.println(vector);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Romeo");  
	      names.add("Juliet");  	      
	      Iterator<String> iterator=names.iterator();  
	      while(iterator.hasNext()){  
	       System.out.println(iterator.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(15);  
	       set.add(16);  
	       set.add(17);
	       set.add(18);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(12);  
	       set2.add(13);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 
	      }  
	}





