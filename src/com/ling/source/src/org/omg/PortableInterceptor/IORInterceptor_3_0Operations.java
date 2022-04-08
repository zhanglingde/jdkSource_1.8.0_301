package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/IORInterceptor_3_0Operations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-x86_64/jdk8u301/1513/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Wednesday, June 9, 2021 2:35:52 PM BST
*/

public interface IORInterceptor_3_0Operations  extends org.omg.PortableInterceptor.IORInterceptorOperations
{

  /** The components_established method is invoked on all registered 
       * IORInterceptor_3_0 instances after establish_components
       * has been invoked on all registered IORInterceptor instances.
       * The adapter_template is available in info during this call.
       * The current_factory may be get or set in info during this call.
       * <p>
       * Any exception thrown from this method is handled by the Object 
       * Adapter that called this interceptor.  In the case of the POA,
       * an exception results in a OBJ_ADAPTER exception with an OMG
       * standard minor code of 6.
       * @param info The IORInfo for the object adapter being created.
       */
  void components_established (org.omg.PortableInterceptor.IORInfo info);

  /** Called whenever the state of an adapter manager changes.
       * For the POA, that is the POAManager.  If the state change
       * is reported through <code>adapter_manager_state_changed</code>,
       * it is not reported through <code>adapter_state_changed</code>.
       * @param id the adapter manager id of the adapter manager that 
       * changed state
       * @param state the new state of the adapter manager
       */
  void adapter_manager_state_changed (int id, short state);

  /** Called whenever the state of an object adapter changes, and
       * the state change is not caused by an adapter manager.  Such
       * changes are reported to all registered <code>IORInterceptor_3_0</code> 
       * instances.
       * @param templates the sequence of <code>ObjectReferenceTemplate</code> instances
       *     on which this state change occurred.
       * @param state the new <code>AdapterState</code> shared by all of the templates.
       */
  void adapter_state_changed (org.omg.PortableInterceptor.ObjectReferenceTemplate[] templates, short state);
} // interface IORInterceptor_3_0Operations
