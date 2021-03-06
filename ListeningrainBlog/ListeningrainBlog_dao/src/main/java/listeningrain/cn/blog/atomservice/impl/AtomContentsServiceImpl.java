package listeningrain.cn.blog.atomservice.impl;

import listeningrain.cn.blog.atomservice.AtomContensService;
import listeningrain.cn.blog.dao.ContentsMapper;
import listeningrain.cn.blog.entity.Contents;
import listeningrain.cn.blog.entity.ContentsExample;
import listeningrain.cn.blog.output.data.AdminIndexOutputData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * author: listeningrain
 * Date: 2018/9/24
 * Time: 9:47
 * Description:
 */
@Service("atomContentsService")
public class AtomContentsServiceImpl implements AtomContensService {

    @Autowired
    private ContentsMapper contentsMapper;

    /**
     * 分页查询
     * @return
     */
    public List<Contents> getContentsByPage(Contents content){
       ContentsExample contentsExample = new ContentsExample();
       contentsExample.setOrderByClause("created DESC");
       if(null != content.getStatus()){
           contentsExample.createCriteria().andStatusEqualTo(content.getStatus());
       }
        List<Contents> contents = contentsMapper.selectByExampleWithBLOBs(contentsExample);
        return contents;
    }


    @Override
    public Contents getContentsById(Integer id) {
        Contents contents = contentsMapper.selectByPrimaryKey(id);
        return contents;
    }

    @Override
    @Transactional
    public Integer insertContent(Contents contents) {
        int i = contentsMapper.insertSelective(contents);
        return i;
    }

    @Override
    @Transactional
    public Integer deleteContent(Contents contents) {
        int i = contentsMapper.deleteByPrimaryKey(contents.getCid());
        return i;
    }

    @Override
    @Transactional
    public Integer updateContent(Contents contents) {
        int i = contentsMapper.updateByPrimaryKeySelective(contents);
        return i;
    }

    @Override
    public Integer updateCommentAddCountById(Integer cid) {
        int i = contentsMapper.updateCommentNumAddById(cid);
        return i;
    }

    @Override
    public Integer updateCommentDecrCountById(Integer cid) {
        int i = contentsMapper.updateCommentNumDecrById(cid);
        return i;
    }

    @Override
    public Integer updateContentsHitsById(Integer cid) {
        int i = contentsMapper.updateContentsHitsById(cid);
        return i;
    }

    @Override
    public AdminIndexOutputData selectContentCount() {
        int todayCount = contentsMapper.selectTodayContentCount();
        int totalCount = contentsMapper.selectContentCount();
        AdminIndexOutputData adminIndexOutputData = new AdminIndexOutputData();
        adminIndexOutputData.setTotalCount(totalCount);
        adminIndexOutputData.setTodayCount(todayCount);
        return adminIndexOutputData;
    }
}
