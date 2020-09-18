package adpproject.jumpstartproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import adpproject.jumpstartproject.Entity.MentorAssociateMapping;
import adpproject.jumpstartproject.Entity.Plan;
import adpproject.jumpstartproject.Entity.PlanTask;
import adpproject.jumpstartproject.Entity.Registration;
import adpproject.jumpstartproject.Service.MentorAssociateMappingService;
import adpproject.jumpstartproject.Service.PlanService;
import adpproject.jumpstartproject.Service.PlanTaskService;
import adpproject.jumpstartproject.Service.RegistrationService;

@RestController
public class RegistrationController {
	@Autowired
	RegistrationService service;
	
	@Autowired
	MentorAssociateMappingService mappingService;
	
	@Autowired
	PlanService pService;
	
	@Autowired
	PlanTaskService ptService;
	
	//=============================================================================
	//createTask, getAllTask, getTaskByID, deleteTask, updateTask
	
	@PostMapping("/createTask")
	public PlanTask newTask(@RequestBody PlanTask m) {
		return ptService.createTask(m);
	}
	
	@GetMapping("/getAllTask")
	public List<PlanTask> getTasks(){
		return ptService.getAllTask();
	}
	
	@GetMapping("/getTaskByID/{id}")
	public PlanTask taskByID(@PathVariable int id) {
		return ptService.getTaskByID(id);
	}
	
	@PutMapping("/updateTask")
	public PlanTask updateThePlan(@RequestBody PlanTask reg) {
		return ptService.updateTask(reg);
	}
	
	@DeleteMapping("/deleteTaskbyId/{id}")
	public String deleteTaskByID(@PathVariable int id) {
		return ptService.deleteTask(id);
	}
	
	
	//=============================================================================
	//createPlan, getAllPlan, getPlanByID, deletePlan, updatePlan
	
		@PostMapping("/createPlan")
		public Plan newPlan(@RequestBody Plan m) {
			return pService.createPlan(m);
		}
		
		@GetMapping("/getAllPlan")
		public List<Plan> getPlans(){
			return pService.getAllPlan();
		}
		
		@GetMapping("/getPlanByID/{id}")
		public Plan PlanByID(@PathVariable int id) {
			return pService.getPlanByID(id);
		}
		
		@PutMapping("/updatePlan")
		public Plan updateThePlan(@RequestBody Plan reg) {
			return pService.updatePlan(reg);
		}
		
		@DeleteMapping("/deletePlanbyID/{id}")
		public String deletePlanbyID(@PathVariable int id) {
			return pService.deletePlan(id);
		}
	
	
	//=============================================================================
	//mapMentorAssociate,findAllMapping, findMappingByID, deleteMapping, updateMapping
	
	@PostMapping("/mapMentorAssociate")
	public MentorAssociateMapping newMapping(@RequestBody MentorAssociateMapping m) {
		return mappingService.doMapping(m);
	}
	
	@GetMapping("/findAllMapping")
	public List<MentorAssociateMapping> findAllMapping(){
		return mappingService.getAllMapping();
	}
	
	@GetMapping("/findMappingByID/{id}")
	public MentorAssociateMapping newMapping(@PathVariable int id) {
		return mappingService.getMappingByID(id);
	}
	
	@PutMapping("/updateMapping")
	public MentorAssociateMapping updateMapping(@RequestBody MentorAssociateMapping reg) {
		return mappingService.updateMapping(reg);
	}
	
	@DeleteMapping("/deleteMapping/{id}")
	public String deleteMapping(@PathVariable int id) {
		return mappingService.deleteMapping(id);
	}
	
	
	
	
	
	
	
	//==============================================================================
	
	
	@PostMapping("/register")
	public Registration newRegistration(@RequestBody Registration reg) {
		return service.register(reg);
	}
	
	@PostMapping("/registerMany")
	public List<Registration> newRegistration(@RequestBody List<Registration> reg) {
		return service.registerMultiple(reg);
	}
	
	@GetMapping("/findAllRegistration")
	public List<Registration> findAllRegistration(){
		return service.getAllRegistration();
	}
	
	
	@GetMapping("/findConditional")
	public List<Registration> getConditional(@RequestParam ("name") String name, @RequestParam ("org") String org){
		return service.getConditionalReg(name, org);
	}
	
	
	
	
	@GetMapping("/findRegistration/{id}")
	public Registration findRegistrationByID(@PathVariable int id) {
		return service.getRegistrationByID(id);
	}
	
	@GetMapping("/findRegistration/{name}")
	public Registration findRegistrationByName(@PathVariable String name) {
		return service.getRegistrationByName(name);
	}
	
	
	@PutMapping("/updateRegistration")
	public Registration updateRegistration(@RequestBody Registration reg) {
		return service.updateRegistration(reg);
	}
	
	@DeleteMapping("/deleteRegistration/{id}")
	public String deleteRegistration(@PathVariable int id) {
		return service.deleteRegistration(id);
	}
	
	

}
