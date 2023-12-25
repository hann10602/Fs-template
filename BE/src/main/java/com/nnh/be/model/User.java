package com.nnh.be.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user")
public class User extends BaseEntity {
    @Column
    private String username;
    @Column
    private String password;
}