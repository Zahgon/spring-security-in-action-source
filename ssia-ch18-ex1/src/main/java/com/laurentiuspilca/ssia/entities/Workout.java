package com.laurentiuspilca.ssia.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String user;

    private LocalDateTime start;

    private LocalDateTime end;

    private int difficulty;

    public int getId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setId(int id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getUser() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setUser(String user) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public LocalDateTime getStart() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setStart(LocalDateTime start) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public LocalDateTime getEnd() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setEnd(LocalDateTime end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getDifficulty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDifficulty(int difficulty) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
