package km.hw64.manageret.service;

import km.hw64.manageret.model.Task;
import km.hw64.manageret.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final TaskRepository repo;

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public Iterable<Task> findAllTasks() {
       return repo.findAll();
    }

    public void saveTask(Task t) {
        repo.save(t);
    }

    public void clearAllTasks() {
        repo.deleteAll();
    }

    public void finishTask(String taskId) {
        Task t = repo.findById(taskId).get();
        t.setFinished(true);
        repo.save(t);
    }
}
