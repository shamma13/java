import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Binary_Oddo {

	private static int numofcall = 0;

    private static int currentstack = 0;

    private static int maxstacksizereached = 0;
	
	public static int binaryOdd(int k)
	{
		int OddoVal = 1;
        numofcall++;
        currentstack++;


        if (k <= 3) {
                OddoVal = 1;

        } else {
                OddoVal = binaryOdd(k - 1) + binaryOdd(k - 2) + binaryOdd(k - 3);

        }
        currentstack--;
        return OddoVal;

	}
	
	
		public static void main(String[] args) throws IOException {
	        long timestart;
	        long timeend;
	try {
	    FileWriter filewriter = new FileWriter("C:\\Users\\Shamma\\Desktop\\COMP 352\\OddoBinaryOut.txt");
	    filewriter.write("This document will have the value of the Oddonacci sequence starting at value n = 5 and incrementing by 5 up to 100\n\n");
	    for (int i = 5; i<=40; i=i+5) {
	        timestart = System.nanoTime();
	        int hello = binaryOdd(i);
	        timeend = System.nanoTime();
	        filewriter.write("Value for n = " + i + ": " + hello + "\n");
	        filewriter.write("The time for executing Oddonacci sequence for n = " + i + " is: " + (timeend-timestart) + " ns.\n\n");


	    }
	    filewriter.close();
	}catch (Exception e) {
	    System.out.print("Did not record data 5");
	}

	    }
	}

