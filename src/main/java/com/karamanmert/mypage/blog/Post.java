package com.karamanmert.mypage.blog;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.UUID;

/**
 * @author karamanmert
 */
@Entity
@Getter
@Setter
@Table(name = "post")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @CreationTimestamp
    @Column(name = "created_date")
    private LocalDate createdDate;

    @UpdateTimestamp
    @Column(name = "updated_date")
    private LocalDate updatedDate;

    @Column(name = "unique_id", nullable = false, unique = true)
    private String uniqueId;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "category", nullable = false)
    private Category category;

    @Column(name = "title", nullable = false)
    private String title;

    // todo: tags ..

    @Lob
    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "image_url")
    private String imageUrl; // todo: birden fazla url olursa ayrı entityde handle et.

    @PrePersist
    void generateUniqueId(){
        this.uniqueId = UUID.randomUUID().toString();
    }
}
