package priv.scor.example.cxf_webservice.service;

import java.util.Date;

public class User {
    private static final long serialVersionUID = -5939599230753662529L;
    
    private Long userId;
    private String username;
    private String email;
    private Date gmtCreate;
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getGmtCreate() {
        return gmtCreate;
    }
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
    @Override
    public String toString() {
        return "User [userId=" + userId + ", username=" + username + ", email=" + email + ", gmtCreate=" + gmtCreate
                + "]";
    }
    
    
    
}
