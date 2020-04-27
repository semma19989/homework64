package km.hw64.manageret.repository;

import km.hw64.manageret.model.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TaskRepository extends PagingAndSortingRepository<Task, String> {
}
