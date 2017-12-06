package org.pts.Model;

import javax.persistence.*;


@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;


    public Player() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Id : ")
                .append(this.id)
                .append(" First Name : ")
                .append(this.getFirstname())
                .append(" Last Name : ")
                .append(this.getLastname()).append(" Summaries : [ ");
        builder.append(" ]");
        return builder.toString();
    }
}
