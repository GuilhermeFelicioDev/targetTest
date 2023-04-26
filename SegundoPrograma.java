public class SegundoPrograma {
    
    public static void main(String[] args){
        //num recebe o valor a ser checado na sequência de fibonacci
        int num = 6765;
        int fibonacci=0, fibonacciAnt=0, fibonacciPos=1;
        while(fibonacci<num){
            fibonacci = fibonacciAnt+fibonacciPos;
            fibonacciAnt=fibonacciPos;
            fibonacciPos=fibonacci;
        }
        if(fibonacci == num){
            System.out.printf("O número "+num+" pertence a Fibonacci!");
        }
        else
            System.out.printf("O número "+num+" não pertence a Fibonacci!");      
      }    
}
