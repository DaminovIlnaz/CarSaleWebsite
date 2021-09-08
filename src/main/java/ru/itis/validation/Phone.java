package ru.itis.validation;

import ru.itis.validation.impl.PhoneConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PhoneConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {
    String message() default "Телефонный номер должен содержать 11 цифр и начинаться с 79 или 89!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
