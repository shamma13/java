import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


public class Linear_Oddo {
	
	private static int numberOfCalls = 0 ;
    private static long timestart;
    private static long timeend;

	
	public static long[] linearOdd(int k)
	{
		// Increase the number of calls each time the method is called (executes)
		numberOfCalls++;
        long[] A = new long[3];
        long i = 1;
        long j = 1;
        long w = 1;

        if (k == 1) { // when it is at the 0th position, only when the person inputs this value;
            System.out.print(" " + i + " ");
            A[0] = 1;
            A[1] = j;
            A[2] = w;
            return A;
        }

        else if (k == 2) { //when it is at the first position, only can be obtained if the person inputs this
            System.out.print(" " + j + " " + i + " ");
            A[0] = 1;
            A[1] = j;
            A[2] = w;
            return A;
        }
        else if (k == 3) {// the last position possible, this will assign the initial values for the sequence and when
            //the recursion snaps back, it will be these values that the addition will build on.
             System.out.print(" " + i + " " + j + " " + w + " ");
             A[0] = i;
             A[1] = j;
             A[2] = w;
             return A;
        }

        else { //when k =/= to 1 or 0, this is where the method is called again.
            A = linearOdd(k-1);
            i = A[0];
            j = A[1];
            w = A[2];
            System.out.print((i+j+w) + " ");
            
            A[0] = (i+j+w); // biggest number yet
            A[1] = i; // Second biggest number, once the biggest
            A[2] = j; //the third, once the second
            //the w disappears since it is the smallest
            return A;

        }

		
	}

	public static void main(String[] args) throws IOException {

        try {
            FileWriter filewriter = new FileWriter("C:\\Users\\Shamma\\Desktop\\COMP 352\\OddoLinearOut.txt");
            

            filewriter.write("These are the Oddonacci sequence for values starting at n = 5 and incrementing by 5 up to 100.\n\n");


            for (int i = 5 ; i <= 100; i=i+5) {
                String output = "The Oddonacci number for " + i + " will be printed out\n";
                filewriter.write(output);
                timestart = System.nanoTime();
                long hello = linearOdd(i)[0];
                timeend = System.nanoTime();

                filewriter.write("Result for Sequence " + i + ":" + hello + "\n");
                filewriter.write("The method has been called " + numberOfCalls + " times.");
                filewriter.write("\nTime of execution " + (timeend - timestart) + " ns \r\n\n");
            }

            filewriter.close();
        } catch (Exception e) {
            System.out.print("the data did not print correctly");
        }


	}

}
