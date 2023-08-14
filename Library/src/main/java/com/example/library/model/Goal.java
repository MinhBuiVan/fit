package com.example.library.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "goals")
@AllArgsConstructor
@NoArgsConstructor
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_goal;

    @Column(nullable = false)
    private LocalDateTime time_start;

    @Column(nullable = false)
    private LocalDateTime time_end;

    @Column(nullable = false)
    private String type;

    @Column
    private String description;

    @Column(nullable = false)
    private int target;

    @Column(nullable = false)
    private float current_complete;
}
