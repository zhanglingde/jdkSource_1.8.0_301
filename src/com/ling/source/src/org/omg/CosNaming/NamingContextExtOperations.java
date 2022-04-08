package org.omg.CosNaming;


/**
* org/omg/CosNaming/NamingContextExtOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-x86_64/jdk8u301/1513/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Wednesday, June 9, 2021 2:35:51 PM BST
*/


/** 
 * <code>NamingContextExt</code> is the extension of <code>NamingContext</code>
 * which
 * contains a set of name bindings in which each name is unique and is
 * part of Interoperable Naming Service.
 * Different names can be bound to an object in the same or different
 * contexts at the same time. Using <tt>NamingContextExt</tt>, you can use
 * URL-based names to bind and resolve. <p>
 * 
 * See <a href="http://www.omg.org/technology/documents/formal/naming_service.htm">
 * CORBA COS 
 * Naming Specification.</a>
 */
public interface NamingContextExtOperations  extends org.omg.CosNaming.NamingContextOperations
{

  /**
   * This operation creates a stringified name from the array of Name
   * components.
   * 
   * @param n Name of the object <p>
   * 
   * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
   * Indicates the name does not identify a binding.<p>
   * 
   */
  String to_string (org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.InvalidName;

  /**
   * This operation  converts a Stringified Name into an  equivalent array
   * of Name Components. 
   * 
   * @param sn Stringified Name of the object <p>
   * 
   * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
   * Indicates the name does not identify a binding.<p>
   * 
   */
  org.omg.CosNaming.NameComponent[] to_name (String sn) throws org.omg.CosNaming.NamingContextPackage.InvalidName;

  /**
   * This operation creates a URL based "iiopname://" format name
   * from the Stringified Name of the object.
   * 
   * @param addr internet based address of the host machine where  Name Service is running <p>
   * @param sn Stringified Name of the object <p>
   * 
   * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
   * Indicates the name does not identify a binding.<p>
   * @exception org.omg.CosNaming.NamingContextPackage.InvalidAddress
   * Indicates the internet based address of the host machine is 
   * incorrect <p>
   * 
   */
  String to_url (String addr, String sn) throws org.omg.CosNaming.NamingContextExtPackage.InvalidAddress, org.omg.CosNaming.NamingContextPackage.InvalidName;

  /**
   * This operation resolves the Stringified name into the object
   * reference. 
   * 
   * @param sn Stringified Name of the object <p>
   * 
   * @exception org.omg.CosNaming.NamingContextPackage.NotFound
   * Indicates there is no object reference for the given name. <p>
   * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed
   * Indicates that the given compound name is incorrect <p>
   * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
   * Indicates the name does not identify a binding.<p>
   * 
   */
  org.omg.CORBA.Object resolve_str (String sn) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName;
} // interface NamingContextExtOperations
