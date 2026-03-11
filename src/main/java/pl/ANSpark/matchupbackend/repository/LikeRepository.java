package pl.ANSpark.matchupbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ANSpark.matchupbackend.model.Like;
import java.util.Optional;


@Repository
public interface LikeRepository extends JpaRepository<Like,Long> {
    boolean existsByFromProfileIdAndToProfileId(Long fromId, Long toId);
    Optional<Like> findByFromProfileIdAndToProfileId(Long fromId, Long toId);
}
