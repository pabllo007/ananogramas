package anagramas.contoller.v1;

import anagramas.service.AnagramaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/anagramas")
public class AnagramaController {

    private final AnagramaService service;

    public AnagramaController(AnagramaService service) {
        this.service = service;
    }

    @GetMapping("/{entrada}")
    public ResponseEntity<List<String>> gerar(@PathVariable String entrada) {
        return ResponseEntity.ok(service.gerarAnagramas(entrada));
    }
}
