package com.mev.cloud.leaf.segment.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 */
@Setter
@Getter
public class LeafAlloc {

	private String key;

	private long maxId;

	private int step;

	private String updateTime;

	private int randomStep;

}
