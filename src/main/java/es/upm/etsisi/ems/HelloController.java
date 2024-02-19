package es.upm.etsisi.ems;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String raiz(HttpServletResponse httpResponse) throws IOException {
        httpResponse.sendRedirect("/hola");
        return null;
    }

    @RequestMapping("/hola")
    public String hola(@RequestParam(value = "nombre", required = false, defaultValue = "Mundo") String nombre, Model model) {
        model.addAttribute("nombre", nombre);
        return "hola";
    }

}
