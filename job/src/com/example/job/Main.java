package com.example.job;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) throws Exception {
		List<Job> jobs = new ArrayList<>();
		jobs.add(new Job("a", null));
		jobs.add(new Job("b", "c"));
		jobs.add(new Job("c", "f"));
		jobs.add(new Job("d", "a"));
		jobs.add(new Job("e", "b"));
		jobs.add(new Job("f", null));

		OrderJobs orderJobs = new OrderJobs(jobs);
		System.out.println(orderJobs.execute());
	}
}
