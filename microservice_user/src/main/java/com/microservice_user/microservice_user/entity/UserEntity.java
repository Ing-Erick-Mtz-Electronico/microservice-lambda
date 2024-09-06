package com.microservice_user.microservice_user.entity;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
import lombok.Data;

@Data
// @Entity
// @Table(name="users")
public class UserEntity {
    // @Id
    private Integer id;
    private String name;
    private String email;
}
