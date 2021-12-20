package validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author abdel
 */
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    
    // define default course code 
    public String value() default "tt7";
    
    // define default error message 
    public String message() default "must start with tt7";
    
    // define default groups
    public Class <?>[] groups () default {};
    
    // define default payloads
    public Class <? extends  Payload> [] payload() default {};
    
}
