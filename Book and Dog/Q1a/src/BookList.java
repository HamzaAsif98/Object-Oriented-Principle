
public class BookList {
	private int count;
	private int size;
	private Books booklist[];
	public BookList (int m) {
		this.size=m;
		this.count=0;
		booklist = new Books [size];
	}
	public boolean isEmpty() {
		if (count==0) {
			return true;
		}
		else 
			return false;
	}
	public boolean isFull() {
		if (count==0) {
			return false;
		}
		else 
			return true;
	}
	public int length() {
		return size;
	}
	public void add(Books book) {

		if(count < size) {
			booklist[count]=book;
			count++;
		}
		else
			System.out.println("Error");
	}
	public void remove(int index) {
		if ((index >= 0) && (index < count)) {
			for (int i = index; i < (this.count - 1); i++)
				this.booklist[i] = this.booklist[i+1];
			this.count = this.count - 1;
		}
		else
			System.out.println("ERROR: No valid index for MyList");
	}
	public int getTotal() {
		return count;
	}

	public Books[] getbooklist() {
		return booklist;
	}

}


