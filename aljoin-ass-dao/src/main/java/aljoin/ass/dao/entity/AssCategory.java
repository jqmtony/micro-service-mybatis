package aljoin.ass.dao.entity;

import aljoin.dao.entity.Entity;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

/**
 * 
 * 固定资产分类表(实体类).
 * 
 * @author：xuc.
 * 
 * @date： 2018-01-09
 */
public class AssCategory extends Entity<AssCategory> {

    private static final long serialVersionUID = 1L;

    /**
     * 状态 (0：无效 1：有效)
     */
    private Integer isActive;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 排序
     */
    private Integer categoryRank;
    /**
     * 分类等级
     */
    private Integer categoryLevel;
    /**
     * 父级分类id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long parentId;

    public Integer getIsActive() {
        return isActive;
    }

    public AssCategory setIsActive(Integer isActive) {
        this.isActive = isActive;
        return this;
    }

    public String getName() {
        return name;
    }

    public AssCategory setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getCategoryRank() {
        return categoryRank;
    }

    public AssCategory setCategoryRank(Integer categoryRank) {
        this.categoryRank = categoryRank;
        return this;
    }

    public Integer getCategoryLevel() {
        return categoryLevel;
    }

    public AssCategory setCategoryLevel(Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
        return this;
    }

    public Long getParentId() {
        return parentId;
    }

    public AssCategory setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

}
