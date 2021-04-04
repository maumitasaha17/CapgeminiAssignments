package LabAssignment4Exercise3;

public abstract class Item {

		private int idNum;
		private String title;
		private int numCopies;
		private Object otherItem;
		
		public Item() {}
	
	public Item(int idNum, String title, int numCopies) {
		this.idNum = idNum;
		this.title = title;
		this.numCopies = numCopies;
	}

	public int getIdNum() {
		return idNum;
	}

	public int setIdNum(int idNum) {
		return this.idNum = idNum;
	}

	public String getTitle() {
		return title;
	}

	public String setTitle(String title) {
		return this.title = title;
	}

	public int getNumCopies() {
		return numCopies;
	}

	public int setNumCopies(int numCopies) {
		return this.numCopies = numCopies;
	}
	
	public void checkIn() {
		numCopies = numCopies+1;
	}
	public void checkOut() {
		numCopies = numCopies-1;
	}
	
public void addItem(int idNum, String title, int numCopies) {
	setIdNum(idNum);
	setTitle(title);
	setNumCopies(numCopies);
}

@Override
public String toString() {
	return "Item [idNum=" + idNum + ", title=" + title + ", numCopies=" + numCopies + "]";
}

public void print() {
	System.out.println("Title: " +title);
	System.out.println("ID Number: "+idNum);
	System.out.println("Number od Copies: "+numCopies);
	==otherItem.numCopies;
}
	public void addItem() {
		numCopies++;
	}
	}
	
	
}