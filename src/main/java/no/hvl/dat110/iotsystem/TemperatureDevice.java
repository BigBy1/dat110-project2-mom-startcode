package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;
import no.hvl.dat110.messages.PublishMsg;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		// TODO - start

		// create a client object and use it to

		// - connect to the broker - user "sensor" as the user name
		// - publish the temperature(s)
		// - disconnect from the broker

		// created object
		Client client = new Client("sensor", Common.BROKERHOST, Common.BROKERPORT);
		client.connect(); // connect

		for(int i = 0; i < COUNT; i++) { // replicating real sensor
			client.publish(Common.TEMPTOPIC, sn.read()+"");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		client.disconnect();

		// TODO - end

		System.out.println("Temperature device stopping ... ");


	}
}
