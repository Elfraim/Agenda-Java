package appagenda;

import java.util.Scanner;
public class AgendaSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] Nome= new String[20];
        String[] Sobrenome= new String[20];
        String[] Telefone= new String[20];
        String Nome2= null;
        String Nome3= null;
        int cont=0;
        int i=0;
        
        
        Scanner opcao  = new Scanner(System.in);
        Scanner sair  = new Scanner(System.in);
        Scanner carac  = new Scanner(System.in);
        Scanner edit  = new Scanner(System.in);
        
        int esc= 0;
        boolean Sair=false ;
        int conf;
        
        do {
        	System.out.println("Escolha uma das opções abaixo \n");
            System.out.println("1-  Adiconar Pessoa");
        	System.out.println("2-  Editar Pessoa");
            System.out.println("3-  Remover Pessoa");        	
            System.out.println("Digite a opção desejada e 0 para sair\n");
            
             esc =opcao.nextInt();
            
                
            switch (esc) {
			case 1:
				do{
					System.out.println("escreva Sair para voltar ao menu: \n \n ");
					System.out.println("1-Adicione o Nome do Contato:");
				Nome[cont]=carac.nextLine();
				System.out.println("2-Adicione o Sobrenome do Contato:");
				Sobrenome[cont]=carac.nextLine();
				System.out.println("1-Adicione o Telefone do Contato:");
				Telefone[cont]=carac.nextLine();
				cont++;
				 i= cont;
				System.out.println("Contador"+cont);
				}while(carac.equals("Sair") || carac.equals("sair"));
				break;
			case 2:
				System.out.println("");
				System.out.println("\n\nSua lista de contatos: \n\n");
				for(cont=0;cont < i;cont++) {
					
					System.out.println("Nome:"+Nome[cont]+" \n Sobrenome:"+Sobrenome[cont]+"\nNumero:"+Telefone[cont]);
					}
				System.out.println("2-Digite o Nome do Contato a editar :");
				Nome2=edit.nextLine();
				
				 for(cont=0;cont < i;cont++) {
					
					System.out.println("Nome:"+Nome[cont]+"Sobrenome:"+Sobrenome[cont]+"Numero:"+Telefone[cont]);
					
				      if (Nome[cont].equals(Nome2)) {
				    	
				    		System.out.println("1-Adicione um novo Nome do Contato:");
							Nome[cont]=edit.nextLine();
				    	  System.out.println("2-Adicione o  Sobrenome do Contato:");
							Sobrenome[cont]=edit.nextLine();
							System.out.println("3-Adicione o Telefone do Contato:");
							Telefone[cont]=edit.nextLine();  
				    	   
				      }
				
				      System.out.println("Contador"+cont);}
				break;
			
			case 3:
				System.out.println("\n\n Sua lista de contatos: \n\n");
				for(cont=0;cont < i;cont++) {
					
					System.out.println("Nome:"+Nome[cont]+" \n Sobrenome:"+Sobrenome[cont]+"\nNumero:"+Telefone[cont]);
					}

				System.out.println("\n\n 3-Digite o Nome do Contato a Remover :");
				Nome3=edit.nextLine();
				 for(cont=0;cont < i;cont++) {
				      if (Nome[cont].equals(Nome2)) {
				    	
				    		System.out.println("1-Adicione um novo Nome do Contato:");
							Nome[cont]="";
				    	  System.out.println("2-Adicione o  Sobrenome do Contato:");
							Sobrenome[cont]="";
							System.out.println("3-Adicione o Telefone do Contato:");
							Telefone[cont]="";  
				    	   
				      }
				      }
				break;

			default:
				System.out.println("\n \n A Opção e Invalida: \n\n");
				break;
			} 
            
            if (esc==0) {
            	System.out.println("Voce realmente quer sair?");
            	System.out.println("Digite 1 para sim 0 para não");
            	conf=sair.nextInt();
  	            
            	if (conf==1 ) {
					Sair = true;
				} else {
					Sair=false;
				}
  	            }
       
            
            //        
//        	System.out.println("3-Adicionar Telefone");
//        	System.out.println("2-AdicionarSobrenome");	
        }while(Sair==false);
		
        return;
		
	}

} 
