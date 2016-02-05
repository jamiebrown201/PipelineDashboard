package io.dashboardhub.pipelinedashboard.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.*;

@Data
@Entity
@Table(uniqueConstraints = @UniqueConstraint(name = "username_idx", columnNames = {"username"} ))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String uid;

    @NotNull
    @Size(min = 1, max = 255)
    private String username;

    private String name;
    private String email;

    private Date lastLoggedIn;

    User() {
    }

    public User(String username) {
        this.username = username;
    }
}
