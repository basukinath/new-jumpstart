package adpproject.jumpstartproject.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import adpproject.jumpstartproject.Entity.Registration;


@Repository
public interface RegistrationRepo extends JpaRepository<Registration, Integer> {

	Optional<Registration> findByName(String name);
	
	@Query(value = "SELECT * FROM MENTORREGISTRATION WHERE name = ?1 AND organization = ?2",nativeQuery = true)
	public List<Registration> findByNameAndOrg(String name, String org);

}
