package com.company.project.service.impl;

import com.company.project.dao.NodeMapper;
import com.company.project.model.Node;
import com.company.project.service.NodeService;
import com.company.project.core.AbstractService;
import com.github.stuxuhai.jpinyin.PinyinFormat;
import com.github.stuxuhai.jpinyin.PinyinHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

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
        if (model.getLink() == "" || model.getLink() == null) {
            String namePy = "";
            try {
                namePy = PinyinHelper.convertToPinyinString(model.getName(), "", PinyinFormat.WITHOUT_TONE);
            } catch (Exception e){
                namePy = "";
            }
            newModel.setLink( "/" + namePy + "-" + id.toString() + "node");
        }
        super.update(newModel);
    }

    /**
     * 更新隐藏状态
     * @param id
     * @param ishide
     */
    public void changeHide(Integer id, Integer ishide) {
        Node node = new Node();
        node.setIshide(ishide);
        node.setId(id);
        super.update(node);
    }
}
