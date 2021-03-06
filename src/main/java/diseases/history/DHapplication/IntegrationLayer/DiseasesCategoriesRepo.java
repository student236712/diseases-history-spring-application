package diseases.history.DHapplication.IntegrationLayer;

import diseases.history.DHapplication.Objects.Entity.DiseasesCategories;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiseasesCategoriesRepo extends JpaRepository<DiseasesCategories, Long> {



    List<DiseasesCategories> findByDiseasesGroupsDescription(String description);
}
