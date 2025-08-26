package digital.rj.apileads.Leads;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<LeadModel,Long> {
}
