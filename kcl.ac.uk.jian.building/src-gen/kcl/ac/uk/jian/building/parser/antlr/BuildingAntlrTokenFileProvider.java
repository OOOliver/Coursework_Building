/*
 * generated by Xtext 2.20.0
 */
package kcl.ac.uk.jian.building.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BuildingAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("kcl/ac/uk/jian/building/parser/antlr/internal/InternalBuilding.tokens");
	}
}