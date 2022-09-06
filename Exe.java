import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Exe {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        // ESCRIBIR UN OBJETO DENTRO DE UN ARCHIVO
        // Crear un objeto de la clase Alumno
        Alumno al_alumno1 = new Alumno("Luis", 9.5);
        // Crear archivo
        ObjectOutputStream arch_alumnos_write = new ObjectOutputStream(new FileOutputStream("./alumnos.dat"));
        // Escribir el objeto dentro del archivo
        arch_alumnos_write.writeObject(al_alumno1);
        // Cerrar archivo
        arch_alumnos_write.close();

        // LEER UN OBJETO DENTRO DE UN ARCHIVO
        // Acceder al archivo
        ObjectInputStream arch_alumnos_read = new ObjectInputStream(new FileInputStream("./alumnos.dat"));
        // Crear una variable clase Object (Clase natural para hacer el proceso)
        Object v_temporal;
        // Asignar a la variable el objeto que va a leer del archivo
        v_temporal = arch_alumnos_read.readObject();
        // De la variable temporal, asignar el resultado a una variable clase Alumno
        Alumno v_alumno;
        v_alumno = (Alumno) v_temporal;
        // Mostrar los datos (toString), método propio de la clase libro
        v_alumno.m_mostrar();
        // Cerrar archivo abierto
        arch_alumnos_read.close();

    }
}