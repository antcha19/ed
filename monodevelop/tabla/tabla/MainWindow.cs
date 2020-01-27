using System;
using Gtk;
using tabla;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();

        Panel panel = new Panel(vBox);

        /*
        //variables
        Table table = new Table(3, 3, true);
        int index = 0;

        for (int row = 0; row < 3; row++) 
            for(int column = 0; column<3; column++)
            {

                index++;
                Button button = new Button();
                table.Attach(button, (uint)column, (uint)column + 1, (uint)row, (uint)row + 1);

                //añade una etiqueta un nombre a los botones
                //button.Label = "Button";

                button.Label = index.ToString();
                button.Clicked +=delegate 
                {
                    //dar color a los botones
                    button.ModifyBg(StateType.Normal, new Gdk.Color(100, 200, 250));    

                };
            }
        //añade a la tabla los botones
        vBox.Add(table);
        //crea una tabla con los botones
        table.ShowAll();*/
        }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}
