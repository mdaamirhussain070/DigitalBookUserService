package com.userservice.entity;



import javax.persistence.*;


@Entity
@Table(name = "TBL_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private int id;
    @Column(name="USER_NAME")
    private String userName;
    @Column(name="USER_PASSWORD")
    private String password;
    @Column(name="EMAIL_ID")
    private String emailId;
    @Column(name="PHONE_NUMBER")
    private String phoneNumber;
    @Column(name="IS_ACTIVE")
    private String isActive;


//    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    @JoinColumn(name = "ID")
//    private Role role;

    public User() {
    }

    public User(int id, String userName, String password, String emailId, String phoneNumber, String isActive) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
       // this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
}
