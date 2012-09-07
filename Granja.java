import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Granja {
  public static void main(String[] args) {
    
    Perro   perro   = new Perro();
    Gato    gato    = new Gato();
    Gallina gallina = new Gallina();;
    
    System.out.println("Soy un "+perro.decirQuienSoy());
    System.out.println("Soy un "+gato.decirQuienSoy());
    System.out.println("Soy una "+gallina.decirQuienSoy());   
    
  }
}
