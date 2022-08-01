package padrao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author sjand
 */
public class Media extends JFrame
{
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulomedia, exibir;
    JTextField texto1, texto2, texto3, texto4;
    JButton calcular;
    
    public Media()
    {
        super("Média do Aluno");
        
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo1 = new JLabel("Insira a 1ª nota: ");
        rotulo2 = new JLabel("Insira a 2ª nota: ");
        rotulo3 = new JLabel("Insira a 3ª nota: ");
        rotulo4 = new JLabel("Insira a 4ª nota: ");
        
        texto1 = new JTextField(4);
        texto2 = new JTextField(4);
        texto3 = new JTextField(4);
        texto4 = new JTextField(4);
        
        exibir = new JLabel("");
        
        calcular = new JButton("Calcular");
        
        rotulo1.setBounds(130, 20, 100, 20);
        texto1.setBounds(230, 20, 80, 20);
        
        rotulo2.setBounds(130, 60, 100, 20);
        texto2.setBounds(230, 60, 80, 20);
        
        rotulo3.setBounds(130, 100, 100, 20);
        texto3.setBounds(230, 100, 80, 20);
        
        rotulo4.setBounds(130, 140, 100, 20);
        texto4.setBounds(230, 140, 80, 20);
        
        calcular.setBounds(150, 180, 150, 20);
        
        exibir.setBounds(100, 220, 200, 20);
        
        calcular.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                        double n1, n2, n3, n4, media;
                        n1 = 0;
                        n2 = 0;
                        n3 = 0;
                        n4 = 0;
                        
                        n1 = Double.parseDouble(texto1.getText());
                        n2 = Double.parseDouble(texto2.getText());
                        n3 = Double.parseDouble(texto3.getText());
                        n4 = Double.parseDouble(texto4.getText());
                        
                        media = (n1 + n2 + n3 + n4)/4;
                        
                        exibir.setVisible(true);
                        exibir.setText("A média é: " + media);
                }
            }
        );
        
        texto1.requestFocus();
        
        exibir.setVisible(false);
        
        tela.add(rotulo1);
        tela.add(texto1);
        
        tela.add(rotulo2);
        tela.add(texto2);
        
        tela.add(rotulo3);
        tela.add(texto3);
        
        tela.add(rotulo4);
        tela.add(texto4);
        
        tela.add(calcular);
        
        tela.add(exibir);
        
        //define o tamanho da janela
        setSize(450, 300);
        //permite que isso exibe a janela
        setVisible(true);
        //permite que quando a janela exibir, abra no centro
        setLocationRelativeTo(null);
        //permite redimensionar e maximizar a janela 
        setResizable(true);
    } 
    
    public static void main(String[] args) 
    {
        Media app = new Media();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}