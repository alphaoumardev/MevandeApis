package com.mev.cloud.leaf.segment.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 双buffer
 *
 * @author left
 */
@Getter
@Setter
@ToString
public class SegmentBuffer
{
	private String key;

	/**
	 * 双buffer
	 */
	@Getter
	private final Segment[] segments;

	/**
	 * 当前的使用的segment的index
	 */
	private volatile int currentPos;

	/**
	 * 下一个segment是否处于可切换状态
	 */
	@Setter
	@Getter
	private volatile boolean nextReady;

	/**
	 * 是否初始化完成
	 */
	@Setter
	private volatile boolean initOk;

	/**
	 * 线程是否在运行中
	 */
	@Getter
	private AtomicBoolean threadRunning;

	private final ReadWriteLock lock;

	@Setter
	@Getter
	private volatile int step;

	@Setter
	@Getter
	private volatile int minStep;

	@Getter
	@Setter
	private volatile long updateTimestamp;

	public SegmentBuffer() {
		segments = new Segment[] { new Segment(this), new Segment(this) };
		currentPos = 0;
		nextReady = false;
		initOk = false;
		threadRunning = new AtomicBoolean(false);
		lock = new ReentrantReadWriteLock();
	}

	public Segment getCurrent() {
		return segments[currentPos];
	}

	public int nextPos() {
		return (currentPos + 1) % 2;
	}

	public void switchPos() {
		currentPos = nextPos();
	}

	public boolean isInitOk() {
		return !initOk;
	}

	public Lock rLock() {
		return lock.readLock();
	}

	public Lock wLock() {
		return lock.writeLock();
	}
}
