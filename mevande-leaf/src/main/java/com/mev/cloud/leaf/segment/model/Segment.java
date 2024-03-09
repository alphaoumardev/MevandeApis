package com.mev.cloud.leaf.segment.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author left
 */
@Getter
@Setter
@ToString
public class Segment {

	private AtomicLong value = new AtomicLong(0);

	private volatile long max;

	private volatile int step;

	private volatile int randomStep;

	private final SegmentBuffer buffer;

	public Segment(SegmentBuffer buffer) {
		this.buffer = buffer;
	}

	public long getIdle() {
		return this.getMax() - getValue().get();
	}


}
