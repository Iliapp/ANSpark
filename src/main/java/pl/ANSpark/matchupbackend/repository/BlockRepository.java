package pl.ANSpark.matchupbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ANSpark.matchupbackend.model.Block;

@Repository
public interface BlockRepository extends JpaRepository<Block,Long> {
    boolean existsByBlockerProfileIdAndBlockedProfileId(Long blockerId, Long blockedId);
}
