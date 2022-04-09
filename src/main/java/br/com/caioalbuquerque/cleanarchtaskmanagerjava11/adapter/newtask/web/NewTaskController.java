package br.com.caioalbuquerque.cleanarchtaskmanagerjava11.adapter.newtask.web;

import br.com.caioalbuquerque.cleanarchtaskmanagerjava11.domain.entity.Task;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 22/03/2022
 */
@RestController
public class NewTaskController {
    private static final Logger LOGGER = Logger.getLogger("NewTaskController");

    @PostMapping("/api/v1/tasks")
    @Transactional
    public Integer execute(@RequestBody @Valid NewTaskRequest request) {
        LOGGER.info("Starting new task creation process");

        return null;
    }
}
