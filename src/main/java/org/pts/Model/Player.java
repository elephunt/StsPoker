package org.pts.Model;

import javax.persistence.*;

/**
 * Created by romanm on 12/03/17.
 */
@Entity
@Table(name = "Players")
public class Player {

    private Long id;

    private String FirstName;

    private String LastName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "FirstName")
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    @Column(name = "LastName")
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
