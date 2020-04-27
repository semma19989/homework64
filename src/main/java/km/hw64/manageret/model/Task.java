package km.hw64.manageret.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document(collection = "tasks")
public class Task {
    @Id
    private String id;
    private String task;
    private boolean isFinished;

    public Task(String task) {
        this.id = UUID.randomUUID().toString();
        this.task = task;
        this.isFinished = false;
    }

}
