package Classes;


import java.math.BigDecimal;
import java.text.NumberFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class converte {
    public String ConvMoeda(String valTela)
      {
          BigDecimal valor = new BigDecimal(valTela);
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();  
        String formatado = nf.format(valor);
        
        return formatado;
        
      }
    
}
