package com.baylor.diabeticselfed.entities;

import jakarta.persistence.*;
import lombok.*;

import com.baylor.diabeticselfed.token.Token;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "content_area")
public class ContentArea {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

//    @OneToMany(mappedBy = "ContentArea")
//    private List<Module> modules;
}