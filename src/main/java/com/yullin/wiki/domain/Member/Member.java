package com.yullin.wiki.domain.Member;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Member {
    private String member_id;
    private String passwd;
    private char gender;
    private Date birth_dt;
    private boolean yullin_yn;
    private String member_type;
    private Date join_dt;
    private Date last_update_dt;

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirth_dt() {
        return birth_dt;
    }

    public void setBirth_dt(Date birth_dt) {
        this.birth_dt = birth_dt;
    }

    public boolean isYullin_yn() {
        return yullin_yn;
    }

    public void setYullin_yn(boolean yullin_yn) {
        this.yullin_yn = yullin_yn;
    }

    public String getMember_type() {
        return member_type;
    }

    public void setMember_type(String member_type) {
        this.member_type = member_type;
    }

    public Date getJoin_dt() {
        return join_dt;
    }

    public void setJoin_dt(Date join_dt) {
        this.join_dt = join_dt;
    }

    public Date getLast_update_dt() {
        return last_update_dt;
    }

    public void setLast_update_dt(Date last_update_dt) {
        this.last_update_dt = last_update_dt;
    }
}
