package com.sqd.po;

import java.io.Serializable;

public class TypeInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_info.id
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_info.name
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    private String name;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_info.reamrks
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table type_info
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_info.id
     *
     * @return the value of type_info.id
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type_info.id
     *
     * @param id the value for type_info.id
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_info.name
     *
     * @return the value of type_info.name
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type_info.name
     *
     * @param name the value for type_info.name
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_info.reamrks
     *
     * @return the value of type_info.reamrks
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2021
     */

}