package edu.srpingsec.dao;

import edu.srpingsec.dto.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

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
