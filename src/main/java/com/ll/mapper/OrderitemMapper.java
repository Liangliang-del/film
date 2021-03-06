package com.ll.mapper;

import com.ll.po.Orderitem;
import com.ll.po.OrderitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderitemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    int countByExample(OrderitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    int deleteByExample(OrderitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer oiId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    int insert(Orderitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    int insertSelective(Orderitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    List<Orderitem> selectByExample(OrderitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    Orderitem selectByPrimaryKey(Integer oiId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Orderitem record, @Param("example") OrderitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Orderitem record, @Param("example") OrderitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Orderitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Orderitem record);
}