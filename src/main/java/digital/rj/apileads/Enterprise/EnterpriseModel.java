package digital.rj.apileads.Enterprise;

import com.fasterxml.jackson.annotation.JsonIgnore;
import digital.rj.apileads.Leads.LeadModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_enterprise")
public class EnterpriseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "telefone")
    private int telefone;

    @OneToMany(mappedBy = "enterprise")
    @JsonIgnore
    private List<LeadModel> leadModels; //Aqui é para colocar a lista que recebe no caso empresa recebe leadsModel

}
