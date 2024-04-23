package fr.epita.bms.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    @Column(name = "building_number")
    private String buildingNumber;
    @Column(name = "house_number")
    private String houseNumber;
    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "password")
    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;
}
