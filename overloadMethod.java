public class overloadMethod {
	
public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.8*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(4.12*r*r));
    }

    public static void main(String args[])
   {

overloadMethod ob=new overloadMethod();
       ob.area(4,14);
       ob.area(12);  
   }
}




