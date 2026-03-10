package pl.ANSpark.matchupbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "matches", uniqueConstraints = {@UniqueConstraint(columnNames = {"profile1_id", "profile2_id"})})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile1_id", nullable = false)
    private Profile profile1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile2_id", nullable = false)
    private Profile profile2;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "match", cascade = CascadeType.ALL)
    @Builder.Default
    private List<Message> messages = new ArrayList<>();

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();

    }






}
