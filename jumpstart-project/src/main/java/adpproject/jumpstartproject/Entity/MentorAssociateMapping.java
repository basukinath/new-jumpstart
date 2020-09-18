package adpproject.jumpstartproject.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "mentor_associate_mapping")
public class MentorAssociateMapping {
	
	@Id
	@GeneratedValue
	private int mappingID;
	private int mentorID;
	private int associateID;
	
	public MentorAssociateMapping() {}
	public MentorAssociateMapping(int mappingID, int mentorID, int associateID) {
		super();
		this.mappingID = mappingID;
		this.mentorID = mentorID;
		this.associateID = associateID;
	}
	public int getMappingID() {
		return mappingID;
	}
	public void setMappingID(int mappingID) {
		this.mappingID = mappingID;
	}
	public int getMentorID() {
		return mentorID;
	}
	public void setMentorID(int mentorID) {
		this.mentorID = mentorID;
	}
	public int getAssociateID() {
		return associateID;
	}
	public void setAssociateID(int associateID) {
		this.associateID = associateID;
	}
	
	 

}
