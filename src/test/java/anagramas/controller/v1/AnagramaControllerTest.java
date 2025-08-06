package anagramas.controller.v1;

import anagramas.contoller.v1.AnagramaController;
import anagramas.service.AnagramaService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.objectweb.asm.TypeReference;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class AnagramaControllerTest {

    @Mock
    private AnagramaService service;

    @InjectMocks
    private AnagramaController controller;

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void deveRetornarListaDeAnagramas() throws Exception {
        String entrada = "ABC";
        List<String> esperado = List.of("ABC", "ACB", "BAC", "BCA", "CAB", "CBA");

        when(service.gerarAnagramas(entrada)).thenReturn(esperado);

        mockMvc.perform(get("/api/v1/anagramas/{entrada}", entrada))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(esperado.size()))
                .andExpect(jsonPath("$[0]").value("ABC"));
    }

}
