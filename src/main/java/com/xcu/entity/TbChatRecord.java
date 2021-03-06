package com.xcu.entity;

import java.util.Date;

public class TbChatRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_chat_record.id
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_chat_record.userid
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_chat_record.friendid
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    private String friendid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_chat_record.has_read
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    private Integer hasRead;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_chat_record.createtime
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_chat_record.has_delete
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    private Integer hasDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_chat_record.message
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    private String message;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_chat_record.id
     *
     * @return the value of tb_chat_record.id
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_chat_record.id
     *
     * @param id the value for tb_chat_record.id
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_chat_record.userid
     *
     * @return the value of tb_chat_record.userid
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_chat_record.userid
     *
     * @param userid the value for tb_chat_record.userid
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_chat_record.friendid
     *
     * @return the value of tb_chat_record.friendid
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public String getFriendid() {
        return friendid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_chat_record.friendid
     *
     * @param friendid the value for tb_chat_record.friendid
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public void setFriendid(String friendid) {
        this.friendid = friendid == null ? null : friendid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_chat_record.has_read
     *
     * @return the value of tb_chat_record.has_read
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public Integer getHasRead() {
        return hasRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_chat_record.has_read
     *
     * @param hasRead the value for tb_chat_record.has_read
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public void setHasRead(Integer hasRead) {
        this.hasRead = hasRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_chat_record.createtime
     *
     * @return the value of tb_chat_record.createtime
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_chat_record.createtime
     *
     * @param createtime the value for tb_chat_record.createtime
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_chat_record.has_delete
     *
     * @return the value of tb_chat_record.has_delete
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public Integer getHasDelete() {
        return hasDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_chat_record.has_delete
     *
     * @param hasDelete the value for tb_chat_record.has_delete
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public void setHasDelete(Integer hasDelete) {
        this.hasDelete = hasDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_chat_record.message
     *
     * @return the value of tb_chat_record.message
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_chat_record.message
     *
     * @param message the value for tb_chat_record.message
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}