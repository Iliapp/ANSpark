package pl.ANSpark.matchupbackend.dto.response;


import lombok.Data;
import org.jspecify.annotations.Nullable;

import java.time.LocalDateTime;

@Data
public class MatchResponse {
    private Long matchId;
    private ProfileResponse profile;
    private String lastMessage; // nulleable
    private LocalDateTime createdAt;

    public MatchResponse(Long matchId, ProfileResponse profile, String lastMessage, LocalDateTime createdAt) {
        this.matchId = matchId;
        this.profile = profile;
        this.lastMessage = lastMessage;
        this.createdAt = createdAt;
    }

}
