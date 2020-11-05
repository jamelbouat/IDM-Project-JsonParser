/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.idmproject.jsonParser.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.idmproject.jsonParser.Compute;
import org.xtext.example.idmproject.jsonParser.Insert;
import org.xtext.example.idmproject.jsonParser.Instruction;
import org.xtext.example.idmproject.jsonParser.JsonParserPackage;
import org.xtext.example.idmproject.jsonParser.Modify;
import org.xtext.example.idmproject.jsonParser.Print;
import org.xtext.example.idmproject.jsonParser.Select;
import org.xtext.example.idmproject.jsonParser.Store;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.idmproject.jsonParser.impl.InstructionImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.xtext.example.idmproject.jsonParser.impl.InstructionImpl#getStore <em>Store</em>}</li>
 *   <li>{@link org.xtext.example.idmproject.jsonParser.impl.InstructionImpl#getSave <em>Save</em>}</li>
 *   <li>{@link org.xtext.example.idmproject.jsonParser.impl.InstructionImpl#getPrint <em>Print</em>}</li>
 *   <li>{@link org.xtext.example.idmproject.jsonParser.impl.InstructionImpl#getInsert <em>Insert</em>}</li>
 *   <li>{@link org.xtext.example.idmproject.jsonParser.impl.InstructionImpl#getModify <em>Modify</em>}</li>
 *   <li>{@link org.xtext.example.idmproject.jsonParser.impl.InstructionImpl#getCompute <em>Compute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstructionImpl extends MinimalEObjectImpl.Container implements Instruction
{
  /**
   * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelect()
   * @generated
   * @ordered
   */
  protected Select select;

  /**
   * The cached value of the '{@link #getStore() <em>Store</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStore()
   * @generated
   * @ordered
   */
  protected Store store;

  /**
   * The default value of the '{@link #getSave() <em>Save</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSave()
   * @generated
   * @ordered
   */
  protected static final String SAVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSave() <em>Save</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSave()
   * @generated
   * @ordered
   */
  protected String save = SAVE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPrint() <em>Print</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrint()
   * @generated
   * @ordered
   */
  protected Print print;

  /**
   * The cached value of the '{@link #getInsert() <em>Insert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsert()
   * @generated
   * @ordered
   */
  protected Insert insert;

  /**
   * The cached value of the '{@link #getModify() <em>Modify</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModify()
   * @generated
   * @ordered
   */
  protected Modify modify;

  /**
   * The cached value of the '{@link #getCompute() <em>Compute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompute()
   * @generated
   * @ordered
   */
  protected Compute compute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstructionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JsonParserPackage.Literals.INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Select getSelect()
  {
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelect(Select newSelect, NotificationChain msgs)
  {
    Select oldSelect = select;
    select = newSelect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonParserPackage.INSTRUCTION__SELECT, oldSelect, newSelect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSelect(Select newSelect)
  {
    if (newSelect != select)
    {
      NotificationChain msgs = null;
      if (select != null)
        msgs = ((InternalEObject)select).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonParserPackage.INSTRUCTION__SELECT, null, msgs);
      if (newSelect != null)
        msgs = ((InternalEObject)newSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonParserPackage.INSTRUCTION__SELECT, null, msgs);
      msgs = basicSetSelect(newSelect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonParserPackage.INSTRUCTION__SELECT, newSelect, newSelect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Store getStore()
  {
    return store;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStore(Store newStore, NotificationChain msgs)
  {
    Store oldStore = store;
    store = newStore;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonParserPackage.INSTRUCTION__STORE, oldStore, newStore);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStore(Store newStore)
  {
    if (newStore != store)
    {
      NotificationChain msgs = null;
      if (store != null)
        msgs = ((InternalEObject)store).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonParserPackage.INSTRUCTION__STORE, null, msgs);
      if (newStore != null)
        msgs = ((InternalEObject)newStore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonParserPackage.INSTRUCTION__STORE, null, msgs);
      msgs = basicSetStore(newStore, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonParserPackage.INSTRUCTION__STORE, newStore, newStore));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSave()
  {
    return save;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSave(String newSave)
  {
    String oldSave = save;
    save = newSave;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonParserPackage.INSTRUCTION__SAVE, oldSave, save));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Print getPrint()
  {
    return print;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrint(Print newPrint, NotificationChain msgs)
  {
    Print oldPrint = print;
    print = newPrint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonParserPackage.INSTRUCTION__PRINT, oldPrint, newPrint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPrint(Print newPrint)
  {
    if (newPrint != print)
    {
      NotificationChain msgs = null;
      if (print != null)
        msgs = ((InternalEObject)print).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonParserPackage.INSTRUCTION__PRINT, null, msgs);
      if (newPrint != null)
        msgs = ((InternalEObject)newPrint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonParserPackage.INSTRUCTION__PRINT, null, msgs);
      msgs = basicSetPrint(newPrint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonParserPackage.INSTRUCTION__PRINT, newPrint, newPrint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Insert getInsert()
  {
    return insert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInsert(Insert newInsert, NotificationChain msgs)
  {
    Insert oldInsert = insert;
    insert = newInsert;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonParserPackage.INSTRUCTION__INSERT, oldInsert, newInsert);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInsert(Insert newInsert)
  {
    if (newInsert != insert)
    {
      NotificationChain msgs = null;
      if (insert != null)
        msgs = ((InternalEObject)insert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonParserPackage.INSTRUCTION__INSERT, null, msgs);
      if (newInsert != null)
        msgs = ((InternalEObject)newInsert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonParserPackage.INSTRUCTION__INSERT, null, msgs);
      msgs = basicSetInsert(newInsert, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonParserPackage.INSTRUCTION__INSERT, newInsert, newInsert));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Modify getModify()
  {
    return modify;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModify(Modify newModify, NotificationChain msgs)
  {
    Modify oldModify = modify;
    modify = newModify;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonParserPackage.INSTRUCTION__MODIFY, oldModify, newModify);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModify(Modify newModify)
  {
    if (newModify != modify)
    {
      NotificationChain msgs = null;
      if (modify != null)
        msgs = ((InternalEObject)modify).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonParserPackage.INSTRUCTION__MODIFY, null, msgs);
      if (newModify != null)
        msgs = ((InternalEObject)newModify).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonParserPackage.INSTRUCTION__MODIFY, null, msgs);
      msgs = basicSetModify(newModify, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonParserPackage.INSTRUCTION__MODIFY, newModify, newModify));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Compute getCompute()
  {
    return compute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompute(Compute newCompute, NotificationChain msgs)
  {
    Compute oldCompute = compute;
    compute = newCompute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonParserPackage.INSTRUCTION__COMPUTE, oldCompute, newCompute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCompute(Compute newCompute)
  {
    if (newCompute != compute)
    {
      NotificationChain msgs = null;
      if (compute != null)
        msgs = ((InternalEObject)compute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonParserPackage.INSTRUCTION__COMPUTE, null, msgs);
      if (newCompute != null)
        msgs = ((InternalEObject)newCompute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonParserPackage.INSTRUCTION__COMPUTE, null, msgs);
      msgs = basicSetCompute(newCompute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonParserPackage.INSTRUCTION__COMPUTE, newCompute, newCompute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JsonParserPackage.INSTRUCTION__SELECT:
        return basicSetSelect(null, msgs);
      case JsonParserPackage.INSTRUCTION__STORE:
        return basicSetStore(null, msgs);
      case JsonParserPackage.INSTRUCTION__PRINT:
        return basicSetPrint(null, msgs);
      case JsonParserPackage.INSTRUCTION__INSERT:
        return basicSetInsert(null, msgs);
      case JsonParserPackage.INSTRUCTION__MODIFY:
        return basicSetModify(null, msgs);
      case JsonParserPackage.INSTRUCTION__COMPUTE:
        return basicSetCompute(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JsonParserPackage.INSTRUCTION__SELECT:
        return getSelect();
      case JsonParserPackage.INSTRUCTION__STORE:
        return getStore();
      case JsonParserPackage.INSTRUCTION__SAVE:
        return getSave();
      case JsonParserPackage.INSTRUCTION__PRINT:
        return getPrint();
      case JsonParserPackage.INSTRUCTION__INSERT:
        return getInsert();
      case JsonParserPackage.INSTRUCTION__MODIFY:
        return getModify();
      case JsonParserPackage.INSTRUCTION__COMPUTE:
        return getCompute();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JsonParserPackage.INSTRUCTION__SELECT:
        setSelect((Select)newValue);
        return;
      case JsonParserPackage.INSTRUCTION__STORE:
        setStore((Store)newValue);
        return;
      case JsonParserPackage.INSTRUCTION__SAVE:
        setSave((String)newValue);
        return;
      case JsonParserPackage.INSTRUCTION__PRINT:
        setPrint((Print)newValue);
        return;
      case JsonParserPackage.INSTRUCTION__INSERT:
        setInsert((Insert)newValue);
        return;
      case JsonParserPackage.INSTRUCTION__MODIFY:
        setModify((Modify)newValue);
        return;
      case JsonParserPackage.INSTRUCTION__COMPUTE:
        setCompute((Compute)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JsonParserPackage.INSTRUCTION__SELECT:
        setSelect((Select)null);
        return;
      case JsonParserPackage.INSTRUCTION__STORE:
        setStore((Store)null);
        return;
      case JsonParserPackage.INSTRUCTION__SAVE:
        setSave(SAVE_EDEFAULT);
        return;
      case JsonParserPackage.INSTRUCTION__PRINT:
        setPrint((Print)null);
        return;
      case JsonParserPackage.INSTRUCTION__INSERT:
        setInsert((Insert)null);
        return;
      case JsonParserPackage.INSTRUCTION__MODIFY:
        setModify((Modify)null);
        return;
      case JsonParserPackage.INSTRUCTION__COMPUTE:
        setCompute((Compute)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JsonParserPackage.INSTRUCTION__SELECT:
        return select != null;
      case JsonParserPackage.INSTRUCTION__STORE:
        return store != null;
      case JsonParserPackage.INSTRUCTION__SAVE:
        return SAVE_EDEFAULT == null ? save != null : !SAVE_EDEFAULT.equals(save);
      case JsonParserPackage.INSTRUCTION__PRINT:
        return print != null;
      case JsonParserPackage.INSTRUCTION__INSERT:
        return insert != null;
      case JsonParserPackage.INSTRUCTION__MODIFY:
        return modify != null;
      case JsonParserPackage.INSTRUCTION__COMPUTE:
        return compute != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (save: ");
    result.append(save);
    result.append(')');
    return result.toString();
  }

} //InstructionImpl
