package com.xcu.entity;

import java.util.Date;

public class TbUser {
    @Override
    public String toString() {
        return "TbUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", picSmall='" + picSmall + '\'' +
                ", picNormal='" + picNormal + '\'' +
                ", nickname='" + nickname + '\'' +
                ", qrcode='" + qrcode + '\'' +
                ", clientId='" + clientId + '\'' +
                ", sign='" + sign + '\'' +
                ", createtime=" + createtime +
                ", phone='" + phone + '\'' +
                '}';
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.id
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.username
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.password
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.pic_small
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    private String picSmall;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.pic_normal
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    private String picNormal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.nickname
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.qrcode
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    private String qrcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.client_id
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    private String clientId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.sign
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    private String sign;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.createtime
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.phone
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    private String phone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.id
     *
     * @return the value of tb_user.id
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.id
     *
     * @param id the value for tb_user.id
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.username
     *
     * @return the value of tb_user.username
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.username
     *
     * @param username the value for tb_user.username
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.password
     *
     * @return the value of tb_user.password
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.password
     *
     * @param password the value for tb_user.password
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.pic_small
     *
     * @return the value of tb_user.pic_small
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public String getPicSmall() {
        return picSmall;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.pic_small
     *
     * @param picSmall the value for tb_user.pic_small
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public void setPicSmall(String picSmall) {
        this.picSmall = picSmall == null ? null : picSmall.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.pic_normal
     *
     * @return the value of tb_user.pic_normal
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public String getPicNormal() {
        return picNormal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.pic_normal
     *
     * @param picNormal the value for tb_user.pic_normal
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public void setPicNormal(String picNormal) {
        this.picNormal = picNormal == null ? null : picNormal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.nickname
     *
     * @return the value of tb_user.nickname
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.nickname
     *
     * @param nickname the value for tb_user.nickname
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.qrcode
     *
     * @return the value of tb_user.qrcode
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public String getQrcode() {
        return qrcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.qrcode
     *
     * @param qrcode the value for tb_user.qrcode
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public void setQrcode(String qrcode) {
        this.qrcode = qrcode == null ? null : qrcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.client_id
     *
     * @return the value of tb_user.client_id
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.client_id
     *
     * @param clientId the value for tb_user.client_id
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.sign
     *
     * @return the value of tb_user.sign
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public String getSign() {
        return sign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.sign
     *
     * @param sign the value for tb_user.sign
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.createtime
     *
     * @return the value of tb_user.createtime
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.createtime
     *
     * @param createtime the value for tb_user.createtime
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.phone
     *
     * @return the value of tb_user.phone
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.phone
     *
     * @param phone the value for tb_user.phone
     *
     * @mbggenerated Sat Aug 15 16:47:19 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}