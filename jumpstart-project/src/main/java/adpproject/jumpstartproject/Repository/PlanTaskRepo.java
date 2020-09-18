package adpproject.jumpstartproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import adpproject.jumpstartproject.Entity.PlanTask;

public interface PlanTaskRepo extends JpaRepository<PlanTask, Integer> {

}
