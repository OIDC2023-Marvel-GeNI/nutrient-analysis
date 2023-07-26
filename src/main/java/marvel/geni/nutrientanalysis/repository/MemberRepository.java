package marvel.geni.nutrientanalysis.repository;

import marvel.geni.nutrientanalysis.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
