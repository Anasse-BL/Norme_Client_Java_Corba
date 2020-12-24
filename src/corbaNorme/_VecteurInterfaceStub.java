package corbaNorme;


/**
* corbaNorme/_VecteurInterfaceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Norme.idl
* mercredi 23 d�cembre 2020 12 h 56 WEST
*/

public class _VecteurInterfaceStub extends org.omg.CORBA.portable.ObjectImpl implements corbaNorme.VecteurInterface
{

  public double norme (double a, double b, double c)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("norme", true);
                $out.write_double (a);
                $out.write_double (b);
                $out.write_double (c);
                $in = _invoke ($out);
                double $result = $in.read_double ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return norme (a, b, c        );
            } finally {
                _releaseReply ($in);
            }
  } // norme

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:corbaNorme/VecteurInterface:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _VecteurInterfaceStub