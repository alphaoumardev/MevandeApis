package com.mev.cloud.biz.service.impl;

import com.mev.cloud.biz.mapper.AttachFileMapper;
import com.mev.cloud.biz.model.AttachFileGroup;
import com.mev.cloud.biz.mapper.AttachFileGroupMapper;
import com.mev.cloud.biz.service.AttachFileGroupService;
import com.mev.cloud.biz.vo.AttachFileGroupVO;
import com.mev.cloud.common.security.AuthUserContext;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 *
 * @author Alphaoumardev
 * @date 2020-12-04 16:15:02
 */
@Service
public class AttachFileGroupServiceImpl implements AttachFileGroupService {

    @Autowired
    private AttachFileMapper attachFileMapper;
    @Autowired
    private AttachFileGroupMapper attachFileGroupMapper;

    @Override
    public List<AttachFileGroupVO> list() {
        return attachFileGroupMapper.list(AuthUserContext.get().getTenantId());
    }

    @Override
    public AttachFileGroupVO getByAttachFileGroupId(Long attachFileGroupId) {
        return attachFileGroupMapper.getByAttachFileGroupId(attachFileGroupId);
    }

    @Override
    public void save(AttachFileGroup attachFileGroup) {
        attachFileGroup.setShopId(AuthUserContext.get().getTenantId());
        attachFileGroupMapper.save(attachFileGroup);
    }

    @Override
    public void update(AttachFileGroup attachFileGroup) {
        attachFileGroupMapper.update(attachFileGroup);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteById(Long attachFileGroupId) {
        attachFileGroupMapper.deleteById(attachFileGroupId);
        attachFileMapper.updateBatchByAttachFileGroupId(attachFileGroupId);
    }
}
