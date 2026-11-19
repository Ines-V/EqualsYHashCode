public class TestLibro {
    public static void main(){
        Libro libroUno=new Libro("El señor de los anillos", "J. R. R. Tolkien", 1995);
        Libro libroDos=new Libro("El Quijote");
        Libro libroTres=new Libro("El quinto elemento", "Autor3");

        libroDos.setAutor("Miguel de Cervantes");
        libroDos.setAnio(1605);
        libroTres.setAnio(2014);

        System.out.println("Libro 1: "+libroUno);
        System.out.println("Libro 2: "+libroDos);
        System.out.println("Libro 3: "+libroTres);

        Libro libroCuatro=new Libro("El camino","Miguel Delives",1950);
        Libro libroCinco=new Libro("El camino","Miguel Delives",1950);

        System.out.println("Libro 4: "+libroCuatro);
        System.out.println("Libro 5: "+libroCinco);

        System.out.println("Libro 4==Libro 5"+(14==15));
        System.out.println("Libro 4 equals Libro 5"+libroCuatro.equals(libroCinco));

        System.out.println("Libro 4 equals null"+libroCuatro.equals(null));
        System.out.println("Libro 4 equals ()"+libroCuatro.equals("Hola Mundo."));
        System.out.println("Libro 4 equals libroCuatro"+libroCuatro.equals(libroCuatro));

        System.out.println("Libro 4 HashCode: "+libroCuatro.hashCode());
        System.out.println("Libro 5 HashCode:"+libroCinco.hashCode());
    }
}