package aljoin.act.dao.mapper;

import aljoin.act.dao.entity.ActAljoinFormAttributeRun;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * 
 * 表单控属性件表(运行时)(Mapper接口).
 * 
 * @author：zhongjy.
 * 
 * @date： 2017-09-27
 */
public interface ActAljoinFormAttributeRunMapper extends BaseMapper<ActAljoinFormAttributeRun> {
    /**
     * 
     * 根据ID删除对象(物理删除)
     *
     * @return：void
     *
     * @author：zhongjy
     *
     * @date：2017-09-27
     * 
     * @param id
     * 
     * @throws Exception
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
     * @date：2017-09-27
     * 
     * @param obj
     * 
     * @throws Exception
     */
    public void copyObject(ActAljoinFormAttributeRun obj) throws Exception;
}