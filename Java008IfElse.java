public class Java008IfElse {
  public static void main(String[] args) {
  
    // if
    if (20 > 18) {
      System.out.println("20 is greater than 18"); // obviously
    }  
    
    // if else
    int time = 20;
    if (time < 18) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }
    
    // else if
    int time = 22;
    if (time < 10) {
      System.out.println("Good morning.");
    } else if (time < 20) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }
   
   
  }
}
