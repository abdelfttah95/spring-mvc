package src;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author abdel
 */
@Controller
public class SillyController {
    
    @RequestMapping("/showForm")
    public String displayTheForm(){
        return "silly";
    }
    
}
