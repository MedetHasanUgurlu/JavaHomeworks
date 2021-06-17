	package Entity.Concrete;

public class Game {
	 private  int id;
	    private String gameName;
	    private double price;
	    private  String categoryName;
	    
	    
	    
		public Game(int id, String gameName, double price, String categoryName) {
		
			this.id = id;
			this.gameName = gameName;
			this.price = price;
			this.categoryName = categoryName;
		}



		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getGameName() {
			return gameName;
		}



		public void setGameName(String gameName) {
			this.gameName = gameName;
		}



		public double getPrice() {
			return price;
		}



		public void setPrice(double price) {
			this.price = price;
		}



		public String getCategoryName() {
			return categoryName;
		}



		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
	    
	    
		
}
