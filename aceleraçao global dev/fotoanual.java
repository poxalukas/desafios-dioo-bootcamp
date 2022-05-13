// Desafio
// Uma escola está tentando tirar uma foto anual de todos os alunos. É solicitado que os alunos fiquem em uma única fila em linha em ordem crescente de acordo com a altura. Deixe essa ordenação ser representada pelo array de inteiros esperado onde esperado[i] é a altura esperada do iésimo aluno na fila.

// Você recebe um array inteiro alturas que representa a ordem atual em que os alunos estão. Cada alturas[i] é a altura do i-ésimo aluno na linha (indexado a 0).

// Retorna o número de índices onde alturas[i] != esperado[i].

// Exemplo 1

import java.util.*;
public class Solution{
     
// Abaixo segue um exemplo de código que você pode ou não utilizar

    //função para checar altura
    public static int heightChecker(int[] heights) {
      int result;
      int aux;
      int cont=0;
      int [] auxarray=heights.clone();
      for(int i=0;i<heights.length;i++){
        for(int j=0;j<heights.length-1-i;j++){
          if(heights[j]>heights[j+1]){
            aux=heights[j+1];
            heights[j+1]=heights[j];
            heights[j]=aux;
          }
        }
      }
      for(int i=0;i<heights.length;i++){
        if(heights[i]!=auxarray[i]){
          cont++;
        }
      }

      return cont;


    }

public static void main(String[] args)
{ 
    
    //a classe Scanner auxilia na leitura dos dados de entrada
    Scanner input = new Scanner(System.in);
    
      int tamanho = input.nextInt();
      int[] heights = new int[tamanho];
    
      //preenchendo o array de alturas com as entradas
      for(int i=0;i<tamanho;i++){
         heights[i]= input.nextInt();
        }
    
 
    System.out.println(heightChecker(heights));
}
}