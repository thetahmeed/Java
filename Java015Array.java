public class Java015Array {
  public static void main(String[] args) {
  
    // get an item by index number
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars[0]);
    
    // get length of the array
    System.out.println(cars.length);
    
    // print all items by loop
    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }
    
    // by for eatch loop
    for (String i : cars) {
      System.out.println(i);
    }
    
    // multidimensional arrays
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    int x = myNumbers[1][2];
    System.out.println(x);
    
  }
}
