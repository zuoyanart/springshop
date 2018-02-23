package com.company.project.service;
import com.company.project.model.Article;
import com.company.project.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/02/16.
 */
public interface ArticleService extends Service<Article> {
    /**
     *
     * @return
     */
    public abstract List<Article> page(Map<String, Object> queryMap);

}
