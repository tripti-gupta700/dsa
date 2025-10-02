public class patterns {
    // PATTERNS
//  ****          ****      *             *       1            1             1            ****
//  ****          *  *      **           **       1 2          2 3           2 2          ***
//  ****          *  *      ***         ***       1 2 3        4 5 6         3 3 3        **
//  ****          ****      ****       ****       1 2 3 4      7 8 9 10      4 4 4 4      *
    public static void main(String[] args){
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }

        System.err.println("2nd pattern");
        for(int i=0; i<=3; i++){
            for(int j=0; j<=3; j++){
                if(i==0 || i==3 || j==0 || j==3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
        System.err.println("3rd pattern");
        for(int i=0; i<4; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        
        System.err.println("4th pattern");
        for(int i=0; i<4; i++){
            for(int j=0; j<4-(i-1); j++){
              System.out.print(" ");  
            }
            for(int k=0; k<i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.err.println("5th pattern");
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        System.err.println("6th pattern");
        int count=1;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count+ "");
                count+=1;
            }
            System.out.println("");
        }
         System.err.println("7th pattern");
         for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println("");
         }
          System.err.println("8th pattern");
          for(int i=0; i<4; i++){
            for(int j=0; j<4-i; j++){
                System.out.print("*");
            }
            System.out.println("");
          }
           System.err.println("9th pattern");
          for(int i=0; i<4; i++){
            for(int k=0; k<i; k++){
                System.out.print(" ");
            }
            for(int j=0; j<4-i; j++){
                System.out.print("*");
            }
            
            System.out.println("");
          }
  }
}
    

