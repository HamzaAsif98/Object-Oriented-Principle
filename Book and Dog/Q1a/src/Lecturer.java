
public class Lecturer {

	private int ID;
	private String name;
	BookList books;
	private int maxnobooks=15,count;
	
	
	
	public Lecturer (BookList b) {
		this.count=0;
		this.books = b;

	}
	public void addBook(String bookTitle, int bookISBN, String bookAuthor, double bookPrice) {
		if (count <= (books.length())) {

		books.add(new Books(bookTitle, bookISBN, bookAuthor, bookPrice));

		count++;
			}
		}
	public String getname() {
		return name;
	}
	public int getid() {
		return ID;
	}
	public void setname() {
		this.name=name;
	}
	
	public void setid() {
		this.ID=ID;
	}
		public BookList getbookList() {
			return books;
		}
		public void setbookList(BookList book) {
			this.books = book;
		}

	public String toString() {
		return name+ID;
	}
	

	public void print() {
		Books[] booklist = books.getbooklist();
		 for(Object b :booklist)
		  ((Books) b).print();
	}
}
