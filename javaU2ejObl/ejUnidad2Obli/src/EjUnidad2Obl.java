import javax.swing.JOptionPane;

//Crear un programa en java en el cual se pida al usuario ingresar su nombre, apellido, edad, hobbie, editor de código preferido, sistema operativo que utiliza, luego deberá mostrarse por consola los datos ingresados.

public class EjUnidad2Obl {
    public static void main(String[] args){
        System.out.println("Bienvenido al Ejercicio Obligatorio de la Unidad 2 de JAVA");
        String nombre=JOptionPane.showInputDialog("Ingrese su nombre: ");
        String apellido=JOptionPane.showInputDialog("Ingrese su apellido: ");
        int edad= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        String hobbie=JOptionPane.showInputDialog("Ingrese su hobbie: ");
        String ide=JOptionPane.showInputDialog("Ingrese su editor de codigo favorito: ");
        String so=JOptionPane.showInputDialog("Ingrese su sistema operativo favorito: ");

        System.out.println("Los datos ingresados son:");
        System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nHobbie: " + hobbie + "\nEditor favorito: " + ide + "\nSistema Operativo favorito: " + so);
        System.out.println(nombre + ", gracias por participar!");
    }

   
}
