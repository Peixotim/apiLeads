package digital.rj.apileads.Enterprise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {

    private EnterpriseService enterpriseService;

    public EnterpriseController(EnterpriseService enterpriseService){
        this.enterpriseService = enterpriseService;
    }

    @GetMapping("/list")

    public List<EnterpriseModel> listEnterprise(){
        return enterpriseService.enterpriseList();
    }


    public EnterpriseModel listEnterpriseId(Integer id){
        return enterpriseService.enterpriseListId(id);
    }

}