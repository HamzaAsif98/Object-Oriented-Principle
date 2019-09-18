
public class Teams {
	//attributes
	private String Name,Jersey,Location;
	private int initialplayer=0;
	
	Player[] player ;
	//constructors
	public Teams(String thename,String thejersey,String thelocation) {
	this.Name=thename;
	this.Jersey=thejersey;
	this.Location=thelocation;
	player=new Player[10];
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

public Player[] getplayers() {
	return player;
}
public void setPlayers(Player[] player) {
	this.player = player;
}
public String toString() {
	System.out.println("toString");
	return Name+" who has "+Jersey+" Jersey lives in "+Location;
	}

void print() {
	System.out.println(Name+" who has "+Jersey+" Jersey lives in "+Location);
	if (player == null)return;
	for (int i=0;i<player.length;i++)
		if (player[i] !=null)
		player[i].Print();
}

}

