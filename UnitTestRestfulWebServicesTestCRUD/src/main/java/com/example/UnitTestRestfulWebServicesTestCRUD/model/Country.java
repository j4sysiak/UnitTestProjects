package com.example.UnitTestRestfulWebServicesTestCRUD.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tbl_countries")
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 64)
    private String name;

    @OneToMany(mappedBy = "country")  //One Country to Many States
    private Set<State> states;
}
