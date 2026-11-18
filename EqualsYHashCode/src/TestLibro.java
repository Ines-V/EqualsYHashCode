public class TestLibro {
    public static void main(){
        try{
            Libro libroUno=new Libro("El señor de los anillos", "J. R. R. Tolkien", 1995); //No hay error.
            System.out.println(libroUno);
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }

        System.out.println("/////");

        try{
            Libro libroDos=new Libro("", "J. R. R. Tolkien", 1995); //Hay error porque no hay titulo
            System.out.println(libroDos);
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }

        System.out.println("/////");

        try{
            Libro libroTres=new Libro("El señor de los anillos", "", 1995); //Hay error poruqe no hay autor.
            System.out.println(libroTres);
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
