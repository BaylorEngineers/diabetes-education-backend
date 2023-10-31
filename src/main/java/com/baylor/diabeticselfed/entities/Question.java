package com.baylor.diabeticselfed.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue
    private Integer id;
    private String description;
}