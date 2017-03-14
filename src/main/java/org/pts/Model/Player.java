package org.pts.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by romanm on 12/03/17.
 */
@Entity
@Table(name = "player")
public class Player {

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<Summary> summaries = new HashSet<Summary>();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "FirstName")
    private String FirstName;
    @Column(name = "LastName")
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
        return "Player{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", summaries=" + summaries +
                '}';
    }
}
