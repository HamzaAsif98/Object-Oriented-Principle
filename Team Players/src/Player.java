
public class Player {
	private String PName,Code;
	private Teams Team;
	//constructor
public Player(String playername,String thecode) {
	
	this.PName=playername;
	this.Code=thecode;
}

public String getPname() {
return this.PName;
}
public String getcode() {
return this.Code;
}
public Teams getteam() {
	return Team;
}
public void setTeam(Teams Team) {
	this.Team = Team;
}
public void setPName(String setPname){
	this.PName = setPname;}
public void setcode(String setcode){
		this.Code = setcode;}

public String toString() {
	System.out.println("toString");
	return PName+" code is "+Code;
	}
void Print()
{System.out.println("Name = "+PName + "Code = "+ Code);
	}

}
