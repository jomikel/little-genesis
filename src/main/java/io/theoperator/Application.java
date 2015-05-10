package io.theoperator;

import com.google.gson.Gson;
import com.pi4j.io.gpio.*;
import io.theoperator.configuration.Configuration;

import java.io.*;

/**
 * Created by andreas on 5/8/15.
 */
public class Application {

    public static void main(String args[]) {

        Application app = new Application();

    }

    public Application() {
        // read json file and make object
        Gson gson = new Gson();
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            BufferedReader reader = new BufferedReader(new InputStreamReader(classLoader.getResourceAsStream("settings.json")));
            Configuration c = gson.fromJson(reader, Configuration.class);

            System.out.println("LED on");
            GpioController gpio = GpioFactory.getInstance();
            GpioPinDigitalOutput myLed = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, "LED", PinState.HIGH);

            // make a date object of each water setpoint
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
