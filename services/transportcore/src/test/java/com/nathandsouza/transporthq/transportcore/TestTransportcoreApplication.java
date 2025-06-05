package com.nathandsouza.transporthq.transportcore;

import org.springframework.boot.SpringApplication;

public class TestTransportcoreApplication {

	public static void main(String[] args) {
		SpringApplication.from(TransportcoreApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
