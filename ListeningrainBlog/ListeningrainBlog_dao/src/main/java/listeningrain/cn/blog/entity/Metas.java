package listeningrain.cn.blog.entity;

import java.sql.Timestamp;

public class Metas {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metas.mid
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    private Integer mid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metas.name
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metas.slug
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    private String slug;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metas.type
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metas.description
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metas.sort
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metas.parent
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    private Integer parent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column metas.status
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    private Byte status;

    private String content;

    private Timestamp created;

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metas.mid
     *
     * @return the value of metas.mid
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metas.mid
     *
     * @param mid the value for metas.mid
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metas.name
     *
     * @return the value of metas.name
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metas.name
     *
     * @param name the value for metas.name
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metas.slug
     *
     * @return the value of metas.slug
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    public String getSlug() {
        return slug;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metas.slug
     *
     * @param slug the value for metas.slug
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metas.type
     *
     * @return the value of metas.type
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metas.type
     *
     * @param type the value for metas.type
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metas.description
     *
     * @return the value of metas.description
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metas.description
     *
     * @param description the value for metas.description
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metas.sort
     *
     * @return the value of metas.sort
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metas.sort
     *
     * @param sort the value for metas.sort
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metas.parent
     *
     * @return the value of metas.parent
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metas.parent
     *
     * @param parent the value for metas.parent
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column metas.status
     *
     * @return the value of metas.status
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column metas.status
     *
     * @param status the value for metas.status
     *
     * @mbg.generated Mon Oct 01 16:05:22 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}