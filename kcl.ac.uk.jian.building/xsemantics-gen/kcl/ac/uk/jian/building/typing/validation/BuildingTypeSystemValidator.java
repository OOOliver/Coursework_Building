package kcl.ac.uk.jian.building.typing.validation;

import com.google.inject.Inject;
import kcl.ac.uk.jian.building.typing.BuildingTypeSystem;
import kcl.ac.uk.jian.building.validation.AbstractBuildingValidator;
import org.eclipse.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;

@SuppressWarnings("all")
public class BuildingTypeSystemValidator extends AbstractBuildingValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected BuildingTypeSystem xsemanticsSystem;
  
  protected BuildingTypeSystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
}
