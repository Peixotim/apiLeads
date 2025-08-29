package digital.rj.apileads.Enterprise;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/list/{id}")
    public EnterpriseModel listEnterpriseId(@PathVariable Integer id){
        return enterpriseService.enterpriseListId(id);
    }

    @PostMapping("/adicionar")
    public EnterpriseModel enterpriseAdd(EnterpriseModel enterpriseModel){
        return enterpriseService.enterpriseAdd(enterpriseModel);
    }


}