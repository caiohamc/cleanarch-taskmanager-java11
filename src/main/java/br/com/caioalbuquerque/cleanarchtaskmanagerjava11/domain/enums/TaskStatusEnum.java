package br.com.caioalbuquerque.cleanarchtaskmanagerjava11.domain.enums;

/**
 * @author Caio Henrique Albuquerque
 * @since 22/03/2022
 */
public enum TaskStatusEnum {
    NEW(1), ACTIVE(2), SUSPENDED(3), ABORTED(4), ENDED(5);

    private final int status;

    TaskStatusEnum(int status) {
        this.status = status;
    }

    public int getTaskStatus() {
        return status;
    }
}