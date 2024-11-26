package com.thiago.cteemisor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.cteemisor.entity.Cte;
import com.thiago.cteemisor.repository.CteRepository;

@Service
public class CteService {

    @Autowired
    private CteRepository cteRepository;

    // Método para salvar um novo Cte
    public Cte saveCte(Cte cte) {
        return cteRepository.save(cte);
    }

    // Método para buscar todos os Ctes
    public List<Cte> getAllCtes() {
        return cteRepository.findAll();
    }

    // Método para buscar um Cte por ID
    public Optional<Cte> getCteById(Long id) {
        return cteRepository.findById(id);
    }

    // Método para atualizar um Cte
    public Cte updateCte(Long id, Cte cteDetails) {
        Optional<Cte> existingCte = cteRepository.findById(id);
        if (existingCte.isPresent()) {
            Cte cte = existingCte.get();
            cte.setCfop(cteDetails.getCfop());
            cte.setTipoServ(cteDetails.getTipoServ());
            cte.setFormaEmissao(cteDetails.getFormaEmissao());
            cte.setValor(cteDetails.getValor());
            cte.setFinalidade(cteDetails.getFinalidade());
            cte.setSerie(cteDetails.getSerie());
            cte.setNumero(cteDetails.getNumero());
            cte.setModelo(cteDetails.getModelo());
            cte.setFormaPag(cteDetails.getFormaPag());
            cte.setChaveNfe(cteDetails.getChaveNfe());
            cte.setEmissaoUf(cteDetails.getEmissaoUf());
            cte.setEmissaoMuni(cteDetails.getEmissaoMuni());
            cte.setInicioUf(cteDetails.getInicioUf());
            cte.setInicioMuni(cteDetails.getInicioMuni());
            cte.setFinalUf(cteDetails.getFinalUf());
            cte.setFinalMuni(cteDetails.getFinalMuni());
            cte.setProdPredo(cteDetails.getProdPredo());
            cte.setValorCarga(cteDetails.getValorCarga());
            cte.setPesoCarga(cteDetails.getPesoCarga());
            cte.setTipoPeso(cteDetails.getTipoPeso());
            cte.setQuantProd(cteDetails.getQuantProd());
            cte.setClassTribut(cteDetails.getClassTribut());
            cte.setIcms(cteDetails.getIcms());
            return cteRepository.save(cte);
        }
        return null;  // Retorna null se o Cte não for encontrado
    }

    // Método para excluir um Cte por ID
    public void deleteCte(Long id) {
        cteRepository.deleteById(id);
    }

}
