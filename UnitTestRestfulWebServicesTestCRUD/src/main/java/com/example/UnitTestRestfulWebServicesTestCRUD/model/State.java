package com.example.UnitTestRestfulWebServicesTestCRUD.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_states")
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 64)
    private String name;

    @ManyToOne    // Many States toOne Country
    @JoinColumn(name = "country_id")
    private Country country;
}