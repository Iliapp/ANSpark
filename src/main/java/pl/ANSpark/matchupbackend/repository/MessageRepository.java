package pl.ANSpark.matchupbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ANSpark.matchupbackend.model.Message;
import java.util.List;


@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {
    List<Message> findByMatchIdOrderBySentAtAsc(Long matchId);

}
