package br.com.caioalbuquerque.cleanarchtaskmanagerjava11.application.newtask;

import br.com.caioalbuquerque.cleanarchtaskmanagerjava11.domain.entity.Task;
import br.com.caioalbuquerque.cleanarchtaskmanagerjava11.util.UseCase;
import java.util.Optional;

/**
 * @author Caio Albuquerque
 * @since 22/03/2022
 */
@UseCase
public class NewTaskUseCase {

    public Optional<Task> execute(Task newTaskRequest) {
        return null;
    }
}