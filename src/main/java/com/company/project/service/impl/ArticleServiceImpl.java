package com.company.project.service.impl;

import com.company.project.dao.ArticleMapper;
import com.company.project.model.Article;
import com.company.project.model.Node;
import com.company.project.service.ArticleService;
import com.company.project.core.AbstractService;
import com.company.project.service.NodeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/02/16.
 */
@Service
@Transactional
public class ArticleServiceImpl extends AbstractService<Article> implements ArticleService {
    @Resource
    private ArticleMapper pzArticleMapper;

    @Resource
    private NodeService nodeService;

    @Override
    public void save(Article model) {
        if(model.getBrief() == "") {
            model.setBrief(model.getContent().substring(0,200));
        }
        super.save(model);
        Integer articleId = model.getId();

        Node node = nodeService.findById(articleId);
        Article upArticle = new Article();
        upArticle.setId(articleId);

        if(node.getArticleType() != "") {
            upArticle.setLink("/content_" + node.getArticleType() + "/" + articleId.toString());
        } else {
            upArticle.setLink("/content/" + articleId.toString());
        }
        super.update(upArticle);
    }

    /**
     * 获取列表
     * @param queryMap
     * @return
     */
    public List<Article> page(Map<String, Object> queryMap) {
        return pzArticleMapper.page(queryMap);
    }
}
