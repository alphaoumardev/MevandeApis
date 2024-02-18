package com.mev.cloud.product.service;

import com.mev.cloud.api.product.vo.AttrVO;
import com.mev.cloud.product.model.Attr;
import com.mev.cloud.product.model.AttrValue;

import java.util.List;

/**
 * 属性值信息
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
public interface AttrValueService {
	/**
	 * 根据属性值信息和属性id，保存属性值信息
	 * @param attrValues
	 * @param attrId
	 */
    void saveByAttrValuesAndAttrId(List<AttrValue> attrValues, Long attrId);

	/**
	 * 根据属性值信息和属性id，更新属性值信息
	 * @param attrVO
	 * @param dbAttr
	 */
	void update(Attr attrVO, AttrVO dbAttr);
}
