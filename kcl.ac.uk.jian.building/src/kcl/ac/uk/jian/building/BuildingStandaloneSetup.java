/*
 * generated by Xtext 2.20.0
 */
package kcl.ac.uk.jian.building;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class BuildingStandaloneSetup extends BuildingStandaloneSetupGenerated {

	public static void doSetup() {
		new BuildingStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
