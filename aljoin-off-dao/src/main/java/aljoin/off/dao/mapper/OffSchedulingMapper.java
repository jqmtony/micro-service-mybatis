package aljoin.off.dao.mapper;

import aljoin.off.dao.entity.OffScheduling;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * 
 * 日程安排表(Mapper接口).
 * 
 * @author：zhongjy.
 * 
 * @date： 2017-11-01
 */
public interface OffSchedulingMapper extends BaseMapper<OffScheduling> {
    /**
     * 
     * 根据ID删除对象(物理删除)
     *
     * @return：void
     *
     * @author：zhongjy
     *
     * @date：2017-11-01
     */
    public void physicsDeleteById(Long id) throws Exception;

    /**
     * 
     * 复制对象(需要完整的对象数据，包括所有的公共字段)
     *
     * @return：void
     *
     * @author：zhongjy
     *
     * @date：2017-11-01
     */
    public void copyObject(OffScheduling obj) throws Exception;
}