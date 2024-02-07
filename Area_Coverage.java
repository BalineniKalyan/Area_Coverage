package dcs_project;
import java.lang.Math;
import java.util.*;

public class Areacoverage {
	
	
	    // Constants
	    private static final double PI = Math.PI;
	    private static final double LIGHT_SPEED = 299792458; // Speed of light in m/s
	    // Parameters
	    private double antennaHeight; // Antenna height in meters
	    private double antennaGain; // Antenna gain in dB
	    private double transmitterPower; // Transmitter power in watts
	    private double receiverSensitivity; // Receiver sensitivity in dBm
	    private double frequency; // Frequency in Hz
	    
	    public Areacoverage(double antennaHeight, double antennaGain, double transmitterPower,
	            double receiverSensitivity, double frequency) {
	           this.antennaHeight = antennaHeight;
	           this.antennaGain = antennaGain;
	           this.transmitterPower = transmitterPower;
	           this.receiverSensitivity = receiverSensitivity;
	           this.frequency = frequency;
	}
	          // Method to calculate the area coverage
	       public double calculateAreaCoverage() {
	// Convert receiver sensitivity from dBm to watts
	                    double receiverSensitivityWatts = Math.pow(10, (receiverSensitivity / 10 - 3));
	//Calculate the free space path loss
	                    double wavelength = LIGHT_SPEED / frequency;
	                    double freeSpacePathLoss = (4 * PI * antennaHeight * antennaHeight * frequency * frequency) / (LIGHT_SPEED * LIGHT_SPEED);
	// Calculate the received power
	                    double receivedPower = transmitterPower + antennaGain - freeSpacePathLoss;
	// Calculate the coverage radius
	                    double coverageRadius = Math.sqrt((receiverSensitivityWatts * wavelength * wavelength) / (16 * PI * receivedPower));
	// Calculate the coverage area
	                    double coverageArea = PI * coverageRadius * coverageRadius;
	                    return coverageArea;
	}
	    
	    
	    //"sample 1"
	   
//	    public static void main(String[] args) {
//	        double antennaHeight = 50.0; // meters
//	        double antennaGain = 10.0; // dB
//	        double transmitterPower = 100.0; // watts
//	        double receiverSensitivity = -100.0; // dBm
//	        double frequency = 900000000.0; // 900 MHz
//	        Areacoverage calculator = new Areacoverage(antennaHeight, antennaGain,transmitterPower, receiverSensitivity, frequency);
//	        // Calculate the area coverage
//	        double coverageArea = calculator.calculateAreaCoverage();
//	        // Display the result
//	        System.out.println("Coverage Area: " + "" + " square meters");
//	    }
//
//	       //"sample 2"
//	       
//	       public static void main(String[] args) {
//	           double antennaHeight = 50.0; // meters
//	           double antennaGain = 10.0; // dB
//	           double transmitterPower = 1007.0; // watts
//	           double receiverSensitivity = -1.0; // dBm
//	           double frequency = 900000000.0; // 900 MHz
//	           Areacoverage calculator = new Areacoverage(antennaHeight, antennaGain,transmitterPower, receiverSensitivity, frequency);
//	           // Calculate the area coverage
//	           double coverageArea = calculator.calculateAreaCoverage();
//	           // Display the result
//	           System.out.println("Coverage Area: " + "" + " square meters");
//	       }
//	        
//	       //"sample3"
//	       public static void main(String[] args) {
//	           double antennaHeight = 50.0; // meters
//	           double antennaGain = 10.0; // dB
//	           double transmitterPower = 1007.0; // watts
//	           double receiverSensitivity = -1.0; // dBm
//	           double frequency = 900000000.0; // 900 MHz
//	           Areacoverage calculator = new Areacoverage(antennaHeight, antennaGain,transmitterPower, receiverSensitivity, frequency);
//	           // Calculate the area coverage
//	           double coverageArea = calculator.calculateAreaCoverage();
//	           // Display the result
//	           System.out.println("Coverage Area: " + "" + " square meters");
//	       }
//	       
//	       
//	       
////	       "sample4"
//	       public static void main(String[] args) {
//	           double antennaHeight = 50.0; // meters
//	           double antennaGain = 10.0; // dB
//	           double transmitterPower = 1007.0; // watts
//	           double receiverSensitivity = -1.0; // dBm
//	           double frequency = 900.0; // 900 Hz
//	           Areacoverage calculator = new Areacoverage(antennaHeight, antennaGain,transmitterPower, receiverSensitivity, frequency);
//	           // Calculate the area coverage
//	           double coverageArea = calculator.calculateAreaCoverage();
//	           // Display the result
//	           System.out.println("Coverage Area: " + coverageArea + " square meters");
//	       }
	       
	       //"sample5"
	       
	       
	       public static void main(String[] args) {
	     double antennaHeight = 50.0; // meters
	     double antennaGain = 10.0; // dB
	     double transmitterPower = 1007.0; // watts
	     double receiverSensitivity = -1.0; // dBm
	     double frequency = 900.0; // 900 Hz
	     Areacoverage calculator = new Areacoverage(antennaHeight, antennaGain,transmitterPower, receiverSensitivity, frequency);
	     // Calculate the area coverage
	     double coverageArea = calculator.calculateAreaCoverage();
	     // Display the result
	     System.out.println("Coverage Area: " + coverageArea + " square meters");
	 }
	       
	}