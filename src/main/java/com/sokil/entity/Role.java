package com.sokil.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(exclude = "users")
@ToString
@Entity
@Table(name = "roles")
public class Role implements Serializable{
    @Id
    @Column(name = "ROLE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;
    @Column(name = "ROLE")
    private String role;

    @ManyToMany(mappedBy = "roles", cascade = CascadeType.ALL)
    private Set<User> users = new HashSet<>();
}
