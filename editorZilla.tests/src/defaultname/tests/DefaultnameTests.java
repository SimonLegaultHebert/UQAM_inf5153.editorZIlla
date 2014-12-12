/**
 */
package defaultname.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>defaultname</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefaultnameTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new DefaultnameTests("defaultname Tests");
		suite.addTestSuite(SectionCompositeTest.class);
		suite.addTestSuite(SectionTest.class);
		suite.addTestSuite(DocumentTest.class);
		suite.addTestSuite(DocumentBuilderTest.class);
		suite.addTestSuite(XMIStrategyTest.class);
		suite.addTestSuite(PressePapierTest.class);
		suite.addTestSuite(HTMLStrategyTest.class);
		suite.addTestSuite(MomentoTest.class);
		suite.addTestSuite(addSectionTest.class);
		suite.addTestSuite(RemoveSectionTest.class);
		suite.addTestSuite(CompositeCommandTest.class);
		suite.addTestSuite(CommandTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultnameTests(String name) {
		super(name);
	}

} //DefaultnameTests
