package main.model;

import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<People, Integer> {
}
