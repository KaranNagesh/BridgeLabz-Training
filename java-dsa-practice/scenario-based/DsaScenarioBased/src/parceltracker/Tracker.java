package parceltracker;

public class Tracker {
	
	Stages head;
	
	void addStage(String stageName) {
		Stages newStage = new Stages(stageName);
		
		if(head == null) {
			head = newStage;
			return;
		}
		
		Stages temp = head;
		
		while(temp.next !=  null) {
			temp = temp.next;
		}
		temp.next = newStage;
	}
	
	void addCheckPoint(String afterStage, String newStage) {
		Stages temp = head;
		
		while(temp != null && !temp.stage.equals(afterStage)){
			temp = temp.next;
		}
		
		if(temp != null) {
			Stages checkPoint = new Stages(newStage);
			checkPoint.next = temp.next;
			temp.next = checkPoint;
		}
		
		else {
			System.out.println("Stage not found");
		}
	}
	
	void trackParcel() {
		Stages temp = head;
		
		if(temp == null) {
			System.out.println("Parcel is lost");
			return;
		}
		while(temp !=  null) {
			System.out.print(temp.stage + " - > ");
			temp = temp.next;
		}
		System.out.println("End");
	}
	
}
