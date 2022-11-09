package laboratorio.excepciones;

import java.io.IOException;

public class MenorException
{
    static boolean menor10 (double n) throws IOException
    {
        if (n < 10)
        {
            throw new IOException();
        }
        return false;
    }
}
