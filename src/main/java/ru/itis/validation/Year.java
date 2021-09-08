package ru.itis.validation;

import ru.itis.validation.impl.YearConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = YearConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Year {

    int value();
    String message() default "Вам должно быть больше 18 лет";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
