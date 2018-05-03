package aljoin.goo.dao.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import aljoin.dao.entity.Entity;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

/**
 * 
 * 办公用品申购信息表(实体类).
 * 
 * @author：xuc.
 * 
 * @date： 2018-01-15
 */
public class GooPurchase extends Entity<GooPurchase> {

    private static final long serialVersionUID = 1L;

    /**
     * 标题（申购单标题）
     */
    private String title;
    /**
     * 流程名称
     */
    private String processName;
    /**
     * 操作人
     */
    private String publishName;
    private String gooName;
    /**
     * 物品ID （办公用品表ID）
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long gooId;
    /**
     * 描述
     */
    private String content;
    /**
     * 审核状态（1:审核中 2：审核失败 3：审核通过）
     */
    private Integer auditStatus;
    /**
     * 审核时间
     */
    private Date auditTime;
    /**
     * 流程ID
     */
    private String processId;
    /**
     * 申购物品数量
     */
    private Integer number;
    /**
     * 单证编号编号
     */
    private String listCode;
    /**
     * 单证日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date submitTime;
    /**
     * 物品分类ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long categoryId;
    /**
     * 物品分类名称
     */
    private String categoryName;
    /**
     * 单位
     */
    private String unit;
    /**
     * 申购流程实例ID
     */
    private String gooPurchaseProcInstId;

    /**
     * 部门
     */
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getGooPurchaseProcInstId() {
        return gooPurchaseProcInstId;
    }

    public void setGooPurchaseProcInstId(String gooPurchaseProcInstId) {
        this.gooPurchaseProcInstId = gooPurchaseProcInstId;
    }

    public String getTitle() {
        return title;
    }

    public GooPurchase setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getProcessName() {
        return processName;
    }

    public GooPurchase setProcessName(String processName) {
        this.processName = processName;
        return this;
    }

    public String getPublishName() {
        return publishName;
    }

    public GooPurchase setPublishName(String publishName) {
        this.publishName = publishName;
        return this;
    }

    public String getGooName() {
        return gooName;
    }

    public GooPurchase setGooName(String gooName) {
        this.gooName = gooName;
        return this;
    }

    public Long getGooId() {
        return gooId;
    }

    public GooPurchase setGooId(Long gooId) {
        this.gooId = gooId;
        return this;
    }

    public String getContent() {
        return content;
    }

    public GooPurchase setContent(String content) {
        this.content = content;
        return this;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public GooPurchase setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public GooPurchase setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
        return this;
    }

    public String getProcessId() {
        return processId;
    }

    public GooPurchase setProcessId(String processId) {
        this.processId = processId;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public GooPurchase setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public String getListCode() {
        return listCode;
    }

    public void setListCode(String listCode) {
        this.listCode = listCode;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public GooPurchase setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public GooPurchase setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public GooPurchase setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public GooPurchase setUnit(String unit) {
        this.unit = unit;
        return this;
    }

}
