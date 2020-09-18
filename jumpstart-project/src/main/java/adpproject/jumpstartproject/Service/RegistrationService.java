package adpproject.jumpstartproject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adpproject.jumpstartproject.Entity.Registration;
import adpproject.jumpstartproject.Repository.RegistrationRepo;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepo repository;
	
	public Registration register(Registration r) {
		return repository.save(r);
	}
	
	
	public List<Registration> registerMultiple(List<Registration> reg) {
		return repository.saveAll(reg);
	}
	
	
	public List<Registration> getAllRegistration() {
		return repository.findAll();
	}
	
	public Registration getRegistrationByID(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Registration getRegistrationByName(String name) {
		return repository.findByName(name).orElse(null);
	}
	
	public String deleteRegistration(int id) {
		repository.deleteById(id);
		return "Registration removed for - "+ id;
	}
	
	public Registration updateRegistration (Registration reg) {
		Registration ex = repository.findById(reg.getId()).orElse(null);
		ex.setName(reg.getName());
		ex.setAreaOfInterest(reg.getAreaOfInterest());
		ex.setEmail(reg.getEmail());
		ex.setExpMentor(reg.getExpMentor());
		ex.setImage(reg.getImage());
		ex.setOrganization(reg.getOrganization());
		ex.setPassword(reg.getPassword());
		ex.setRole(reg.getRole());
		return repository.save(ex);
	}
	
	public List<Registration> getConditionalReg(String name, String org){
		return repository.findByNameAndOrg(name, org);
	}
	
	
}
