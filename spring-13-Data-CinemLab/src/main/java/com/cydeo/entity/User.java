package com.cydeo.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "user_account")
public class User extends BaseEntity{

    private String email;
    private String password;
    private String username;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_details_id")//Ya bu kodu yazmaliyiz.Yada field i  private Account accountDetails .Bu sekilde tanimlamaliyiz. Bu kod yerine field ismini AcoountDetail olarak yazsakta olur.
    private Account account;


    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

}
