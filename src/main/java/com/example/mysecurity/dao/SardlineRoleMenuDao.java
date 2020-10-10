package com.example.mysecurity.dao;

import com.example.mysecurity.entity.SardlineRoleMenu;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SardlineRoleMenu)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-10 10:40:57
 */
public interface SardlineRoleMenuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SardlineRoleMenu queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SardlineRoleMenu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sardlineRoleMenu 实例对象
     * @return 对象列表
     */
    List<SardlineRoleMenu> queryAll(SardlineRoleMenu sardlineRoleMenu);

    /**
     * 新增数据
     *
     * @param sardlineRoleMenu 实例对象
     * @return 影响行数
     */
    int insert(SardlineRoleMenu sardlineRoleMenu);

    /**
     * 修改数据
     *
     * @param sardlineRoleMenu 实例对象
     * @return 影响行数
     */
    int update(SardlineRoleMenu sardlineRoleMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}