package com.company.project.service.impl;

import com.company.project.dao.BlockMapper;
import com.company.project.model.Block;
import com.company.project.service.BlockService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/02/09.
 */
@Service
@Transactional
public class BlockServiceImpl extends AbstractService<Block> implements BlockService {
    @Resource
    private BlockMapper pzBlockMapper;

}
