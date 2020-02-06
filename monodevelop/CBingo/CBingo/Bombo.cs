using System;
using System.Collections.Generic;
using Gtk;

namespace CBingo
{
    public class Bombo
    {
        private IList<int> bolas = new List<int>();
        private Random random = new Random();

        public Bombo()
        {
            for (int bola = 1; bola < 90; bola++)
                bolas.Add(bola);
        }

        public int sacarBola()
        {
            int indexAleatorio = random.Next(1,90);
            int bola = bolas[indexAleatorio];
            return bola;
        }
    }
}