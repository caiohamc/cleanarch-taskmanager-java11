package br.com.caioalbuquerque.cleanarchtaskmanagerjava11.adapter.newtask.web;

import br.com.caioalbuquerque.cleanarchtaskmanagerjava11.domain.enums.TaskStatusEnum;
import br.com.caioalbuquerque.cleanarchtaskmanagerjava11.domain.enums.TaskTypeEnum;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author Caio Albuquerque
 * @since 22/03/2022
 */
public class NewTaskRequest {

    private String name;

    private String description;

    @NotNull
    private TaskStatusEnum status;

    private TaskTypeEnum type;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "update_date")
    private Date updateDate;





    public NovoLivroRequest(@NotBlank String titulo,
                            @NotNull @Positive BigDecimal preco,
                            @NotBlank @ISBN(type = Type.ISBN_10) String isbn) {
        super();
        this.titulo = titulo;
        this.preco = preco;
        this.isbn = isbn;
    }
}
