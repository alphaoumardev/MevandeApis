package com.mev.cloud.product.service.impl;

import com.mev.cloud.product.mapper.SpuDetailMapper;
import com.mev.cloud.product.model.SpuDetail;
import com.mev.cloud.product.service.SpuDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品详情信息
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Service
public class SpuDetailServiceImpl implements SpuDetailService {

    @Autowired
    private SpuDetailMapper spuDetailMapper;

    @Override
    public void save(SpuDetail spuDetail) {
        spuDetailMapper.save(spuDetail);
    }

    @Override
    public void update(SpuDetail spuDetail) {
        spuDetailMapper.update(spuDetail);
    }

    @Override
    public void deleteById(Long spuId) {
        spuDetailMapper.deleteById(spuId);
    }
}
