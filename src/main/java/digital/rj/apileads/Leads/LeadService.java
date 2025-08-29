package digital.rj.apileads.Leads;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeadService {

    //Injeção de Dados
    private LeadRepository leadRepository;

    public LeadService(LeadRepository leadRepository){
        this.leadRepository = leadRepository;
    }



    public List<LeadModel> listarLeads(){
        return leadRepository.findAll();
    }

    public LeadModel listarLeadsId(Long id){
        Optional<LeadModel> model = leadRepository.findById(id);
        return model.orElseThrow(RuntimeException::new);
    }

}
