package anagramas.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.springframework.util.ObjectUtils.isEmpty;

@Service
public class AnagramaService {

    /**
     *  Metodo que gera anagramas
     * Antes de gerar é realizadp validação da entrada
     * @param entrada
     * @return Retornar uma lista de anagramas de acordo com a entrada
     */
    public List<String> gerarAnagramas(String entrada) {
        validarEntrada(entrada);
        List<String> resultado = new ArrayList<>();
        List<Character> letras = new ArrayList<>();
        for (char c : entrada.toUpperCase().toCharArray()) {
            letras.add(c);
        }
        gerar("", letras, resultado);
        return resultado;
    }

    /**
     * Método recursivo que monta os anagramas.
     *
     * @param parcial String parcial construída até o momento.
     * @param restantes Lista de caracteres que faltam para ser usados
     * @param resultado Lista onde os anagramas serão armazenados para retorno.
     */
    private void gerar(String parcial, List<Character> restantes, List<String> resultado) {
        if (restantes.isEmpty()) {
            resultado.add(parcial);
            return;
        }

        for (int i = 0; i < restantes.size(); i++) {
            char atual = restantes.get(i);
            List<Character> proximas = new ArrayList<>(restantes);
            proximas.remove(i);
            gerar(parcial + atual, proximas, resultado);
        }
    }


    /**
     * Metodo que realiza validação da entrada
     *
     * @param entrada
     */
    private void validarEntrada(String entrada) {
        if (isEmpty(entrada)) {
            throw new IllegalArgumentException("A entrada não pode ser vazia.");
        }

        if (!entrada.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("A entrada deve conter apenas letras.");
        }

        if (temCaracteresDuplicados(entrada)) {
            throw new IllegalArgumentException("A entrada deve conter apenas letras distintas.");
        }
    }

    /**
     * Verifica se a contém caracteres duplicados
     *
     * @param entrada
     * @return true se houver letras repetidas e false se não houver repetidas.
     */
    private boolean temCaracteresDuplicados(String entrada) {
        Set<Character> s = new HashSet<>();
        for (char c : entrada.toUpperCase().toCharArray()) {
            if (!s.add(c)) return true;
        }
        return false;
    }

}
