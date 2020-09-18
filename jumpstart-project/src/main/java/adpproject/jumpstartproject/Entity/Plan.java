package adpproject.jumpstartproject.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plan")

public class Plan {
	
	@Id
	@GeneratedValue
	private int planID;
	private String planName;

	public Plan()
	{
		
	}
	
	

	public Plan(int planID, String planName) {
		super();
		this.planID = planID;
		this.planName = planName;
	}



	public int getPlanID() {
		return planID;
	}

	public void setPlanID(int planID) {
		this.planID = planID;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}
	

}
