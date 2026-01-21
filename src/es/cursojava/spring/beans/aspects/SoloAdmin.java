package es.cursojava.spring.beans.aspects;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SoloAdmin {
}
