package week1day2;

public class Library {

	public static void main(String[] args) {
		String bookTitle="The Science of Interstellar";
		Library obj = new Library();
		obj.addBook(bookTitle);
		obj.issueBook(bookTitle);
	}
	public void addBook(String bookTitle)
	{
		System.out.println(bookTitle + " book has been added successfully.");
	}
	public void issueBook(String bookTitle)
	{
		System.out.println(bookTitle + " book has been issued successfully.");
	}

}
