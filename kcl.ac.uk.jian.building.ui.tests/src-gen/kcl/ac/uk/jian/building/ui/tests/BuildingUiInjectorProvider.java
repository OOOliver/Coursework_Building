/*
 * generated by Xtext 2.20.0
 */
package kcl.ac.uk.jian.building.ui.tests;

import com.google.inject.Injector;
import kcl.ac.uk.jian.building.ui.internal.BuildingActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class BuildingUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return BuildingActivator.getInstance().getInjector("kcl.ac.uk.jian.building.Building");
	}

}
