/**
 * generated by Xtext 2.20.0
 */
package kcl.ac.uk.jian.building.building;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Whole Structure</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see kcl.ac.uk.jian.building.building.BuildingPackage#getWholeStructure()
 * @model
 * @generated
 */
public enum WholeStructure implements Enumerator
{
  /**
   * The '<em><b>Aboveground</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABOVEGROUND_VALUE
   * @generated
   * @ordered
   */
  ABOVEGROUND(0, "aboveground", "aboveground"),

  /**
   * The '<em><b>Underground</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNDERGROUND_VALUE
   * @generated
   * @ordered
   */
  UNDERGROUND(1, "underground", "underground");

  /**
   * The '<em><b>Aboveground</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABOVEGROUND
   * @model name="aboveground"
   * @generated
   * @ordered
   */
  public static final int ABOVEGROUND_VALUE = 0;

  /**
   * The '<em><b>Underground</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNDERGROUND
   * @model name="underground"
   * @generated
   * @ordered
   */
  public static final int UNDERGROUND_VALUE = 1;

  /**
   * An array of all the '<em><b>Whole Structure</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final WholeStructure[] VALUES_ARRAY =
    new WholeStructure[]
    {
      ABOVEGROUND,
      UNDERGROUND,
    };

  /**
   * A public read-only list of all the '<em><b>Whole Structure</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<WholeStructure> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Whole Structure</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static WholeStructure get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      WholeStructure result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Whole Structure</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static WholeStructure getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      WholeStructure result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Whole Structure</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static WholeStructure get(int value)
  {
    switch (value)
    {
      case ABOVEGROUND_VALUE: return ABOVEGROUND;
      case UNDERGROUND_VALUE: return UNDERGROUND;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private WholeStructure(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //WholeStructure
