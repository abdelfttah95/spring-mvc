package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author abdel
 */
class CourseCodeConstraintValidator
        implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode thCourseCode) {
        coursePrefix = thCourseCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext thConstraintValidatorContext) {
        boolean result;

        if (theCode != null) {
            result = theCode.startsWith(coursePrefix);
        } else {
            return true;
        }
        return result;
    }
}