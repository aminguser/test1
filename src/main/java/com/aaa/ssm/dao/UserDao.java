package com.aaa.ssm.dao;

import java.util.List;
import java.util.Map;

/**
 *fileName:UserDao
 *description:
 *author:Smy
 *createTime:2019/3/3 0003 10:55
 */
public interface UserDao {

    /**
     *获取人员列表
     * @return
     */
    List<Map> getUserList();
    /**
     * 获取分页所需的数据
     */
    List<Map> getUserPage(Map map);

    /**
     * 获取总数据
     * @param map
     * @return
     */
    int  getUserPageCount(Map map);
}
