package com.example.usersapi.models;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "UUID")
    private String uuid;

    @Column(name = "USER_NAME")
    private String user_name;

    @Column(name = "LOWER_USER_NAME")
    private String lower_user_name;

    @Column(name = "FIRST_NAME")
    private String first_name;

    @Column(name = "LOWER_FIRST_NAME")
    private String lower_first_name;

    @Column(name = "LAST_NAME")
    private String last_name;

    @Column(name = "LOWER_LAST_NAME")
    private String lower_last_name;

    @Column(name = "EMAIL_ADDRESS")
    private String email_address;

    @Column(name = "LOWER_EMAIL_ADDRESS")
    private String lower_email_address;

    @Column(name = "DATE_CREATED")
    private String date_created;

    public User(String uuid, String user_name, String lower_user_name, String first_name,
                String lower_first_name, String last_name, String lower_last_name, String email_address,
                String lower_email_address, String date_created) {
        this.uuid = uuid;
        this.user_name = user_name;
        this.lower_user_name = lower_user_name;
        this.first_name = first_name;
        this.lower_first_name = lower_first_name;
        this.last_name = last_name;
        this.lower_last_name = lower_last_name;
        this.email_address = email_address;
        this.lower_email_address = lower_email_address;
        this.date_created = date_created;
    }
}

