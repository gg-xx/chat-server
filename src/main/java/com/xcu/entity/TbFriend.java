package com.xcu.entity;

import java.util.Date;

public class TbFriend {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_friend.id
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_friend.userid
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_friend.friends_id
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    private String friendsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_friend.comments
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    private String comments;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_friend.createtime
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_friend.id
     *
     * @return the value of tb_friend.id
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_friend.id
     *
     * @param id the value for tb_friend.id
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_friend.userid
     *
     * @return the value of tb_friend.userid
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_friend.userid
     *
     * @param userid the value for tb_friend.userid
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_friend.friends_id
     *
     * @return the value of tb_friend.friends_id
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public String getFriendsId() {
        return friendsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_friend.friends_id
     *
     * @param friendsId the value for tb_friend.friends_id
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public void setFriendsId(String friendsId) {
        this.friendsId = friendsId == null ? null : friendsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_friend.comments
     *
     * @return the value of tb_friend.comments
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_friend.comments
     *
     * @param comments the value for tb_friend.comments
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_friend.createtime
     *
     * @return the value of tb_friend.createtime
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_friend.createtime
     *
     * @param createtime the value for tb_friend.createtime
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}