package pl.ANSpark.matchupbackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.ANSpark.matchupbackend.model.Match;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match,Long> {

    @Query("SELECT m FROM Match m WHERE m.profile1.id = :profileId OR m.profile2.id = :profileId ORDER BY m.createdAt DESC")
    List<Match> findAllByProfileId(@Param("profileId") Long profileId);

}
