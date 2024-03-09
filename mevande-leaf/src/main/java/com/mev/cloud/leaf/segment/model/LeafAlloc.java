package com.mev.cloud.leaf.segment.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Alphaoumardev
 */
@Setter
@Getter
@ToString
public class LeafAlloc {

	private String key;

	private long maxId;

	private int step;

	private String updateTime;

	private int randomStep;

}
