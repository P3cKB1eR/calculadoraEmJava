import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    public static void main (String[] args) {

        //Descreve o nome e tamanho da janela Swing
        JFrame janela = new JFrame("Calcaladora");
        janela.setSize(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                janela.setLayout(null);

        // Adicionar rótulo para o campo de entrada
        JLabel labelCelsius = new JLabel("Celsius:");
        labelCelsius.setBounds(20, 20, 80, 25);

        // Campo de entrada para Celsius
        JTextField campoCelsius = new JTextField();
        campoCelsius.setBounds(100, 20, 200, 25);

        // Botão para calcular
        JButton botaoConverter = new JButton("Converter");
        botaoConverter.setBounds(120, 60, 150, 30);

        // Rótulo para exibir o resultado
        JLabel labelResultado = new JLabel("Fahrenheit:");
        labelResultado.setBounds(20, 100, 300, 25);

        janela.add(labelCelsius);
        janela.add(campoCelsius);
        janela.add(botaoConverter);
        janela.add(labelResultado);

        // Adicionar ação ao botão
        botaoConverter.addActionListener(new ActionListener() {
            @Override
            
    }
}