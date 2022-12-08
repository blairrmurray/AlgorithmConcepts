package algorithmConcepts1;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import algorithmConcepts1.BinarySearchTree;
import java.util.ArrayList;

public class BPlusTree {
		// initialize counters
		private static int ScoreSplits = 0;
        private static int ScoreParentSplits = 0;
        private static int ScoreFusions = 0;
        private static int ScoreParents = 0;
        private static int ScoreParentFusions = 0;
        private static int TreeDepth = 0;
        
        public static void main(String[] args){
        	char ch;
        	System.out.println("Welcome to the BPlusTree program: A B+ tree used for storage and editting."
        	 		+ "Let's start!");
        	String[] data = ReadCols(0,"C:\\Users\\Paul Murray\\example\\partfile.txt",",");
			for(int i = 0; i < data.length; i++)
			{
				System.out.println(data[i]);
			}
	    }
			public static String[] ReadCols(int col, String filepath, String delimiter)
			{
				String data[];
				String currentLine;
				ArrayList<String> colsData = new ArrayList<String>(); 
			
	    try
	    {
	        FileReader fr = new FileReader(filepath);
	    	BufferedReader br = new BufferedReader(fr);
	        //Scans each word from the input and prints it out
	        //String word = input.readLine();
	        while ((currentLine = br.readLine()) != null)
	        {
	            data = currentLine.split(delimiter);
	            colsData.add(data[col]);
	        }
	    }
	    
        catch(Exception e) //Catches file not found exception
	    {
	        System.out.println(e);
	        return null;
	    }
	    
	    return colsData.toArray(new String[0]);
	    }


			private int ch;
	    
			{   
	    Scanner scan = new Scanner(System.in);
		 /* Creating object of BT * */
		 BinarySearchTree bt = new BinarySearchTree();
		 //  Perform tree operations
		 do
		 {
		 System.out.println("\nStorage Options\n");
		 System.out.println("1. insert");
		 System.out.println("2. search");
		 System.out.println("3. display next 10");
		 System.out.println("4. delete an element");
		
		 //int choice = scan.nextInt();
		 //switch (choice)
		 //{
		 //case 1 :
		 //System.out.println("Enter data to insert");
		 //String wordnum = Integer.toString(choice);
		 //BinarySearchTree.insertString( scan.nextInt() );
		//int InsertionCounter = +1;
		//break;
		//case 2 :
		 //System.out.println("Enter data to search for");
				// TODO Auto-generated method stub
		//int input = scan.nextInt();
		//System.out.println("Found");
		//break;
		
		//int SearchCounter = +1;
		//break;
		
		//default :
		//System.out.println("Wrong Entry \n ");
		//break;
		//int NextTenCounter;
		//case 3 : //Display next 10 entries
		//NextTenCounter = +1;
		//break;
		//int DeletionCounter;
		//case 4 : //Delete an element
		//DeletionCounter = +1;
		//break;
		
		 //  Display tree  
		 System.out.println("\n\nDo you want to continue (Type y or n) \n");
		 ch = scan.next().charAt(0);
		 } 
		while (ch == 'Y'|| ch == 'y');
               BinarySearchTree bt1 = new BinarySearchTree();
               System.out.println("\nEnter a score to search for: ");
               int input = scan.nextInt();
			}
}
        