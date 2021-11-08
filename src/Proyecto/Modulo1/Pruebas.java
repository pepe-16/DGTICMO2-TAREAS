package Proyecto.Modulo1;

public class Pruebas {
  public static void main(String[] args)
  {
	  System.out.println("Probando la clase Admi:");
	  Administrador admi = new Administrador();
	  System.out.println("El admin se pudo logear: " + admi.loogean("SystemSicopon123") );
	  
	  System.out.println("Probando la clase Usuario:");
	  Usuario user1 = new Usuario();
	  Usuario user2 = new Usuario();
	  Usuario user3 = new Usuario();
	  user3.setId_user(25);
	  
	  System.out.println("El usuario se pudo logear: " + user1.loogean("123") );
	  System.out.println(user1.toString());
	  System.out.println(user2.toString());
	  System.out.println(user3.toString());
	  
	  System.out.println(user1.equals(user2));
	  System.out.println(user1.equals(user3));
	  
	  System.out.println("Probando la clase Protocoloxaciones:");
	  Protocolizaciones proto1 = new Protocolizaciones();
	  Protocolizaciones proto2 = new Protocolizaciones();
	  Protocolizaciones proto3 = new Protocolizaciones();
	  proto3.setId_proto(20);
	  
	  System.out.println(proto1.toString());
	  System.out.println(proto2.toString());
	  System.out.println(proto3.toString());
	  
	  System.out.println(proto1.equals(proto2));
	  System.out.println(proto1.equals(proto3));
	  
	  System.out.println("Probando la clase Poderes Notariales:");
	  PoderNotarial poder1 = new PoderNotarial();
	  PoderNotarial poder2 = new PoderNotarial();
	  PoderNotarial poder3 = new PoderNotarial();
	  poder3.setId_poderN(1);
	  
	  System.out.println(poder1.toString());
	  System.out.println(poder2.toString());
	  System.out.println(poder3.toString());
	  
	  System.out.println(poder1.equals(poder2));
	  System.out.println(poder1.equals(poder3));
  }
}
