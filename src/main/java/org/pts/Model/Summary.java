package org.pts.Model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by romanm on 14/03/17.
 */
@Entity
@Table(name = "summary")
public class Summary {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "Date")
    private Date date;

    @Column(name = "Amount")
    private Long amount;

    @ManyToOne
    @JoinColumn(name = "PLAYER_ID")
    private Player player;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }


    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "";
    }

}
