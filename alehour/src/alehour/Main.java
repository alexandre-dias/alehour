package alehour;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {

		JLabel aviso = new JLabel();
		JFrame janela = new JFrame("alehour");
		JButton botao1, botao2, botao3, botao4, botaoLimpar, novoDia;

		botao1 = new JButton("Início Jornada");
		botao1.setBounds(10, 10, 330, 40);
		botao1.setFocusable(false);

		botao2 = new JButton("Início Almoço");
		botao2.setBounds(10, 80, 330, 40);
		botao2.setFocusable(false);

		botao3 = new JButton("Fim Almoço");
		botao3.setBounds(10, 150, 330, 40);
		botao3.setFocusable(false);

		botao4 = new JButton("Fim Jornada");
		botao4.setBounds(10, 220, 330, 40);
		botao4.setFocusable(false);

		botaoLimpar = new JButton("Limpar");
		botaoLimpar.setBounds(240, 280, 100, 20);
		botaoLimpar.setFocusable(false);

		novoDia = new JButton("Novo Dia");
		novoDia.setBounds(130, 280, 100, 20);
		novoDia.setFocusable(false);

		janela.add(botao1);
		janela.add(botao2);
		janela.add(botao3);
		janela.add(botao4);
		janela.add(botaoLimpar);
		janela.add(novoDia);

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("alehour");
		janela.setSize(370, 350);
		janela.setLocationRelativeTo(null);
		janela.setLayout(null);
		janela.setVisible(true);

		botao1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat dataSistema = new SimpleDateFormat("dd/MM/yyyy hh:mm aa");

				FileWriter arq = null;
				try {
					arq = new FileWriter("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\horas.txt",
							true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				BufferedWriter bw = new BufferedWriter(arq);
				PrintWriter arq1 = new PrintWriter(bw);
				{
					arq1.println("Início da Jornada: " + dataSistema.format(new Date()));
					arq1.close();
				}

				aviso.setText("");
				aviso.setText("Início da Jornada");
				aviso.setBounds(10, 240, 100, 100);
				janela.add(aviso);
				janela.repaint();
			}
		});

		botao2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat dataSistema = new SimpleDateFormat("dd/MM/yyyy hh:mm aa");

				FileWriter arq = null;
				try {
					arq = new FileWriter("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\horas.txt",
							true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				BufferedWriter bw = new BufferedWriter(arq);
				PrintWriter arq1 = new PrintWriter(bw);
				{
					arq1.println("Início do Almoço: " + dataSistema.format(new Date()));
					arq1.close();
				}

				aviso.setText("");
				aviso.setText("Início do Almoço");
				aviso.setBounds(10, 240, 100, 100);
				janela.add(aviso);
				janela.repaint();
			}
		});

		botao3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat dataSistema = new SimpleDateFormat("dd/MM/yyyy hh:mm aa");

				FileWriter arq = null;
				try {
					arq = new FileWriter("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\horas.txt",
							true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				BufferedWriter bw = new BufferedWriter(arq);
				PrintWriter arq1 = new PrintWriter(bw);
				{
					arq1.println("Fim do Almoço: " + dataSistema.format(new Date()));
					arq1.close();
				}

				aviso.setText("");
				aviso.setText("Fim do Almoço");
				aviso.setBounds(10, 240, 100, 100);
				janela.add(aviso);
				janela.repaint();
			}
		});

		botao4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat dataSistema = new SimpleDateFormat("dd/MM/yyyy hh:mm aa");

				FileWriter arq = null;
				try {
					arq = new FileWriter("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\horas.txt",
							true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				BufferedWriter bw = new BufferedWriter(arq);
				PrintWriter arq1 = new PrintWriter(bw);
				{
					arq1.println("Fim da Jornada: " + dataSistema.format(new Date()));
					arq1.close();
				}

				aviso.setText("");
				aviso.setText("Fim da Jornada");
				aviso.setBounds(10, 240, 100, 100);
				janela.add(aviso);
				janela.repaint();
			}
		});

		//
		// Limpa o monitor de ações
		//
		botaoLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				aviso.setText("");
			}
		});

		//
		// Apaga o arquivo TXT
		//
		novoDia.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				File file = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\horas.txt");
				file.delete();

				aviso.setText("");
				aviso.setText("Novo Dia Criado");
				aviso.setBounds(10, 240, 100, 100);
				janela.add(aviso);
				janela.repaint();
			}
		});

	}

}
