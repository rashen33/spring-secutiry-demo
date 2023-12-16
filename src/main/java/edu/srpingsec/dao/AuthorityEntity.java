package edu.srpingsec.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long authId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;


}
