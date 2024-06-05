package com.odji.spring_back_end.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@Builder
@Entity
@Table(name = "personel")
@AllArgsConstructor
@NoArgsConstructor
public class Personel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nom")
    private String first_Name;

    @Column(name = "prenom")
    private String last_Name;

    @Column(name = "email")
    private String email;


}
