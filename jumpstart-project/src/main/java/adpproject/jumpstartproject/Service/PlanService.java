package adpproject.jumpstartproject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adpproject.jumpstartproject.Entity.Plan;
import adpproject.jumpstartproject.Repository.PlanRepo;

@Service
public class PlanService {
	@Autowired
	private PlanRepo repository;
	
	public Plan createPlan(Plan r) {
		return repository.save(r);
	}
	public List<Plan> getAllPlan() {
		return repository.findAll();
	}
	
	public Plan getPlanByID(int id) {
		return repository.findById(id).orElse(null);
	}
	public String deletePlan(int id) {
		repository.deleteById(id);
		return "Plan removed for - "+ id;
	}
	
	public Plan updatePlan (Plan reg) {
		Plan ex = repository.findById(reg.getPlanID()).orElse(null);
		ex.setPlanName(reg.getPlanName());
		return repository.save(ex);
	}
	
	
	
}
