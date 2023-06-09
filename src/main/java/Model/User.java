package Model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.io.Serializable;



@NamedQuery(name = "User.FindByEmailId", query = "select u from User u where u.email=:email")
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name="user")
public class User implements Serializable {
    private static final long serialVersionUId=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column (name="name")
    private String name;

    @Column (name="contactNumber")
    private Integer contactNumber;

    @Column (name="email")
    private String email;

    @Column (name="status")
    private String status;

    @Column (name="role")
    private String role;




}