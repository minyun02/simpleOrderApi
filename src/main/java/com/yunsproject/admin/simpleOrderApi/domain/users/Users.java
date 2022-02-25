package com.yunsproject.admin.simpleOrderApi.domain.users;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yunsproject.admin.simpleOrderApi.domain.orders.Orders;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String phoneNumber;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Orders> orders = new ArrayList<>();

    @CreatedDate
    private LocalDateTime createdDate;

    private LocalDateTime lastLoginDate;
}
