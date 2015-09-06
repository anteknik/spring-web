package net.nadisa.anan.cron;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

public class ExecuteUsingAnnotation {
	//every 10 seconds min
	@Scheduled(cron="0/10 * * * * ?")
	public void run() {
		System.out.println("Execute using annotation in every 10 seconds " + new Date());
	}
}
