package com.mev.cloud.product.service.impl;

import com.mev.cloud.common.database.dto.PageDTO;
import com.mev.cloud.common.database.util.PageUtil;
import com.mev.cloud.common.database.vo.PageVO;
import com.mev.cloud.product.mapper.SpuExtensionMapper;
import com.mev.cloud.product.model.SpuExtension;
import com.mev.cloud.product.service.SpuExtensionService;
import com.mev.cloud.product.vo.SpuExtensionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 *
 * @author Alphaoumardev
 * @date 2020-11-11 13:49:06
 */
@Service
public class SpuExtensionServiceImpl implements SpuExtensionService {

    @Autowired
    private SpuExtensionMapper spuExtensionMapper;

    @Override
    public PageVO<SpuExtensionVO> page(PageDTO pageDTO) {
        return PageUtil.doPage(pageDTO, () -> spuExtensionMapper.list());
    }

    @Override
    public SpuExtensionVO getBySpuExtendId(Long spuExtendId) {
        return spuExtensionMapper.getBySpuExtendId(spuExtendId);
    }

    @Override
    public void save(SpuExtension spuExtension) {
        spuExtensionMapper.save(spuExtension);
    }

    @Override
    public void updateStock(Long spuId, Integer count) {
        spuExtensionMapper.updateStock(spuId,count);
    }

    @Override
    public void deleteById(Long spuId) {
        spuExtensionMapper.deleteById(spuId);
    }

    @Override
    public SpuExtension getBySpuId(Long spuId) {
        return spuExtensionMapper.getBySpuId(spuId);
    }
}
