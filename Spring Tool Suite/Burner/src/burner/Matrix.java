package burner;

public class Matrix {
	 public static void main(String args[]){
	      int mtr1[][] = {{2,7},
	      {9,2}};
	      int mtr2[][] = {{6,3},
	      {5,1}};
	      int add[][] = new int[2][2];
	      // Nested for loop
	      for (int i= 0 ; i < 2 ; i++ ){ 
	         for (int j= 0 ; j < 2 ;j++ ){
	            add[i][j] = mtr1[i][j] + mtr2[i][j]; 
	            // Performing addition
	         }
	      }
	      System.out.println("Sum of given two matrices =");
	      // Nested for loop to print the resulted matrix
	      for (int i= 0 ; i < 2 ; i++ ){
	         for (int j= 0 ; j < 2 ;j++ ){
	            System.out.print(add[i][j]+"\t");
	         }
	         System.out.println();
	      }
	   }
}
