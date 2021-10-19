package org.example.model;

import java.util.UUID;

public class UserCredentials {

       private final String id;
       private String username;
       private String password;
       private String role;


         //Constructor

    /**
     *
     * @param id String    <b>Not null</b>
     * @param username String <b>Not null</b>
     * @param password String <b>Not null</b>
     * @param role String <b>Not null</b>
     * @throws RuntimeException when UserCredentials are null.
     */
    public UserCredentials(String id, String username, String password, String role) throws RuntimeException{
        if(id == null) throw new RuntimeException("Id was null");
        this.id = id;
        setUsername(username);
        setPassword(password);
        setRole(role);
    }

    public UserCredentials(String username, String password, String role) {
        this(UUID.randomUUID().toString(), username, password, role);
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws RuntimeException {
        if(username == null) throw new RuntimeException("Username was null");
        this.username = username;
    }

    public String getPassword() {
        if(password == null) throw new RuntimeException("Password was null");

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if(role == null) throw new RuntimeException("Role was null");
        this.role = role;
    }
}
