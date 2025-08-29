package digital.rj.apileads.Leads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RequestMapping("leads")
@RestController
public class LeadController {

    private LeadService leadsService;

    public LeadController(LeadService leadsService){
        this.leadsService = leadsService;
    }

    @GetMapping("/listar")
    public List<LeadModel> listarLeads(){
        return leadsService.listarLeads();
    }

    @GetMapping("/listar/{id}")
    public LeadModel listarLeadsId(Long Id){
        return leadsService.listarLeadsId(Id);
    }
}
