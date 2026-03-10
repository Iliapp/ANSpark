package pl.ANSpark.matchupbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "blocks", uniqueConstraints = {@UniqueConstraint(columnNames = {"blocker_profile_id", "blocked_profile_id"})
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "blocker_profile_id", nullable = false)
    private Profile blockerProfile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "blocked_profile_id", nullable = false)
    private Profile blockedProfile;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();

    }


}
