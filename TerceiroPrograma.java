import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TerceiroPrograma {
    public static void main(String[] args) {
            JSONObject jsonObj = new JSONObject();
            JSONParser jsonPar = new JSONParser();
            double valorTotal=0, valor=0,media=0,valorMaior=0,valorMenor=0;
            JSONArray listaDias = new JSONArray();
            int count=0, dias=0;
            try {
                listaDias =  (JSONArray) jsonPar.parse(new FileReader("dados.json"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
            for(int i=0; i<listaDias.size();i++){
                jsonObj = (JSONObject) listaDias.get(i);
                valor = (double) jsonObj.get("valor");
                if(valor != 0){
                    count++;
                    if(valor > valorMaior)  
                        valorMaior = valor;
                    if(valorMenor == 0){
                        valorMenor = valor;
                    }else if(valor < valorMenor)
                            valorMenor = valor;      
                    valorTotal = valorTotal + valor;
                }
            }
            media = valor/count;
            for(int i=0; i<listaDias.size();i++){
                jsonObj = (JSONObject) listaDias.get(i);
                valor = (double) jsonObj.get("valor");
                if(valor>media)
                    dias++;
            }
            System.out.printf("Menor faturamento R$ %.2f.",valorMenor);
            System.out.printf(System.lineSeparator()+"Maior Faturamento R$ %.2f.",valorMaior);
            System.out.printf("\nTivemos neste mês "+dias+" dias que o faturamento foi maior que a média mensal de R$ %.2f!",media);	
    }
}
