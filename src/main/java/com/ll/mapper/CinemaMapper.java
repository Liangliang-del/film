package com.ll.mapper;

import com.ll.po.Cinema;
import com.ll.po.CinemaExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CinemaMapper {
	
	//分页查询
	public List<Cinema> findByPage(Map<String, Integer> map);
	
	//总页数
	public int getTotal();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cinema
     *
     * @mbggenerated
     */
    int countByExample(CinemaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cinema
     *
     * @mbggenerated
     */
    int deleteByExample(CinemaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cinema
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer cId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cinema
     *
     * @mbggenerated
     */
    int insert(Cinema record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cinema
     *
     * @mbggenerated
     */
    int insertSelective(Cinema record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cinema
     *
     * @mbggenerated
     */
    List<Cinema> selectByExample(CinemaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cinema
     *
     * @mbggenerated
     */
    Cinema selectByPrimaryKey(Integer cId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cinema
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Cinema record, @Param("example") CinemaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cinema
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Cinema record, @Param("example") CinemaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cinema
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Cinema record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cinema
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Cinema record);
}