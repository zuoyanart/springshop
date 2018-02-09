package com.company.project.service.impl;

import com.company.project.dao.NodeMapper;
import com.company.project.model.Node;
import com.company.project.service.NodeService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import com.github.promeg;

/**
 * Created by CodeGenerator on 2018/02/09.
 */
@Service
@Transactional
public class NodeServiceImpl extends AbstractService<Node> implements NodeService {
    @Resource
    private NodeMapper pzNodeMapper;

    @Override
    public void save(Node model) {
        super.save(model);
        Integer id = model.getId();
        Node parent = super.findById(model.getPid());
        Node newModel = new Node();
        newModel.setId(id);
        newModel.setNodepath(parent.getNodepath() + id.toString());
        if (model.getLink() == "") {
            newModel.setLink("-" + id.toString() + "node");
        }
        super.update(newModel);
    }
}
