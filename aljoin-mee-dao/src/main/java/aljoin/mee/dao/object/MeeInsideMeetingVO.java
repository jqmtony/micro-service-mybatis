package aljoin.mee.dao.object;

import aljoin.mee.dao.entity.MeeInsideMeeting;
import aljoin.res.dao.entity.ResResource;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 
 * 内部会议表(实体类).
 * 
 * @author：wangj.
 * 
 * @date： 2017-10-12
 */
public class MeeInsideMeetingVO extends MeeInsideMeeting {

    private static final long serialVersionUID = 1L;

    /**
     * 本周
     */
    @ApiModelProperty(hidden = true)
    private String thisWeek;

    /**
     * 本月
     */
    @ApiModelProperty(hidden = true)
    private String thisMonth;

    /**
     * 开始时间
     */
    @ApiModelProperty(hidden = true)
    private String startDate;

    /**
     * 结束时间
     */
    @ApiModelProperty(hidden = true)
    private String endDate;

    @ApiModelProperty(hidden = true)
    private List<ResResource> resResourceList;

    private String searchKey;

    @ApiModelProperty(hidden = true)
    private String ids;

    private Integer status;

    /**
     * 减少人员姓名
     */
    @ApiModelProperty(hidden = true)
    private String delMemberName;
    /**
     * 增加人员姓名
     */
    @ApiModelProperty(hidden = true)
    private String newMemberName;

    private String flag;

    public String getThisWeek() {
        return thisWeek;
    }

    public void setThisWeek(String thisWeek) {
        this.thisWeek = thisWeek;
    }

    public String getThisMonth() {
        return thisMonth;
    }

    public void setThisMonth(String thisMonth) {
        this.thisMonth = thisMonth;
    }

    public List<ResResource> getResResourceList() {
        return resResourceList;
    }

    public void setResResourceList(List<ResResource> resResourceList) {
        this.resResourceList = resResourceList;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getDelMemberName() {
        return delMemberName;
    }

    public void setDelMemberName(String delMemberName) {
        this.delMemberName = delMemberName;
    }

    public String getNewMemberName() {
        return newMemberName;
    }

    public void setNewMemberName(String newMemberName) {
        this.newMemberName = newMemberName;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}