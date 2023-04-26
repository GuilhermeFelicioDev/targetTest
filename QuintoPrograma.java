public class QuintoPrograma {
    public static void main(String[] args) throws Exception {
        String texto = "casa1 casa2 casa3";
        char linha[];
        char swap;
        linha= texto.toCharArray();
        int j = linha.length-1;
            for(int i=0;i<linha.length/2;i++){
                swap = linha[i];
                linha[i] = linha[j];
                linha[j] = swap;
                j--;
            }
        System.out.println("Texto: "+System.lineSeparator()+texto);
        System.out.println("Texto invertido: ");
        System.out.println(linha);
    }
}
