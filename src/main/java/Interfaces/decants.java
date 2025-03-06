package Interfaces;

import Dominio.Decant;
import Dominio.GestorPerfumes;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class decants extends JFrame implements ActionListener {
    private JPanel home;
    private JTable tablaDecants;
    private DefaultTableModel modelo;
    private JButton exitButton;
    private GestorPerfumes gestorPerfumes;

    public decants() {
        setTitle("Decants");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        exitButton = new JButton("Exit");


        // Crear el panel principal
        home = new JPanel(new BorderLayout());
        home.add(exitButton, BorderLayout.SOUTH);


        // Definir columnas de la tabla
        String[] columnas = {"Nombre", "Marca", "Cantidad", "Precio"};
        modelo = new DefaultTableModel(columnas, 0);
        tablaDecants = new JTable(modelo);

        // Instanciar el gestor y cargar datos
        gestorPerfumes = new GestorPerfumes();
        gestorPerfumes.cargarDecantsDesdeTXT("src/main/java/Datos/decants.txt");

        // Cargar datos en la tabla
        cargarDatosEnTabla();

        // Agregar la tabla a un JScrollPane y al panel
        home.add(new JScrollPane(tablaDecants), BorderLayout.CENTER);
        add(home);
        exitButton.addActionListener(this);
        setVisible(true);
    }

    private void cargarDatosEnTabla() {
        List<Decant> listaDecants = gestorPerfumes.getDecants();
        for (Decant dec : listaDecants) {
            modelo.addRow(new Object[]{dec.getNombre(), dec.getMarca(), dec.getMl(), dec.getPrecio()});
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitButton) {
            this.setVisible(false);
            new Home();
        }
    }



}
