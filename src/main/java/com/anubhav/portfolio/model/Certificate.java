package com.anubhav.portfolio.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "certificate")
@NoArgsConstructor
@Getter
public class Certificate {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "link",  nullable = false, length = 255)
    private String link;

    @Column(name = "image_url", length = 512)
    private String imageUrl;

    @Column(name = "is_deleted")
    private boolean isDeleted = false;
}
