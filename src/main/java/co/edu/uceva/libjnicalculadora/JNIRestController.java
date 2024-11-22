package co.edu.uceva.cifradorcesar;

import libCifrador.CifradorCesar;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cifrador")
public class JNIRestController {

    private final CifradorCesar cifradorCesar = new CifradorCesar();

    @PostMapping("/cifrar")
    public String cifrar(@RequestParam String texto, @RequestParam int desplazamiento) {
        return cifradorCesar.cifrarCesar(texto, desplazamiento);
    }

    @PostMapping("/descifrar")
    public String descifrar(@RequestParam String texto, @RequestParam int desplazamiento) {
        return cifradorCesar.descifrarCesar(texto, desplazamiento);
    }

}