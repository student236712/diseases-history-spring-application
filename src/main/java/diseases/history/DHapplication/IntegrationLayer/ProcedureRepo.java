package diseases.history.DHapplication.IntegrationLayer;

import diseases.history.DHapplication.Objects.Entity.Procedure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcedureRepo extends JpaRepository<Procedure, Long> {



}
