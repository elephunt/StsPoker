package org.pts.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "player")
public class Player {

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<Summary> summaries = new HashSet<Summary>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname")
    private String FirstName;

    @Column(name = "lastname")
    private String LastName;


    public Player() {

    }

    public Player(Set<Summary> summaries) {
        this.summaries = summaries;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }


    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }


    public Set<Summary> getSummaries() {
        return summaries;
    }

    public void setSummaries(Set<Summary> summaries) {
        this.summaries = summaries;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Id : ")
                .append(this.id)
                .append(" First Name : ")
                .append(this.getFirstName())
                .append(" Last Name : ")
                .append(this.getLastName()).append("Summaries : [ ");
        for (Summary summary : getSummaries()) {
            builder.append("Amount : ")
                    .append(summary.getAmount())
                    .append(" Date ")
                    .append(summary.getDate());
        }
        builder.append(" ]");
        return builder.toString();
    }
}
