// ArrayAndVectors.java
public class Main {
    public static void main(String[] args) {
        System.out.println("\n Welcome to the array Program!\n");

        int[] myNumbers = new int[8];
        myNumbers[0] = 1;
        myNumbers[1] = 3;
        myNumbers[2] = 5;
        myNumbers[3] = 7;
        myNumbers[4] = 9;
        myNumbers[5] = 11;
        myNumbers[6] = 13;
        myNumbers[7] = 15;

        System.out.println("myNumbers[3] = " + myNumbers[3]);

        for (int i = 0; i < 8; i++ ) {
            System.out.println("myNumbers(" + i + ") is: " + myNumbers[i]);


        }
        System.out.println("myNumbers[3] = " + myNumbers[3]);
        int myFiveContainer = 5;
        for (int i = 0; i < 8; i++) {
            myNumbers[i] = myFiveContainer += 5;
            System.out.println("myNumbers(" + i + ") is: " + myNumbers[i]);
        }
          int [][] numberGrid = {
                  {1,2,3},
                  {4,5,6},
                  {7,8,9},
                  {0}
          };



        for(int i = 0; i < numberGrid.length; i++) {
                for(int j = 0; j < numberGrid[i].length; j++) {
                    System.out.print(numberGrid[i][j]);
                    System.out.println();
                }
            }
int [][] myNumberGrid = new int[4][3];
 myFiveContainer = 0;
        System.out.println("\n\n");
 for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 3; j++) {
                myNumberGrid[i][j] = myFiveContainer += 5;
                System.out.print(myNumberGrid[i][j] + " ");
            }

                        System.out.println("");
        }



        }

    }
