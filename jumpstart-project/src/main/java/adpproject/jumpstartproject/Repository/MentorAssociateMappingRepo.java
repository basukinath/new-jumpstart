package adpproject.jumpstartproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import adpproject.jumpstartproject.Entity.MentorAssociateMapping;


@Repository
public interface MentorAssociateMappingRepo extends JpaRepository<MentorAssociateMapping, Integer> {

	

}
