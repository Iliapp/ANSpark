package pl.ANSpark.matchupbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;




@Entity
@Table(name = "likes", uniqueConstraints = {@UniqueConstraint(columnNames = {"from_profile_id", "to_profile_id"})})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "from_profile_id", nullable = false)
    private Profile fromProfile;

    @ManyToOne
    @JoinColumn(name = "to_profile_id", nullable = false)
    private Profile toProfile;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();

    }




}
