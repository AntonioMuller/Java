//Feito por Ant�nio M�ller Brugago

package attquizshow;

import java.util.Scanner;

public class quizzzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int  r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11;
		//essas s�o as variaveis, tem a fun��o de determinar o tipo das respostas das perguntas
		
		
		 System.out.println("Bem vindo ao quiz do Tonh�o, voc� deve responder as perguntas, a cada pergunta que voc� acerta voc� ganha mais, se voc� errar voc� perde tudo, e voc� pode escolher para desistir, se voc� desisitir voc� perde mas fica com a quantia de dinheiro que ganhou, boa sorte ");
		 System.out.println("Qual bicho transmite a doen�a de Chagas? 1)Abelha, 2)Barata, 3)Pulga, 4)Barbeiro ");
		 r1 = sc.nextInt();
		 //usei o system.out.println para fazer as perguntas
		 //com o r1 = sc.nextInt(); voc� consegue responder as perguntas
		 if(r1 == 4 ) {
			 System.out.println("A resposta est� correta voc� est� com 1000 reais no total ");
			 //usei o if == 4 para que se a resposta fosse 4 aparece a mensagem que voc� acertou e que voc� podia continuar jogando
		 }else {
			 System.out.println("A resposta est� errada a certa � 4)Barbeiro, mais sorte na pr�xima ");
			  System.exit(0);
			  //usei o else para caso n�o fosse a resposta igual a 4 o c�digo mandasse a mensagem falando que estava errado e parava o c�digo
		 }
		 
		 System.out.println("Qual � o coletivo de c�es? 1)Matilha, 2)Rebanho, 3)Alcateia, 4)Manada, para desistir digite 5 ");
		 r2 = sc.nextInt();
		 if(r2 == 5) {
			 System.out.println("Voc� escolheu desistir, ent�o voc� ganhou 1000 reais no total parab�ns ");
			//Usei outro if para que caso a pessoa queira desistir ela possa, digitando 5
			  System.exit(0);
			//O system.ext(0) tem a fun��o de parar o c�digo, ent�o caso a pessoa escolhesse 5 o c�digo para
		 }
		 if(r2 == 1 ) {
			 System.out.println("A resposta est� correta voc� esta com 2000 reais no total ");
		 }else {
			 System.out.println("A resposta est� errada a certa � 1)Matilha ");
			  System.exit(0);
			//O system.ext(0) tem a fun��o de parar o c�digo, ent�o caso a pessoa escolhesse uma resposta diferente de 1 o c�digo para
		 }
		 
		 
		 System.out.println("A compensa��o por perda � chamada de... 1)D�fict, 2)Indeniza��o, 3)Indexa��o, 4)Ind�bito, para desistir digite 5 ");
		 r3 = sc.nextInt();
		 if(r3 == 5) {
			 System.out.println("Voc� escolheu desistir, ent�o voc� ganhou 2000 reais no total parab�ns ");
			  System.exit(0);
		 }
		 if(r3 == 2 ) {
			 System.out.println("A resposta est� correta voc� esta com 3000 reais no total ");
		 }else {
			 System.out.println("A resposta est� errada a certa � 2)Indeniza��o ");
			  System.exit(0);
		 }
		 
		 
		 
		 System.out.println("Qual montanha se localiza entre a fronteira do Tibet com o Nepal? 1)Monte Everest, 2)Monte Carlo, 3)Monte Fuji, 4)Monte Branco, para desistir digite 5 ");
		 r3 = sc.nextInt();
		 if(r3 == 5) {
			 System.out.println("Voc� escolheu desistir, ent�o voc� ganhou 3000 reais no total parab�ns ");
			  System.exit(0);
		 }
		 if(r3 == 1 ) {
			 System.out.println("A resposta est� correta, voc� esta com 5000 reais ");
		 }else {
			 System.out.println("A resposta est� errada a certa � 1)Monte Evereste ");
			  System.exit(0);
		 }
		
		 
		 
		 System.out.println("Qual o nome se d� � purifica��o por meio da �gua? 1)Aboli��o, 2)Abnega��o, 3)Ablu��o, 4)Abrup��o, para desistir digite 5 ");
		 r4 = sc.nextInt();
		 if(r4 == 5) {
			 System.out.println("Voc� escolheu desistir, ent�o voc� ganhou 5000 reais no total parab�ns ");
			  System.exit(0);
		 }
		 if(r4 == 3 ) {
			 System.out.println("A resposta est� correta, voc� est� com 10.000 reais no total ");
		 }else {
			 System.out.println("A resposta est� errada a certa � 3)Ablu��o ");
			  System.exit(0);
		 }
		 
		 
		 System.out.println("Qual foi o �ltimo presidente do per�odo da ditadura militar do Brasil ? 1)Costa e Silva, 2)Jo�o Figueiredo, 3)Ernesto Geisel, 4)Em�lio �dice, para desistir digite 5 ");
		 r4 = sc.nextInt();
		 if(r4 == 5) {
			 System.out.println("Voc� escolheu desistir, ent�o voc� ganhou 10.000 reais no total parab�ns ");
			  System.exit(0);
		 }
		 if(r4 == 2 ) {
			 System.out.println("A resposta est� correta voc� est� com 15.000 reais no total parab�ns ");
		 }else {
			 System.out.println("A resposta est� errada a certa � 2)Jo�o Figueiredo ");
			  System.exit(0);
		 }
		 
		 
		 
		 System.out.println("O adjetivo venoso est� relacionado a: ? 1)Vela, 2)Vento, 3)V�nia, 4)Veia, para desistir digite 5 ");
		 r5 = sc.nextInt();
		 if(r5 == 5) {
			 System.out.println("Voc� escolheu desistir, ent�o voc� ganhou 15.000 reais no total parab�ns ");
			  System.exit(0);
		 }
		 if(r5 == 4 ) {
			 System.out.println("A resposta est� correta voc� est� com 20.000 reais no total parab�ns ");
		 }else {
			 System.out.println("A resposta est� errada a certa � 4)Veia ");
			  System.exit(0);
		 }
		 
		 
		 System.out.println("Em que parte do corpo se encontra a epiglote ? 1)Est�mago, 2)P�ncreas, 3)Rim, 4)Boca, para desistir digite 5 ");
		 r6 = sc.nextInt();
		 if(r6 == 5) {
			 System.out.println("Voc� escolheu desistir, ent�o voc� ganhou 20.000 reais no total parab�ns ");
			  System.exit(0);
		 }
		 if(r6 == 4 ) {
			 System.out.println("A resposta est� correta voc� est� com 30.000 reais no total parab�ns ");
		 }else {
			 System.out.println("A resposta est� errada a certa � 4)Boca ");
			  System.exit(0);
		 }
		 
		 System.out.println("Em que pa�s nasceu Carmem Miranda ? 1)Brasil, 2)Espanha, 3)Portugal, 4)Argentina, para desistir digite 5 ");
		 r7 = sc.nextInt();
		 if(r7 == 5) {
			 System.out.println("Voc� escolheu desistir, ent�o voc� ganhou 30.000 reais no total parab�ns ");
			  System.exit(0);
		 }
		 if(r7 == 3 ) {
			 System.out.println("A resposta est� correta voc� est� com 50.000 reais no total parab�ns ");
		 }else {
			 System.out.println("A resposta est� errada a certa � 3)Portugal ");
			  System.exit(0);
		 }
		 
		 
		 System.out.println("A tecnologia Bluetooth tirou seu nome de: 1)Um rio, 2)Um rei, 3)Um general, 4)Um castelo, para desistir digite 5 ");
		 r8 = sc.nextInt();
		 if(r8 == 5) {
			 System.out.println("Voc� escolheu desistir, ent�o voc� ganhou 50.000 reais no total parab�ns ");
			  System.exit(0);
		 }
		 if(r8 == 2 ) {
			 System.out.println("A resposta est� correta voc� est� com 100.000 reais no total parab�ns ");
		 }else {
			 System.out.println("A resposta est� errada a certa � 2)Um rei ");
			  System.exit(0);
		 }
		 
		 System.out.println("Se um ex�rcito est� sem muni��o ele � um ex�rcito: 1)Desarrazoado, 2)Desapercebido, 3)Desalinhado, 4)Desarranchado, para desistir digite 5 ");
		 r9 = sc.nextInt();
		 if(r9 == 5) {
			 System.out.println("Voc� escolheu desistir, ent�o voc� ganhou 100.000 reais no total parab�ns ");
			  System.exit(0);
		 }
		 if(r9 == 2 ) {
			 System.out.println("A resposta est� correta voc� est� com 250.000 reais no total parab�ns ");
		 }else {
			 System.out.println("A resposta est� errada a certa � 2)Desapercebido ");
			  System.exit(0);
		 }
		 
		 System.out.println("Aos 85 anos de idade, ele desfilou pela badalada estilista Guo Pei em Paris no in�cio de 2017. Estamos falando de qual modelo? 1)Carmen Dell' Orefice, 2)Maye Musk, 3)Jenni Rhodes, 4)Jan de Villeneuve, para desistir digite 5 ");
		 r10 = sc.nextInt();
		 if(r10 == 5) {
			 System.out.println("Voc� escolheu desistir, ent�o voc� ganhou 250.000 reais no total parab�ns ");
			  System.exit(0);
		 }
		 if(r10 == 1 ) {
			 System.out.println("A resposta est� correta voc� est� com 500.000 reais no total parab�ns ");
		 }else {
			 System.out.println("A resposta est� errada a certa � 1)Carmen Dell' Orefice ");
			  System.exit(0);
		 }
		 
		 System.out.println("ESTAMOS AGORA NA PERGUNTA DO MILH�O!!!");
		 System.out.println("Quando o gal� de Hollywood Ant�nio M�ller Brugnago nasceu? 1)30/08/2005, 2)23/06/2004, 3)06/03/2005, 4)21/09/2004, para desistir digite 5 ");
		 r11 = sc.nextInt();
		 if(r11 == 5) {
			 System.out.println("Voc� escolheu desistir, ent�o voc� ganhou 500.000 reais no total parab�ns ");
			  System.exit(0);
		 }
		 if(r11 == 1 ) {
			 System.out.println("A resposta est� correta voc� est� com 1.000.000 de reais no total parab�ns voc� � um MILION�RIO");
		 }else {
			 System.out.println("A resposta est� errada a certa � 4)21/09/2004 ");
			  System.exit(0);
		 }
		 
		
		sc.close();
		//Serviu para finalizar o c�digo, ou seja para ele parar.

	}		

	}


