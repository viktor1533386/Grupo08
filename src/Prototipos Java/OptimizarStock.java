
package integradori;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptimizarStock extends JFrame {

    private JLabel lblProducto, lblStockActual, lblStockSugerido, lblEstrategia;
    private JComboBox<String> cmbProducto, cmbEstrategia;
    private JTextField txtStockActual, txtStockSugerido;
    private JButton btnOptimizar, btnLimpiar, btnCancelar;

    public OptimizarStock() {
        setTitle("Optimización de Stock");
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Labels
        lblProducto = new JLabel("Producto:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lblProducto, gbc);

        lblStockActual = new JLabel("Stock Actual:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lblStockActual, gbc);

        lblStockSugerido = new JLabel("Stock Sugerido:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(lblStockSugerido, gbc);

        lblEstrategia = new JLabel("Estrategia de Optimización:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(lblEstrategia, gbc);

        // ComboBox de productos
        cmbProducto = new JComboBox<>(new String[]{"Producto 1", "Producto 2", "Producto 3"});
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(cmbProducto, gbc);

        // Campo de Stock Actual
        txtStockActual = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(txtStockActual, gbc);

        // Campo de Stock Sugerido
        txtStockSugerido = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(txtStockSugerido, gbc);

        // ComboBox de Estrategia de Optimización
        cmbEstrategia = new JComboBox<>(new String[]{"Por ventas recientes", "Por demanda estimada", "Automático"});
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(cmbEstrategia, gbc);

        // Botones
        btnOptimizar = new JButton("Optimizar Stock");
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(btnOptimizar, gbc);

        btnLimpiar = new JButton("Limpiar Campos");
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(btnLimpiar, gbc);

        btnCancelar = new JButton("Cancelar");
        gbc.gridx = 2;
        gbc.gridy = 4;
        add(btnCancelar, gbc);

        // Acción del botón Optimizar Stock
        btnOptimizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String producto = (String) cmbProducto.getSelectedItem();
                String estrategia = (String) cmbEstrategia.getSelectedItem();
                JOptionPane.showMessageDialog(null, "Optimizando el stock de " + producto + " según la estrategia " + estrategia + ".");
            }
        });

        // Acción del botón Limpiar Campos
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cmbProducto.setSelectedIndex(0);
                txtStockActual.setText("");
                txtStockSugerido.setText("");
                cmbEstrategia.setSelectedIndex(0);
            }
        });

        // Acción del botón Cancelar
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new OptimizarStock().setVisible(true);
            }
        });
    }
}

