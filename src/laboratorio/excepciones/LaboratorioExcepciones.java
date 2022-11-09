package laboratorio.excepciones;

import java.io.IOException;
import javax.swing.JOptionPane;

public class LaboratorioExcepciones
{
    public static void main(String args[])
    {
        //formatoNumero();
        //formatoNumeroCorregido();
        //desborde();
        //aritmetico();
        JOptionPane.showMessageDialog(null ,division(JOptionPane.showInputDialog("Digite un numero entero"), JOptionPane.showInputDialog("Digite el divisor")));
    }   

    //1. excepción sin tratar 
    public static void formatoNumero()
    {
        int numero;
        String cadena="  1";
    	numero = Integer.parseInt(cadena);
    }
    
    //2. excepción tratada
    public static void formatoNumeroCorregido()
    { 
        int numero;
        String cadena="  1";
 	try
        {
            numero = Integer.parseInt(cadena);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("No es un número, es una cadena de texto." + ex.getMessage());
 	}
    }
    
    //3.
    public static void desborde()
    {
        int v[] = new int[3];
	try
        {
            for(int i = 0; i < 5; i++)
            {
                v[i] = i;
            }
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("El tamaño del vector es diferente " + ex.getMessage());
        }
    }
    
    //4.
    public static void aritmetico()
    {
        int numero = 5, resultado;
        try
        {
            resultado = numero / 0;
        }
        catch(RuntimeException ex)
        {
            System.out.println("El numero no es divisible en 0 " + ex.getMessage());
        }
    }
    
    //5. Excepcion propia
    public static double division(String entero, String divisor)
    {
        double en = 0;
        double div = 0;
        double resul = 0;
        try
        {
            en = Integer.parseInt(entero);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("El entero no es un entero." + ex.getMessage());
        }
        try
        {
            div = Integer.parseInt(divisor);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("El divisor no es un entero." + ex.getMessage());
        }
        try
        {
            resul = en / div;
            MenorException.menor10(resul);
        }
        catch(IOException ex)
        {
            System.out.println("El resultado es menor a 10");
        }
        try
        {
            resul = en / div;
        }
        catch(ArithmeticException ex)
        {
            System.out.println("No se puede dividir entre 0." + ex.getMessage());
        }
        return resul;
    }    
}