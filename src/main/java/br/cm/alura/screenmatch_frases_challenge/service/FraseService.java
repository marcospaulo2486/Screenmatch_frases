package br.cm.alura.screenmatch_frases_challenge.service;
import br.cm.alura.screenmatch_frases_challenge.dto.FraseDTO;
import br.cm.alura.screenmatch_frases_challenge.principal.Frase;
import br.cm.alura.screenmatch_frases_challenge.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
        Frase frases = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frases.getTitulo(), frases.getFrase(), frases.getPersonagem(), frases.getPoster());
    }
}