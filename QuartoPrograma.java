import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class QuartoPrograma {
    public static void main(String[] args) {
            JSONObject jsonObj = new JSONObject();
            JSONParser jsonPar = new JSONParser();
            double valorTotal=0, valor=0,percentual=0;
            String estado;
            JSONArray listaEstados = new JSONArray();
            try {
                listaEstados =  (JSONArray) jsonPar.parse(new FileReader("distribuidora.json"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
            for(int i=0; i<listaEstados.size();i++){
                jsonObj = (JSONObject) listaEstados.get(i);
                valor = (double) jsonObj.get("valor");   
                valorTotal = valorTotal + valor;
                }
            for(int i=0; i<listaEstados.size();i++){
                jsonObj = (JSONObject) listaEstados.get(i);
                estado = (String) jsonObj.get("Estado");
                valor = (double) jsonObj.get("valor");   
                percentual = (valor*100)/valorTotal;
                if(estado.equalsIgnoreCase("outros"))
                    System.out.printf(" Os demais estados contribuiram com %.2f %% do faturamento mensal da distribuidora!",percentual);
                else    
                    System.out.printf(" O estado de "+estado+" contribuiu com %.2f %% do faturamento mensal da distribuidora! \n",percentual);
                }   	
    }
}
