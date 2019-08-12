package com.eltaieb;

import java.util.Scanner;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;

public class Home {

	
	public static void main(String[] args) {
		
		
		ActorSystem actorSystem = ActorSystem.create("MyAwesomeSystem");
		
		ActorRef ref = actorSystem.actorOf(SayHelloActor.getProps());
		
		ref.tell(new SayHelloActor.Hello("Mahmoud Eltaieb"), ActorRef.noSender());
		
		Scanner scanner = new Scanner(System.in);
		scanner.next();
	}
}
