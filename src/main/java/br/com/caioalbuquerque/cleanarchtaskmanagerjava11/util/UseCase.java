package br.com.caioalbuquerque.cleanarchtaskmanagerjava11.util;

import org.springframework.stereotype.Component;
import java.lang.annotation.*;

/**
 * @author Caio Albuquerque
 * @since 22/03/2022
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface UseCase {

}