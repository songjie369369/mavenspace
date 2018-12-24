package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 4232117149484124796L;

    @Id
    @GeneratedValue
    private  Integer id;

    private String userName;

    private String userPwd;

    @CreatedDate
    @JsonFormat(pattern="yyyy-MM-dd ")
    private Date datetime;

    @Transient
    private String times;

    private String url;

    public String getTimes() {
        if (this.datetime != null){
            SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
           times = sim.format(datetime);
        }
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", datetime=" + datetime +
                ", times='" + times + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
