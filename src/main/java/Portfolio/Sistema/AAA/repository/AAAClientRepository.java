package Portfolio.Sistema.AAA.repository;

import Portfolio.Sistema.AAA.entity.AaaClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AAAClientRepository extends JpaRepository<AaaClient, Long> {

}
