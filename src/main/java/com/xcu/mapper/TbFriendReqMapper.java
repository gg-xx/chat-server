package com.xcu.mapper;

import com.xcu.entity.TbFriendReq;
import com.xcu.entity.TbFriendReqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFriendReqMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_friend_req
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    int countByExample(TbFriendReqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_friend_req
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    int deleteByExample(TbFriendReqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_friend_req
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_friend_req
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    int insert(TbFriendReq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_friend_req
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    int insertSelective(TbFriendReq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_friend_req
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    List<TbFriendReq> selectByExample(TbFriendReqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_friend_req
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    TbFriendReq selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_friend_req
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbFriendReq record, @Param("example") TbFriendReqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_friend_req
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    int updateByExample(@Param("record") TbFriendReq record, @Param("example") TbFriendReqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_friend_req
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    int updateByPrimaryKeySelective(TbFriendReq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_friend_req
     *
     * @mbggenerated Sat Aug 15 16:44:00 CST 2020
     */
    int updateByPrimaryKey(TbFriendReq record);
}