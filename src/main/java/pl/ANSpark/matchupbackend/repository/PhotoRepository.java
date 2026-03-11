package pl.ANSpark.matchupbackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ANSpark.matchupbackend.model.Photo;
import java.util.List;

@Repository
public interface PhotoRepository extends JpaRepository<Photo,Long> {

    List<Photo> findByProfileIdOrderByOrderIndexAsc(Long profileId);
    int countByProfileId(Long profileId);

}
