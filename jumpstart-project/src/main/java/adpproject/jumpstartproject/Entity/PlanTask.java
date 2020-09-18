package adpproject.jumpstartproject.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "taskassignment")

public class PlanTask {
	
	@Id
	@GeneratedValue	
	private int planTaskID;
	@Column(name = "plan_id")
	private int taskID;
	private int associateID;
	private String Course;
	private double percentage;
	private boolean assessment;
	private String resources;
	private Date date;
	
	public PlanTask() {}
	
	public PlanTask(int planTaskID, int taskID, int associateID, String course, double percentage, boolean assessment,
			String resources, Date date) {
		super();
		this.planTaskID = planTaskID;
		this.taskID = taskID;
		this.associateID = associateID;
		Course = course;
		this.percentage = percentage;
		this.assessment = assessment;
		this.resources = resources;
		this.date = date;
	}

	public int getPlanTaskID() {
		return planTaskID;
	}

	public void setPlanTaskID(int planTaskID) {
		this.planTaskID = planTaskID;
	}

	public int getPlanID() {
		return taskID;
	}

	public void setPlanID(int taskID) {
		this.taskID = taskID;
	}

	public int getAssociateID() {
		return associateID;
	}

	public void setAssociateID(int associateID) {
		this.associateID = associateID;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public boolean isAssessment() {
		return assessment;
	}

	public void setAssessment(boolean assessment) {
		this.assessment = assessment;
	}

	public String getResources() {
		return resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	

}

