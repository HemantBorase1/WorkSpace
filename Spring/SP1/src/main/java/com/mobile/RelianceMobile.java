package com.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sim.AirtelSim;
import com.sim.RelianceSim;
import com.sim.sim;

public class RelianceMobile {


	private ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	private sim r=context.getBean(sim.class);
	
	private void startMobile() {
		System.out.println("Welcome to Reliance Mobile");
	}
	public RelianceMobile() {
		startMobile();
		
		r.startSim();
	}
}
