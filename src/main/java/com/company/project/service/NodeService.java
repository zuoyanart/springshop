package com.company.project.service;

import com.company.project.model.Node;
import com.company.project.core.Service;


/**
 * Created by CodeGenerator on 2018/02/09.
 */
public interface NodeService extends Service<Node> {

    /**
     * chnage hide state
     * @param id
     * @param ishide
     */
    public abstract void changeHide(Integer id, Integer ishide);

}
