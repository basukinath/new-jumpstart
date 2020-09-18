package adpproject.jumpstartproject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adpproject.jumpstartproject.Entity.MentorAssociateMapping;
import adpproject.jumpstartproject.Repository.MentorAssociateMappingRepo;

@Service
public class MentorAssociateMappingService {
	@Autowired
	private MentorAssociateMappingRepo repository;
	
	public MentorAssociateMapping doMapping(MentorAssociateMapping r) {
		return repository.save(r);
	}
	public List<MentorAssociateMapping> getAllMapping() {
		return repository.findAll();
	}
	
	public MentorAssociateMapping getMappingByID(int id) {
		return repository.findById(id).orElse(null);
	}
	
	
	
	public String deleteMapping(int id) {
		repository.deleteById(id);
		return "MentorAssociateMapping removed for - "+ id;
	}
	
	public MentorAssociateMapping updateMapping (MentorAssociateMapping reg) {
		MentorAssociateMapping ex = repository.findById(reg.getMappingID()).orElse(null);
		ex.setMentorID(reg.getMentorID());
		ex.setAssociateID(reg.getAssociateID());
		return repository.save(ex);
	}
	
	
	
}
