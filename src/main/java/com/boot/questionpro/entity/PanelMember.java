package com.boot.questionpro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "qp_panel_member")
@Getter
@Setter
@NoArgsConstructor
public class PanelMember {

    @Id
    private Integer id;
    @Column(name = "panel_id")
    private Integer panelId;
    private Integer status;
    @Column(name = "email_address")
    private String emailAddress;
    private String password;
    @Column(name = "creation_date")
    private LocalDateTime creationDate;
    @Column(name = "country_code_weight")
    private Float countryCodeWeight;
    private String firstname;
    private String middlename;
    private String lastname;
    private Integer source;
    @Column(name = "verify_send_date")
    private Date verifySendDate;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "last_login_ts")
    private LocalDateTime lastLoginTs;
    @Column(name = "domain_name")
    private String domainName;
    @Column(name = "unsubscribe_date")
    private LocalDateTime unsubscribeDate;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    private String country;
    @Column(name = "zipcode_4")
    private String zipCode4;
    @Column(name = "mobile_number")
    private String mobileNumber;
    private String username;

    private String custom1;
    private String custom2;
    private String custom3;
    private String custom4;
    private String custom5;

}
