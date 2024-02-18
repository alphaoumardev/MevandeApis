package com.mev.cloud.biz.service;

import com.mev.cloud.biz.model.AttachFileGroup;
import com.mev.cloud.biz.vo.AttachFileGroupVO;

import java.util.List;

/**
 *
 *
 * @author YXF
 * @date 2020-12-04 16:15:02
 */
public interface AttachFileGroupService {

	/**
	 * 获取列表
	 * @return 列表数据
	 */
	List<AttachFileGroupVO> list();

	/**
	 * 根据id获取
	 *
	 * @param attachFileGroupId id
	 * @return
	 */
	AttachFileGroupVO getByAttachFileGroupId(Long attachFileGroupId);

	/**
	 * 保存
	 * @param attachFileGroup
	 */
	void save(AttachFileGroup attachFileGroup);

	/**
	 * 更新
	 * @param attachFileGroup
	 */
	void update(AttachFileGroup attachFileGroup);

	/**
	 * 根据id删除
	 * @param attachFileGroupId
	 */
	void deleteById(Long attachFileGroupId);
}
