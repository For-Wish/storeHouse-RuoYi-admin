package com.ruoyi.ShThumbs.mapper;

import java.util.List;
import com.ruoyi.ShThumbs.domain.ShThumbs;

/**
 * 点赞Mapper接口
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public interface ShThumbsMapper 
{
    /**
     * 查询点赞
     * 
     * @param thumbsId 点赞主键
     * @return 点赞
     */
    public ShThumbs selectShThumbsByThumbsId(Integer thumbsId);

    /**
     * 查询点赞列表
     * 
     * @param shThumbs 点赞
     * @return 点赞集合
     */
    public List<ShThumbs> selectShThumbsList(ShThumbs shThumbs);

    /**
     * 新增点赞
     * 
     * @param shThumbs 点赞
     * @return 结果
     */
    public int insertShThumbs(ShThumbs shThumbs);

    /**
     * 修改点赞
     * 
     * @param shThumbs 点赞
     * @return 结果
     */
    public int updateShThumbs(ShThumbs shThumbs);

    /**
     * 删除点赞
     * 
     * @param thumbsId 点赞主键
     * @return 结果
     */
    public int deleteShThumbsByThumbsId(Integer thumbsId);

    /**
     * 批量删除点赞
     * 
     * @param thumbsIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShThumbsByThumbsIds(Integer[] thumbsIds);
}
