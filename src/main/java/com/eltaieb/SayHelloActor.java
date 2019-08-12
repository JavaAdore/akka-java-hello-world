package com.eltaieb;

import akka.actor.AbstractActor;
import akka.actor.Props;

public class SayHelloActor extends AbstractActor {

	static class Hello {

		public Hello(String name) {
			super();
			this.name = name;
		}

		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	@Override
	public Receive createReceive() {

		return receiveBuilder().match(Hello.class, (hello) -> {

			System.out.println(String.format("welcome ya %s", hello.name));
		}).build();

	}

	public static Props getProps() {
		return Props.create(SayHelloActor.class);
	}

}
