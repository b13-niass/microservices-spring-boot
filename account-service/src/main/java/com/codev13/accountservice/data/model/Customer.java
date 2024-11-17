package com.codev13.accountservice.data.model;

import lombok.*;

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor @Builder
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
