package br.com.caioalbuquerque.cleanarchtaskmanagerjava11.domain.entity;

import br.com.caioalbuquerque.cleanarchtaskmanagerjava11.domain.enums.TaskStatusEnum;
import br.com.caioalbuquerque.cleanarchtaskmanagerjava11.domain.enums.TaskTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 22/03/2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tasks")
public class Task {
    private static final Logger LOGGER = Logger.getLogger("Task");

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String description;

    private TaskStatusEnum status;

    private TaskTypeEnum type;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "update_date")
    private Date updateDate;

    public Task(String name, String description, TaskStatusEnum status, TaskTypeEnum type, Date creationDate, Date updateDate) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.type = type;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
    }
}