package com.example.library.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "workouts")
@AllArgsConstructor
@NoArgsConstructor
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_workout;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDateTime time_start;

    @Column(nullable = false)
    private LocalDateTime time_end;

    @Column(nullable = false)
    private float distance;

    @Column(nullable = false)
    private float pace;

    @Column
    private String note;

    @Column(nullable = false)
    private float calories_burned;
}
