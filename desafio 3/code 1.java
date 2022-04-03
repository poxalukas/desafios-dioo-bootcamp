//Desafio
//        Crie um programa onde você receberá valores inteiros não negativos como entrada.
//
//        Ordene estes valores de acordo com o seguinte critério:
//
//        Primeiro os Pares
//        Depois os Ímpares
//        Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.
//
//        Entrada
//        A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.
//
//        Saída
//        Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
//
//
import java.util.Scanner;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int i,j,aux,count=0;
        int vetor[]=new int[n];


        for(i=0;i<n;i++){
            vetor[i]= input.nextInt();
            if(vetor[i]%2 ==0) {
                count++;
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(vetor[i]<vetor[j]){
                    aux=vetor[i];
                    vetor[i]=vetor[j];
                    vetor[j]=aux;
                }
            }
        }

        for(i=0;i<n;i++){
            if(vetor[i]%2==0) {
                System.out.println(vetor[i]);
            }
        }
        for(i=n-1;i>=0;i--){
            if(vetor[i]%2 != 0){
                System.out.println(vetor[i]);
            }
        }


    }
}