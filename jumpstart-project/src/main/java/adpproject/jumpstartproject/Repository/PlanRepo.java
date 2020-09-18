package adpproject.jumpstartproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import adpproject.jumpstartproject.Entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer> {

}
