public class VideoGame {

	/**************** ATTRIBUTES *******************************************
	/* Here go your attributes, i.e., the information that is contained in 
	 * your new "type" 
	 * We can also see these new types as "blue-prints" of "things" we are 
	 * going to build 
	 * Expected attributes are:
	 * a.	A name: of type string
	 * b.	A price: of type double
	 * c.	A number of items sold: of type int
	 * d.	A type of game: of type string
	 ***********************************************************************/
	private String name;
	private double price;
	private int soldItems;
	private String category;
	//etc.
	
	/**************** CONSTRUCTORS *****************************************
	 * note that the signatures are different from those we are used to 
	 ***********************************************************************/
	/* default constructor: provided to you. You should not touch the next two lines of code */
	public VideoGame() {
	}
	
	// your code goes here...
	public VideoGame(String gameName, double gamePrice, int gameSoldItems, String gameCategory) {
		name = gameName;
		price = gamePrice;
		soldItems = gameSoldItems;
		category = gameCategory;
	}
	
	/***************** SETTERS / MUTATORS **********************************
	 * Methods that allow to set or modify the values of the attributes
	 * One method per attribute
	 * Note that the methods are not static (to be explained -- much -- later)
	 ***********************************************************************/
	/* one per attribute: we provide you with two, you have to provide the others */
	public void setName(String newName) {
		name = newName;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}

	public void setSoldItems(int newSoldItems){
		soldItems = newSoldItems;
	}

	public void setCategory(String newCategory){
		category = newCategory;
	}
	
	// complete the code here with the missing mutators
	
	/**************** GETTERS / ACCESSORS **********************************
	 * Methods that allow to access the values of the attributes
	 * One method per attribute
	 * Note that the methods are not static (to be explained -- much -- later)
	 ***********************************************************************/
	/* one per attribute: we provide you with the one, you have to provide the others */
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}

	public int getSoldItems(){
		return soldItems;
	}

	public String getCategory(){
		return category;
	}
	
	// complete the code here with the missing accessors
	
	/***********************************************************************
	 * Other methods, depending on needs 
	 * Here we are asking you to design a method that prints the information
	 * about any video game
	 ***********************************************************************/
	public void Print() {
		// your printing code goes here
		// make sure that you follow instructions as shown in the lab assignment docx file
	}
	
}
