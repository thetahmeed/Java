public class Java005String {
  public static void main(String[] args) {
    String greeting = "Hello";
    System.out.println(greeting);
    
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());
    
    String txt = "Hello World";
    System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
    System.out.println(txt.toLowerCase());   // Outputs "hello world"

    String txt = "Please locate where 'locate' occurs!";
    System.out.println(txt.indexOf("locate")); // Outputs 7
    
    String firstName = "John";
    String lastName = "Doe";
    System.out.println(firstName + " " + lastName);

    String firstName = "John ";
    String lastName = "Doe";
    System.out.println(firstName.concat(lastName));
    
    // \'	'	Single quote
    // \"	"	Double quote
    // \\	\	Backslash
    String txt = "We are the so-called \"Vikings\" from the north.";
    
    // \n	New Line	
    // \r	Carriage Return	
    // \t	Tab	
    // \b	Backspace	
    // \f	Form Feed
    
  }
}
