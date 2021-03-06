/**
 * <copyright>
 * </copyright>
 *
 */
package fr.obeo.releng.targetplatform;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.obeo.releng.targetplatform.TargetplatformFactory
 * @model kind="package"
 * @generated
 */
public interface TargetplatformPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "targetplatform";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.obeo.fr/releng/TargetPlatform";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "targetplatform";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TargetplatformPackage eINSTANCE = fr.obeo.releng.targetplatform.impl.TargetplatformPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.obeo.releng.targetplatform.impl.TargetPlatformImpl <em>Target Platform</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.releng.targetplatform.impl.TargetPlatformImpl
   * @see fr.obeo.releng.targetplatform.impl.TargetplatformPackageImpl#getTargetPlatform()
   * @generated
   */
  int TARGET_PLATFORM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_PLATFORM__NAME = 0;

  /**
   * The feature id for the '<em><b>Locations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_PLATFORM__LOCATIONS = 1;

  /**
   * The number of structural features of the '<em>Target Platform</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_PLATFORM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.obeo.releng.targetplatform.impl.LocationImpl <em>Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.releng.targetplatform.impl.LocationImpl
   * @see fr.obeo.releng.targetplatform.impl.TargetplatformPackageImpl#getLocation()
   * @generated
   */
  int LOCATION = 1;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION__URI = 0;

  /**
   * The feature id for the '<em><b>Options</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION__OPTIONS = 1;

  /**
   * The feature id for the '<em><b>Ius</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION__IUS = 2;

  /**
   * The number of structural features of the '<em>Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.obeo.releng.targetplatform.impl.IUImpl <em>IU</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.releng.targetplatform.impl.IUImpl
   * @see fr.obeo.releng.targetplatform.impl.TargetplatformPackageImpl#getIU()
   * @generated
   */
  int IU = 2;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IU__ID = 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IU__VERSION = 1;

  /**
   * The number of structural features of the '<em>IU</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IU_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.obeo.releng.targetplatform.Option <em>Option</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.releng.targetplatform.Option
   * @see fr.obeo.releng.targetplatform.impl.TargetplatformPackageImpl#getOption()
   * @generated
   */
  int OPTION = 3;


  /**
   * Returns the meta object for class '{@link fr.obeo.releng.targetplatform.TargetPlatform <em>Target Platform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target Platform</em>'.
   * @see fr.obeo.releng.targetplatform.TargetPlatform
   * @generated
   */
  EClass getTargetPlatform();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.releng.targetplatform.TargetPlatform#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.obeo.releng.targetplatform.TargetPlatform#getName()
   * @see #getTargetPlatform()
   * @generated
   */
  EAttribute getTargetPlatform_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.releng.targetplatform.TargetPlatform#getLocations <em>Locations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Locations</em>'.
   * @see fr.obeo.releng.targetplatform.TargetPlatform#getLocations()
   * @see #getTargetPlatform()
   * @generated
   */
  EReference getTargetPlatform_Locations();

  /**
   * Returns the meta object for class '{@link fr.obeo.releng.targetplatform.Location <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location</em>'.
   * @see fr.obeo.releng.targetplatform.Location
   * @generated
   */
  EClass getLocation();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.releng.targetplatform.Location#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see fr.obeo.releng.targetplatform.Location#getUri()
   * @see #getLocation()
   * @generated
   */
  EAttribute getLocation_Uri();

  /**
   * Returns the meta object for the attribute list '{@link fr.obeo.releng.targetplatform.Location#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Options</em>'.
   * @see fr.obeo.releng.targetplatform.Location#getOptions()
   * @see #getLocation()
   * @generated
   */
  EAttribute getLocation_Options();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.releng.targetplatform.Location#getIus <em>Ius</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ius</em>'.
   * @see fr.obeo.releng.targetplatform.Location#getIus()
   * @see #getLocation()
   * @generated
   */
  EReference getLocation_Ius();

  /**
   * Returns the meta object for class '{@link fr.obeo.releng.targetplatform.IU <em>IU</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IU</em>'.
   * @see fr.obeo.releng.targetplatform.IU
   * @generated
   */
  EClass getIU();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.releng.targetplatform.IU#getID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ID</em>'.
   * @see fr.obeo.releng.targetplatform.IU#getID()
   * @see #getIU()
   * @generated
   */
  EAttribute getIU_ID();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.releng.targetplatform.IU#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see fr.obeo.releng.targetplatform.IU#getVersion()
   * @see #getIU()
   * @generated
   */
  EAttribute getIU_Version();

  /**
   * Returns the meta object for enum '{@link fr.obeo.releng.targetplatform.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Option</em>'.
   * @see fr.obeo.releng.targetplatform.Option
   * @generated
   */
  EEnum getOption();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TargetplatformFactory getTargetplatformFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.obeo.releng.targetplatform.impl.TargetPlatformImpl <em>Target Platform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.releng.targetplatform.impl.TargetPlatformImpl
     * @see fr.obeo.releng.targetplatform.impl.TargetplatformPackageImpl#getTargetPlatform()
     * @generated
     */
    EClass TARGET_PLATFORM = eINSTANCE.getTargetPlatform();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET_PLATFORM__NAME = eINSTANCE.getTargetPlatform_Name();

    /**
     * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET_PLATFORM__LOCATIONS = eINSTANCE.getTargetPlatform_Locations();

    /**
     * The meta object literal for the '{@link fr.obeo.releng.targetplatform.impl.LocationImpl <em>Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.releng.targetplatform.impl.LocationImpl
     * @see fr.obeo.releng.targetplatform.impl.TargetplatformPackageImpl#getLocation()
     * @generated
     */
    EClass LOCATION = eINSTANCE.getLocation();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION__URI = eINSTANCE.getLocation_Uri();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION__OPTIONS = eINSTANCE.getLocation_Options();

    /**
     * The meta object literal for the '<em><b>Ius</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCATION__IUS = eINSTANCE.getLocation_Ius();

    /**
     * The meta object literal for the '{@link fr.obeo.releng.targetplatform.impl.IUImpl <em>IU</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.releng.targetplatform.impl.IUImpl
     * @see fr.obeo.releng.targetplatform.impl.TargetplatformPackageImpl#getIU()
     * @generated
     */
    EClass IU = eINSTANCE.getIU();

    /**
     * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IU__ID = eINSTANCE.getIU_ID();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IU__VERSION = eINSTANCE.getIU_Version();

    /**
     * The meta object literal for the '{@link fr.obeo.releng.targetplatform.Option <em>Option</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.releng.targetplatform.Option
     * @see fr.obeo.releng.targetplatform.impl.TargetplatformPackageImpl#getOption()
     * @generated
     */
    EEnum OPTION = eINSTANCE.getOption();

  }

} //TargetplatformPackage
