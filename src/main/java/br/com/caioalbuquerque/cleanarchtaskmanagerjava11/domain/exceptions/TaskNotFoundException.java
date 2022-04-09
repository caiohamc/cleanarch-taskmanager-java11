package br.com.caioalbuquerque.cleanarchtaskmanagerjava11.domain.exceptions;

/**
 * @author Caio Henrique Albuquerque
 * @since 22/03/2022
 */
public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(Long id) {
        super("Could not find task with id " + id);
    }
}