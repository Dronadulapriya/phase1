package accessspecifier;

//2. using private access specifiers
class privateaccessspecifier 
{ 
 private void display() 
  { 
      System.out.println("You are using private access specifier"); 
  } 
} 

public class accessSpecifiers2 {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		privateaccessspecifier  obj = new privateaccessspecifier(); 
      //trying to access private method of another class 
      //obj.display();

	}
}



