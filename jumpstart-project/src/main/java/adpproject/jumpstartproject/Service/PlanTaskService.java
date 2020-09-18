package adpproject.jumpstartproject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adpproject.jumpstartproject.Entity.PlanTask;
import adpproject.jumpstartproject.Repository.PlanTaskRepo;

@Service
public class PlanTaskService {
	
	@Autowired
	private PlanTaskRepo repository;
	
	public PlanTask createTask(PlanTask r) {
		return repository.save(r);
	}
	public List<PlanTask> getAllTask() {
		return repository.findAll();
	}
	
	public PlanTask getTaskByID(int id) {
		return repository.findById(id).orElse(null);
	}
	public String deleteTask(int id) {
		repository.deleteById(id);
		return "Plan removed for - "+ id;
	}
	
	public PlanTask updateTask(PlanTask reg) {
		PlanTask ex = repository.findById(reg.getPlanTaskID()).orElse(null);
		ex.setPlanTaskID(reg.getPlanTaskID());
		ex.setAssociateID(reg.getAssociateID());
		ex.setCourse(reg.getCourse());
		ex.setPercentage(reg.getPercentage());
		ex.setAssessment(reg.isAssessment());
		ex.setResources(reg.getResources());
		ex.setDate(reg.getDate());
		
		return repository.save(ex);
	}
	

}
