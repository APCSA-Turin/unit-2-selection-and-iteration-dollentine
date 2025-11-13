public class SelectionMadness {

  // no instance variables //
  
  public SelectionMadness() { }

  /* Returns 1 of 5 randomly generated fortunes as a string;
     you should write your own 5 fortunes! (see output for examples)
   */
  public String fortune() {
     /* implement this method 
     */

     int random = (int)(Math.random() * 5) + 1;
     if (random == 1) {
         return "no day but today!"; 
     } else if (random == 2) { 
         return "you will have a good day"; 
     } else if (random == 3) {
        return "it's friday so life is good!";
     } else if (random == 4) {
        return "the sun will shine on you"; 
     } else {
        return "you will have a good day"; 
     }
  }

  /* Returns the largest of three provided integers: num1, num2, or num3
   */
  public int largest(int num1, int num2, int num3) {
     /* implement this method */

    if (num1 >= num2 && num1 >= num3) {
        return num1;
    } else if (num2 >= num1 && num2 >= num3) {
        return num2;
    } else {
        return num3;
    }
  }

    public boolean rightTriangle(int side1, int side2, int side3) {
    /* implement this method */
        int largest; 
        int sum; 
        int hyp; 

        if (side1 >= side2 && side1 >= side3 ) {
            largest = side1; 
            sum = (side2 * side2) + (side3 * side3); 
            hyp = largest * largest; 
            if (sum == hyp) {
                return true; 
            } else {
                return false;
            }
        } else if (side2 >= side1 && side2 >= side3 ) {
            largest = side2; 
            sum = (side1 * side1) + (side3 * side3); 
            hyp = largest * largest; 
            if (sum == hyp) {
                return true; 
            } else {
                return false;
            }
        } else {
            largest = side3; 
            sum = (side1 * side1) + (side2 * side2); 
            hyp = largest * largest; 
            if (sum == hyp) {
                return true; 
            } else {
                return false; 
            }
        }

  }

}
