package com.example.library.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "challenges")
@AllArgsConstructor
@NoArgsConstructor
public class Challenge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_challenge;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDateTime date_start;

    @Column(nullable = false)
    private LocalDateTime date_end;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String rule;

    @Column(nullable = false)
    private String prize;

    @Column(nullable = false)
    private int target;

    @Column(nullable = false)
    private float progress;
}
