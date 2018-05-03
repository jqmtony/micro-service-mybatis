package aljoin.mee.dao.object;

import aljoin.mee.dao.entity.MeeInsideMeeting;
import aljoin.mee.dao.entity.MeeMeetingRoom;
import aljoin.mee.dao.entity.MeeOutsideMeeting;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.util.List;
import java.util.Map;

/**
 * 
 * 会议室表(实体类).
 * 
 * @author：wangj.
 * 
 * @date： 2017-10-12
 */
public class MeeMeetingRoomCountDO {

    @SuppressWarnings("unused")
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 主键ID
     */
    private Long meetingRoomId;

    /**
     * 使用次数
     */
    private Integer useCount;
    /**
     * 会议室名称
     */
    private String meetingRoomName;

    private List<Map<Object, Object>> mapList;

    private List<MeeMeetingRoom> roomList;

    private List<MeeInsideMeeting> meeInsideMeetingList;

    private List<MeeOutsideMeeting> meeOutsideMeetingList;

    private List<String> theadList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public String getMeetingRoomName() {
        return meetingRoomName;
    }

    public void setMeetingRoomName(String meetingRoomName) {
        this.meetingRoomName = meetingRoomName;
    }

    public Long getMeetingRoomId() {
        return meetingRoomId;
    }

    public void setMeetingRoomId(Long meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }

    public List<Map<Object, Object>> getMapList() {
        return mapList;
    }

    public void setMapList(List<Map<Object, Object>> mapList) {
        this.mapList = mapList;
    }

    public List<MeeMeetingRoom> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<MeeMeetingRoom> roomList) {
        this.roomList = roomList;
    }

    public List<MeeInsideMeeting> getMeeInsideMeetingList() {
        return meeInsideMeetingList;
    }

    public void setMeeInsideMeetingList(List<MeeInsideMeeting> meeInsideMeetingList) {
        this.meeInsideMeetingList = meeInsideMeetingList;
    }

    public List<MeeOutsideMeeting> getMeeOutsideMeetingList() {
        return meeOutsideMeetingList;
    }

    public void setMeeOutsideMeetingList(List<MeeOutsideMeeting> meeOutsideMeetingList) {
        this.meeOutsideMeetingList = meeOutsideMeetingList;
    }

    public List<String> getTheadList() {
        return theadList;
    }

    public void setTheadList(List<String> theadList) {
        this.theadList = theadList;
    }
}