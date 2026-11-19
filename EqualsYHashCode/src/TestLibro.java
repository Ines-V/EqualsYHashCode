public class TestLibro {
    public static void main(){
        Libro libroUno=new Libro("El señor de los anillos", "J. R. R. Tolkien", 1995); //Con todos los datos.
        Libro libroDos=new Libro("El Quijote"); //Con solo el título
        Libro libroTres=new Libro("El quinto elemento", "Autor3"); //Con el título y el autor.

        //Introducir el Autor y el Año del libroDos.
        libroDos.setAutor("Miguel de Cervantes");
        libroDos.setAnio(1605);

        //Introducir el Año del libroTres.
        libroTres.setAnio(2014);

        //Imprimir los datos de los libros.
        System.out.println("Libro 1: "+libroUno);
        System.out.println(libroUno);

        System.out.println("/////");

        System.out.println("Libro 2: "+libroDos);
        System.out.println(libroDos);

        System.out.println("/////");

        System.out.println("Libro 3: "+libroTres);
        System.out.println(libroTres);

        Libro libroCuatro=new Libro("El camino","Miguel Delives",1950);
        Libro libroCinco=new Libro("El camino","Miguel Delives",1950);

        System.out.println("/////");

        System.out.println("Libro 4: "+libroCuatro);
        System.out.println(libroCuatro);

        System.out.println("/////");

        System.out.println("Libro 5: "+libroCinco);
        System.out.println(libroCinco);

        System.out.println("/////");

        System.out.println("Libro 4==Libro 5"+(14==15));

        System.out.println("/////");

        System.out.println("Libro 4 equals Libro 5"+libroCuatro.equals(libroCinco));

        System.out.println("-----");

        System.out.println("Libro 4 equals null"+libroCuatro.equals(null));

        System.out.println("-----");

        System.out.println("Libro 4 equals ()"+libroCuatro.equals("Hola Mundo."));

        System.out.println("-----");

        System.out.println("Libro 4 equals libroCuatro"+libroCuatro.equals(libroCuatro));

        System.out.println("/////");

        System.out.println("Libro 4 HashCode: "+libroCuatro.hashCode());

        System.out.println("-----");

        System.out.println("Libro 5 HashCode:"+libroCinco.hashCode());

        System.out.println("/////");

        System.out.println("Libro 2: "+libroDos.hashCode());
    }
}