package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerNotActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /scratch/jenkins/workspace/8-2-build-linux-amd64/jdk8u261/295/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, June 17, 2020 11:43:19 PM PDT
*/

public final class ServerNotActive extends org.omg.CORBA.UserException
{
  public String serverId = null;

  public ServerNotActive ()
  {
    super(ServerNotActiveHelper.id());
  } // ctor

  public ServerNotActive (String _serverId)
  {
    super(ServerNotActiveHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerNotActive (String $reason, String _serverId)
  {
    super(ServerNotActiveHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerNotActive
