using System;
using Gtk;

namespace tabla
{
    public class Panel
    {

        public Panel (VBox vBox)
        {

            //variables
            Table table = new Table(10, 9, true);
            int index = 0;

            for (int row = 0; row < 10; row++)
                for (int column = 0; column < 9; column++)
                {

                    index++;
                    Button button = new Button();
                    table.Attach(button, (uint)column, (uint)column + 1, (uint)row, (uint)row + 1);

                    //añade una etiqueta un nombre a los botones
                    //button.Label = "Button";

                    button.Label = index.ToString();
                    button.Clicked += delegate
                    {
                        //dar color a los botones
                        button.ModifyBg(StateType.Normal, new Gdk.Color(100, 200, 250));

                    };
                }
            //añade a la tabla los botones
            vBox.Add(table);
            //crea una tabla con los botones
            table.ShowAll();
        
        }
    }
}