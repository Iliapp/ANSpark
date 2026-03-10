package pl.ANSpark.matchupbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "messages")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder




public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "match_id", nullable = false)
    private Match match;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender_profile_id", nullable = false)
    private Profile senderProfile;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String content;

    @Column(name = "sent_at",nullable = false)
    private LocalDateTime sentAt;

    @Column(nullable = false)
    @Builder.Default
    private Boolean isRead = false;

    @PrePersist
    public void onSent()
    {
        this.sentAt = LocalDateTime.now();
    }


}
