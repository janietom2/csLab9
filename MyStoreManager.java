import java.io.*;
import java.util.*;
public class MyStoreManager {

    static Scanner fileScanner;
	
	/**********************************************************************************
	 * ReadFromFile: 
	 * This method takes the name of a file as parameter: the given file contains 
	 * information about video games. 
	 * It reads the information and fills an array of videogames with this information. 
	 * It returns the array of video games. 
	 ***********************************************************************************/
	public static VideoGame[] ReadFromFile(String filename) throws IOException {
		try{
			fileScanner = new Scanner(new File(filename));
		}catch (Exception e){
            System.out.println("Error, please change the code or do something else, I don't now " +
                    "=/, sorry, I am only a compiler.");
        }

        while(fileScanner.hasNext()){

        }

        return var;
	}
	
	/**********************************************************************************
	 * SortBySold: 
	 * This method takes an array of video games as an input and sorts it by the number 
	 * of items sold of each video game. 
	 * Use the same selection sort algorithm as you implemented in lab8 
	 * – just modify it slightly.
	 ***********************************************************************************/
	public static void SortBySold(VideoGame[] myVideoGames) {
		int max;
		int index;
		int aux;

		for (int size = myVideoGames.length-1; size >0; size--) {
			max = myVideoGames[0];
			index = 0;
			for (int i = 1; i <= size; i++) {
				if (myVideoGames[i] > max) {
					max = A[i];
					index = i;
				}
			}
			aux = A[index];
			A[index] = A[size];
			A[size] = aux;
		}
	}
	
	/**********************************************************************************
	 * SortByPrice: 
	 * This method takes an array of video games as an input and sorts it by the price 
	 * of each video game. 
	 * Use the same selection sort algorithm as you implemented in lab8 
	 * – just modify it slightly.
	 ***********************************************************************************/
	public static void SortByPrice(VideoGame[] myVideoGames) {
		int max;
		int index;
		int aux;

		for (int size = VideoGame.length-1; size >0; size--) {
			max = VideoGame[0];
			index = 0;
			for (int i = 1; i <= size; i++) {
				if (VideoGame[i] > max) {
					max = VideoGame[i];
					index = i;
				}
			}
			aux = VideoGame[index];
			VideoGame[index] = VideoGame[size];
			VideoGame[size] = aux;
		}
	}

	/**********************************************************************************
	 * SortByType: 
	 * This method takes an array of video games as an input and sorts it by the type 
	 * of each video game. 
	 * Use the same selection sort algorithm as you implemented in lab8 
	 * – just modify it slightly.
	 ***********************************************************************************/
	public static void SortByType(VideoGame[] myVideoGames) {
		// here goes your code
	}

	/**********************************************************************************
	 * TotalSales: 
	 * This method takes an array of video games and returns the total amount of money 
	 * gotten from sales of the video games. 
	 ***********************************************************************************/
	public static double TotalSales(VideoGame[] myVideoGames) {
		// here goes your code
	}

	/**********************************************************************************
	 * Lottery: 
	 * This method takes an array of video games and returns a randomly picked video game.
	 ***********************************************************************************/
	public static VideoGame Lottery(VideoGame[] myVideoGames) {
		// here goes your code
	}
	
	/**********************************************************************************
	 * The main method in which you test all the above methods
	 * and in which you implement the scenario given to you in the lab assignment 
	 * docx file.
	 ***********************************************************************************/
	public static void main(String[] args) {
		// your code goes here
	}

}
