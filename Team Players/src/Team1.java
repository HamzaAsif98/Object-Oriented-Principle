import java.util.ArrayList;

public class Team1 {

	//attributes
	private String Name,Jersey,Location;
	private int initialplayer=0;
	
	ArrayList<Player1> arrl;
	//constructors
	public Team1(String thename,String thejersey,String thelocation) {
	this.Name=thename;
	this.Jersey=thejersey;
	this.Location=thelocation;
	arrl=new ArrayList<Player1>(8);
}

public String getname() {
return this.Name;
}
public String getjersey() {
return this.Jersey;
}
public String getlocation() {
return this.Location;
}


public void setName(String setname){
	this.Name = setname;}
public void setjersey(String setjersey){
		this.Jersey = setjersey;}
public void setlocation(String setlocation){
			this.Location = setlocation;}

public ArrayList<Player1> getplayers1() {
	return arrl;
}
public void setPlayers1(ArrayList<Player1> arrl) {
	this.arrl = arrl;
}
public String toString() {
	return Name+" who has "+Jersey+" Jersey lives in "+Location;
	}

void Print() {
	System.out.println(Name+" who has "+Jersey+" Jersey lives in "+Location+"\n");
	for (int i = 0; i < arrl.size(); i++) {
		System.out.println(arrl.get(i));
	
}

}
}



