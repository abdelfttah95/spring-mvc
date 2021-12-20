package src;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author abdel
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {

        // create student object 
        Student thStudent = new Student();

        // add student object to the model
        model.addAttribute("student", thStudent);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        // log the input data
        System.out.println("theStudent " + theStudent.getFirstName()
                + " " + theStudent.getLastName());
        return "student-confirmation";
    }

}
