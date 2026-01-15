package parceltracker;

public class Stages {
	String stage;
	Stages next;
	
	Stages(String stageName){
		this.stage = stageName;
		this.next = null;
	}
	
	
}

