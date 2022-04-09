package br.com.caioalbuquerque.cleanarchtaskmanagerjava11.domain.enums;

/**
 * @author Caio Henrique Albuquerque
 * @since 22/03/2022
 */
public enum TaskTypeEnum {
    JOB_TASK(1), HOME_TASK(2), SPORT_TASK(3), HEALTH_TASK(4), EVENT_TASK(5), OTHER_TASK(6);

    private final int type;

    TaskTypeEnum(int type) {
        this.type = type;
    }

    public int getTaskType() {
        return type;
    }
}