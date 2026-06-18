package Portfolio.Sistema.AAA.repository;

import Portfolio.Sistema.AAA.entity.AuthorizationProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorizationProfileRepository extends JpaRepository<AuthorizationProfile, Long> {

}
