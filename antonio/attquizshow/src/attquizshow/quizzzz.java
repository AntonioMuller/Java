//Feito por Antônio Müller Brugago

package attquizshow;

import java.util.Scanner;

public class quizzzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int  r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11;
		//essas são as variaveis, tem a função de determinar o tipo das respostas das perguntas
		
		
		 System.out.println("Bem vindo ao quiz do Tonhão, você deve responder as perguntas, a cada pergunta que você acerta você ganha mais, se você errar você perde tudo, e você pode escolher para desistir, se você desisitir você perde mas fica com a quantia de dinheiro que ganhou, boa sorte ");
		 System.out.println("Qual bicho transmite a doença de Chagas? 1)Abelha, 2)Barata, 3)Pulga, 4)Barbeiro ");
		 r1 = sc.nextInt();
		 //usei o system.out.println para fazer as perguntas
		 //com o r1 = sc.nextInt(); você consegue responder as perguntas
		 if(r1 == 4 ) {
			 System.out.println("A resposta está correta você está com 1000 reais no total ");
			 //usei o if == 4 para que se a resposta fosse 4 aparece a mensagem que você acertou e que você podia continuar jogando
		 }else {
			 System.out.println("A resposta está errada a certa é 4)Barbeiro, mais sorte na próxima ");
			  System.exit(0);
			  //usei o else para caso não fosse a resposta igual a 4 o código mandasse a mensagem falando que estava errado e parava o código
		 }
		 
		 System.out.println("Qual é o coletivo de cães? 1)Matilha, 2)Rebanho, 3)Alcateia, 4)Manada, para desistir digite 5 ");
		 r2 = sc.nextInt();
		 if(r2 == 5) {
			 System.out.println("Você escolheu desistir, então vocÊ ganhou 1000 reais no total parabéns ");
			//Usei outro if para que caso a pessoa queira desistir ela possa, digitando 5
			  System.exit(0);
			//O system.ext(0) tem a função de parar o código, então caso a pessoa escolhesse 5 o código para
		 }
		 if(r2 == 1 ) {
			 System.out.println("A resposta está correta você esta com 2000 reais no total ");
		 }else {
			 System.out.println("A resposta está errada a certa é 1)Matilha ");
			  System.exit(0);
			//O system.ext(0) tem a função de parar o código, então caso a pessoa escolhesse uma resposta diferente de 1 o código para
		 }
		 
		 
		 System.out.println("A compensação por perda é chamada de... 1)Défict, 2)Indenização, 3)Indexação, 4)Indébito, para desistir digite 5 ");
		 r3 = sc.nextInt();
		 if(r3 == 5) {
			 System.out.println("Você escolheu desistir, então vocÊ ganhou 2000 reais no total parabéns ");
			  System.exit(0);
		 }
		 if(r3 == 2 ) {
			 System.out.println("A resposta está correta você esta com 3000 reais no total ");
		 }else {
			 System.out.println("A resposta está errada a certa é 2)Indenização ");
			  System.exit(0);
		 }
		 
		 
		 
		 System.out.println("Qual montanha se localiza entre a fronteira do Tibet com o Nepal? 1)Monte Everest, 2)Monte Carlo, 3)Monte Fuji, 4)Monte Branco, para desistir digite 5 ");
		 r3 = sc.nextInt();
		 if(r3 == 5) {
			 System.out.println("Você escolheu desistir, então vocÊ ganhou 3000 reais no total parabéns ");
			  System.exit(0);
		 }
		 if(r3 == 1 ) {
			 System.out.println("A resposta está correta, você esta com 5000 reais ");
		 }else {
			 System.out.println("A resposta está errada a certa é 1)Monte Evereste ");
			  System.exit(0);
		 }
		
		 
		 
		 System.out.println("Qual o nome se dá à purificação por meio da água? 1)Abolição, 2)Abnegação, 3)Ablução, 4)Abrupção, para desistir digite 5 ");
		 r4 = sc.nextInt();
		 if(r4 == 5) {
			 System.out.println("Você escolheu desistir, então vocÊ ganhou 5000 reais no total parabéns ");
			  System.exit(0);
		 }
		 if(r4 == 3 ) {
			 System.out.println("A resposta está correta, você está com 10.000 reais no total ");
		 }else {
			 System.out.println("A resposta está errada a certa é 3)Ablução ");
			  System.exit(0);
		 }
		 
		 
		 System.out.println("Qual foi o último presidente do período da ditadura militar do Brasil ? 1)Costa e Silva, 2)João Figueiredo, 3)Ernesto Geisel, 4)Emílio Édice, para desistir digite 5 ");
		 r4 = sc.nextInt();
		 if(r4 == 5) {
			 System.out.println("Você escolheu desistir, então você ganhou 10.000 reais no total parabéns ");
			  System.exit(0);
		 }
		 if(r4 == 2 ) {
			 System.out.println("A resposta está correta você está com 15.000 reais no total parabéns ");
		 }else {
			 System.out.println("A resposta está errada a certa é 2)João Figueiredo ");
			  System.exit(0);
		 }
		 
		 
		 
		 System.out.println("O adjetivo venoso está relacionado a: ? 1)Vela, 2)Vento, 3)Vênia, 4)Veia, para desistir digite 5 ");
		 r5 = sc.nextInt();
		 if(r5 == 5) {
			 System.out.println("Você escolheu desistir, então você ganhou 15.000 reais no total parabéns ");
			  System.exit(0);
		 }
		 if(r5 == 4 ) {
			 System.out.println("A resposta está correta você está com 20.000 reais no total parabéns ");
		 }else {
			 System.out.println("A resposta está errada a certa é 4)Veia ");
			  System.exit(0);
		 }
		 
		 
		 System.out.println("Em que parte do corpo se encontra a epiglote ? 1)Estômago, 2)Pâncreas, 3)Rim, 4)Boca, para desistir digite 5 ");
		 r6 = sc.nextInt();
		 if(r6 == 5) {
			 System.out.println("Você escolheu desistir, então você ganhou 20.000 reais no total parabéns ");
			  System.exit(0);
		 }
		 if(r6 == 4 ) {
			 System.out.println("A resposta está correta você está com 30.000 reais no total parabéns ");
		 }else {
			 System.out.println("A resposta está errada a certa é 4)Boca ");
			  System.exit(0);
		 }
		 
		 System.out.println("Em que país nasceu Carmem Miranda ? 1)Brasil, 2)Espanha, 3)Portugal, 4)Argentina, para desistir digite 5 ");
		 r7 = sc.nextInt();
		 if(r7 == 5) {
			 System.out.println("Você escolheu desistir, então você ganhou 30.000 reais no total parabéns ");
			  System.exit(0);
		 }
		 if(r7 == 3 ) {
			 System.out.println("A resposta está correta você está com 50.000 reais no total parabéns ");
		 }else {
			 System.out.println("A resposta está errada a certa é 3)Portugal ");
			  System.exit(0);
		 }
		 
		 
		 System.out.println("A tecnologia Bluetooth tirou seu nome de: 1)Um rio, 2)Um rei, 3)Um general, 4)Um castelo, para desistir digite 5 ");
		 r8 = sc.nextInt();
		 if(r8 == 5) {
			 System.out.println("Você escolheu desistir, então você ganhou 50.000 reais no total parabéns ");
			  System.exit(0);
		 }
		 if(r8 == 2 ) {
			 System.out.println("A resposta está correta você está com 100.000 reais no total parabéns ");
		 }else {
			 System.out.println("A resposta está errada a certa é 2)Um rei ");
			  System.exit(0);
		 }
		 
		 System.out.println("Se um exército está sem munição ele é um exército: 1)Desarrazoado, 2)Desapercebido, 3)Desalinhado, 4)Desarranchado, para desistir digite 5 ");
		 r9 = sc.nextInt();
		 if(r9 == 5) {
			 System.out.println("Você escolheu desistir, então você ganhou 100.000 reais no total parabéns ");
			  System.exit(0);
		 }
		 if(r9 == 2 ) {
			 System.out.println("A resposta está correta você está com 250.000 reais no total parabéns ");
		 }else {
			 System.out.println("A resposta está errada a certa é 2)Desapercebido ");
			  System.exit(0);
		 }
		 
		 System.out.println("Aos 85 anos de idade, ele desfilou pela badalada estilista Guo Pei em Paris no início de 2017. Estamos falando de qual modelo? 1)Carmen Dell' Orefice, 2)Maye Musk, 3)Jenni Rhodes, 4)Jan de Villeneuve, para desistir digite 5 ");
		 r10 = sc.nextInt();
		 if(r10 == 5) {
			 System.out.println("Você escolheu desistir, então você ganhou 250.000 reais no total parabéns ");
			  System.exit(0);
		 }
		 if(r10 == 1 ) {
			 System.out.println("A resposta está correta você está com 500.000 reais no total parabéns ");
		 }else {
			 System.out.println("A resposta está errada a certa é 1)Carmen Dell' Orefice ");
			  System.exit(0);
		 }
		 
		 System.out.println("ESTAMOS AGORA NA PERGUNTA DO MILHÃO!!!");
		 System.out.println("Quando o galã de Hollywood Antônio Müller Brugnago nasceu? 1)30/08/2005, 2)23/06/2004, 3)06/03/2005, 4)21/09/2004, para desistir digite 5 ");
		 r11 = sc.nextInt();
		 if(r11 == 5) {
			 System.out.println("Você escolheu desistir, então você ganhou 500.000 reais no total parabéns ");
			  System.exit(0);
		 }
		 if(r11 == 1 ) {
			 System.out.println("A resposta está correta você está com 1.000.000 de reais no total parabéns você é um MILIONÁRIO");
		 }else {
			 System.out.println("A resposta está errada a certa é 4)21/09/2004 ");
			  System.exit(0);
		 }
		 
		
		sc.close();
		//Serviu para finalizar o código, ou seja para ele parar.

	}		

	}


