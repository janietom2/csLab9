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
        int counterLines = 0;
        VideoGame[] videoGames = new VideoGame[7];
        
        try{
			fileScanner = new Scanner(new File(filename));
		}catch (Exception e){
            System.out.println("Error");
        }
        while(fileScanner.hasNext()){
            String name = fileScanner.next();
            String Sprice = fileScanner.next();
            Double price = Double.parseDouble(Sprice);
            String Ssold = fileScanner.next();
            int sold = Integer.parseInt(Ssold);
            String category = fileScanner.next();

            VideoGame game = new VideoGame(name, price, sold, category);
            videoGames[counterLines] = game;
            counterLines++;
        }
        fileScanner.close();
        return videoGames;
	}
	
	/**********************************************************************************
	 * SortBySold: 
	 * This method takes an array of video games as an input and sorts it by the number 
	 * of items sold of each video game. 
	 * Use the same selection sort algorithm as you implemented in lab8 
	 * – just modify it slightly.
	 ***********************************************************************************/
	public static void SortBySold(VideoGame[] myVideoGames) {
		VideoGame temp = new VideoGame();
        VideoGame VideogameMax = new VideoGame();
		for (int size = myVideoGames.length-1; size >0; size--) {

			for (int i = 0; i < size; i++)
                if (myVideoGames[i].getSoldItems() > myVideoGames[i + 1].getSoldItems()) {
                    temp = myVideoGames[i];
                    myVideoGames[i] = myVideoGames[i+1];
                    myVideoGames[i+1] = temp;
                }
		}
        for(int i = 0 ; i < myVideoGames.length-1; i++){
            System.out.println(myVideoGames[i].getSoldItems()+" From: " +
                    myVideoGames[i].getName());
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
        VideoGame temp = new VideoGame();
        VideoGame VideogameMax = new VideoGame();
        for (int size = myVideoGames.length-1; size >0; size--) {
            for (int i = 0; i < size; i++)
                if (myVideoGames[i].getPrice() > myVideoGames[i + 1].getPrice()) {
                    temp = myVideoGames[i];
                    myVideoGames[i] = myVideoGames[i+1];
                    myVideoGames[i+1] = temp;
                }
         }
        for(int i = 0 ; i < myVideoGames.length-1; i++){
            System.out.println("$" + myVideoGames[i].getPrice() + " USD From: " +
                    myVideoGames[i].getName());
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
        VideoGame temp = new VideoGame();
        VideoGame VideogameMax = new VideoGame();
        
        for (int size = myVideoGames.length-1; size >0; size--) {
            for (int i = 0; i < size; i++)
                if (myVideoGames[i].getCategory().compareTo(myVideoGames[i+1].getCategory()) >  0) {
                    temp = myVideoGames[i];
                    myVideoGames[i] = myVideoGames[i+1];
                    myVideoGames[i+1] = temp;
                }
        }
        for(int i = 0 ; i < myVideoGames.length-1; i++){
            System.out.println(myVideoGames[i].getCategory() + " From: " +
                    myVideoGames[i].getName());
        }
    }

	/**********************************************************************************
	 * TotalSales: 
	 * This method takes an array of video games and returns the total amount of money 
	 * gotten from sales of the video games. 
	 ***********************************************************************************/
	public static int TotalSales(VideoGame[] myVideoGames){
        int sum = 0;
        for (int counter = 0; counter < myVideoGames.length; counter++){
            sum = sum + myVideoGames[counter].getSoldItems();
        }
        return sum;
	}

	/**********************************************************************************
	 * Lottery: 
	 * This method takes an array of video games and returns a randomly picked video game.
	 ***********************************************************************************/
	public static VideoGame Lottery(VideoGame[] myVideoGames) {
		Random randomNumber = new Random();
        int pickedNumber = randomNumber.nextInt(7);

        VideoGame pickedGame = new VideoGame(myVideoGames[pickedNumber].getName(),
                myVideoGames[pickedNumber].getPrice(), myVideoGames[pickedNumber].getSoldItems(),
                myVideoGames[pickedNumber].getCategory());

        return pickedGame;
	}
	
	/**********************************************************************************
	 * The main method in which you test all the above methods
	 * and in which you implement the scenario given to you in the lab assignment 
	 * docx file.
	 ***********************************************************************************/
	public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello sir/madame, please enter the .txt file that you would like to " +
                "read (Do not enter .txt only the name)");
        String userInputFile = userInput.nextLine();
        System.out.println("----------------------------------");

        System.out.println("Lottery");
        System.out.println(Lottery(ReadFromFile(userInputFile+".txt")).Print());
        System.out.println("----------------------------------");

        System.out.println("Sort by Sold");
        SortBySold(ReadFromFile(userInputFile + ".txt"));
        System.out.println("----------------------------------");

        System.out.println("Sort by Price");
        SortByPrice(ReadFromFile(userInputFile + ".txt"));
        System.out.println("----------------------------------");

        System.out.println("Sort by Type");
        SortByType(ReadFromFile(userInputFile + ".txt"));
        System.out.println("----------------------------------");

        System.out.println("Total Sales");
        System.out.println("Total of games sold: " + TotalSales(ReadFromFile(userInputFile+
                ".txt")));
        System.out.println("----------------------------------");

	}



}
