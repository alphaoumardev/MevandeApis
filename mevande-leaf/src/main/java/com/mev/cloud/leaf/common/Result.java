package com.mev.cloud.leaf.common;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 */

@Setter
@Getter
public class Result
{
	private long id;
	private Status status;

	public Result()
	{

	}

	public Result(long id, Status status)
	{
		this.id = id;
		this.status = status;
	}

	@Override
	public String toString()
	{
		return "Result{" + "id=" + id +
				", status=" + status +
				'}';
	}

}
