package digital.rj.apileads.Leads;

import digital.rj.apileads.Enterprise.EnterpriseModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_leads")
@EqualsAndHashCode(callSuper = false)
public class LeadModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="areaDeInteresse")
    private String areaDeInteresse;

    @Column(name="telefone")
    private int telefone;

    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private EnterpriseModel enterprise;
}
