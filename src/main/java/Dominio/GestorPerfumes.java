package Dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorPerfumes {
    private List<Perfumes> perfumes = new ArrayList<>();
    private List<Decant> decants = new ArrayList<>();

    public void cargarDecantsDesdeTXT(String archivo) {
        decants.clear(); // Limpiar lista antes de cargar nuevos datos
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 4) {
                    String nombre = datos[0];
                    String marca = datos[1];
                    String cantidad = datos[2];
                    String precio = datos[3];

                    decants.add(new Decant(nombre, marca, cantidad, precio));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de decants: " + e.getMessage());
        }
    }

    public void cargarPerfumesDesdeTXT(String archivo) {
        perfumes.clear(); // Limpiar lista antes de cargar nuevos datos
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 4) {
                    String nombre = datos[0];
                    String marca = datos[1];
                    String cantidad = datos[2];
                    String precio = datos[3];

                    perfumes.add(new Perfumes(nombre, marca, cantidad, precio));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de perfumes: " + e.getMessage());
        }
    }

    public List<Decant> getDecants() {
        return decants;
    }

    public List<Perfumes> getPerfumes() {
        return perfumes;
    }


}
