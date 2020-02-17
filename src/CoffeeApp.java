import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CoffeeApp {

    public ArrayList<Coffee> coffeeList;

    public CoffeeApp(){
        coffeeList = new ArrayList<>();
    }

    // ADD COFFEE (REGULAR & OVERLOADED METHODS)
    public void addCoffee(Coffee newCoffee){ this.coffeeList.add(newCoffee); }
    public void addCoffee(Coffee newCoffee, int index){ this.coffeeList.add(index, newCoffee); }
    // REMOVE COFFEE (REGULAR & OVERLOADED METHODS)
    public void removeCoffee(Coffee removeThis){ this.coffeeList.remove(removeThis); }
    public void removeCoffee(int index){ this.coffeeList.remove(index); }

    public static List<String> readFromFile(Path file) throws IOException {
        List<String> readLines = new ArrayList<>();
        readLines = Files.readAllLines(file);
        return readLines;
    }

    public static void main(String[] args) {
        try {
            Path coffeeFile = Paths.get("src", "coffees.txt");
            CoffeeApp.readFromFile(coffeeFile);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }



}
