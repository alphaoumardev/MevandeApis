package com.mev.cloud.leaf;

import com.mev.cloud.leaf.common.Result;

/**
 * @author Alphaoumardev
 */
public interface IDGen {

	/**
	 * get
	 * @param key key
	 * @return Result
	 */
	Result get(String key);

	/**
	 * init
	 * @return inited
	 */
	boolean init();

}
