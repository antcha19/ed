using System;
using System.Collections.Generic;
using Gtk;


namespace tabla
{
    public class Bombo
    {
        //crea una lista
        private IList<int> bolas = new List<int>();
        private Random random = new Random();

        public Bombo ()
        {
            for (int bola = 1; bola <= 90; bola++)
                bolas.Add(bola);
        }

            public int sacarBola()
            {
            int indexAleatorio = random.Next(bolas.Count);
            int bola = bolas[indexAleatorio];
            bolas.RemoveAt(indexAleatorio);
            return bola;
        }
    }
}