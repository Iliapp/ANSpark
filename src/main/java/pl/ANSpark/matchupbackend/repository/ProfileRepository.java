package pl.ANSpark.matchupbackend.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.ANSpark.matchupbackend.model.Profile;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {


    Optional<Profile> findByUserId(UUID userId);

    @Query("SELECT p FROM Profile p WHERE p.id != :excludeId " +
            "AND p.id NOT IN (SELECT l.toProfile.id FROM Like l WHERE l.fromProfile.id = :excludeId) " +
            "AND p.id NOT IN (SELECT b.blockedProfile.id FROM Block b WHERE b.blockerProfile.id = :excludeId) " +
            "AND p.id NOT IN (SELECT b.blockerProfile.id FROM Block b WHERE b.blockedProfile.id = :excludeId)")
    Page<Profile> findDiscoverableProfiles(@Param("excludeId") UUID  excludeId, Pageable pageable);






}
