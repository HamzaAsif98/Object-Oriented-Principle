
public class ObjectList {
	
	private int count;
	private int size;
	Object [] arrays;
	
	public ObjectList(int m) {
		this.size=m;
		this.count=0;
		this.arrays=new Object[10];
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
	public Object getObject(int index) {
		Object res;
		res = this.arrays[index];
		return res;
	}
	public void add(Object element){
		if (count<size) 
		{
			arrays[count]=element;
			count++;
		}
		else
				System.out.println("Error List is full");
			
		}
	public void remove(int index){
		if ((index >= 0) && (index < count)) {
			for (int i = index; i < (this.count - 1); i++)
				this.arrays[i] = this.arrays[i+1];
			this.count = this.count - 1;
		}
		else
			System.out.println("ERROR: No valid index for MyList");
	}

	public int getTotal() {
	
		return count;
	}

	
	} 

