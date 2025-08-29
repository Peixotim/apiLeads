package digital.rj.apileads.Enterprise;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseService {
    private EnterpriseRepository enterpriseRepository;

    public EnterpriseService(EnterpriseRepository enterpriseRepository){
        this.enterpriseRepository = enterpriseRepository;
    }

    public List<EnterpriseModel> enterpriseList(){
        return enterpriseRepository.findAll();
    }

    public EnterpriseModel enterpriseListId(Integer id){
        Optional<EnterpriseModel> model = enterpriseRepository.findById(id);
        return model.orElseThrow(RuntimeException::new);
    }
}
