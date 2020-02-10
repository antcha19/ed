using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        bvaciar.ModifyBg(StateType.Normal, new Gdk.Color(221, 159, 159));
        
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    //Boton vaciar
    protected void OnBvaciarClicked(object sender, EventArgs e)
    {
        Pantalla.DeleteText(0,Pantalla.Text.Length);
     
    }


    //boton  borrar solo un numero
    protected void OnBcClicked(object sender, EventArgs e)
    {

        Pantalla.DeleteText( Pantalla.Text.Length-1, Pantalla.Text.Length);

    }
     
    //boton dividir
    protected void OnBdividirClicked(object sender, EventArgs e)
    {
    }
   
    //boton multiplicacion
    protected void OnBmultiClicked(object sender, EventArgs e)
    {
    }

    //boton resta
    protected void OnBrestaClicked(object sender, EventArgs e)
    {
    }

    //boton igual
    protected void OnBigualClicked(object sender, EventArgs e)
    {
       
    }

    //boton suma
    protected void OnBsumaClicked(object sender, EventArgs e)
    {
    }

    protected void OnBpuntoClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + " . ");
    }


    protected void OnBceroClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0,Pantalla.Text.Length);
        Pantalla.InsertText(display + " 0 ");
    }

    protected void OnBunoClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display +"1");
    }

    protected void OnBdosClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display +"2");
    }

    protected void OnBtresClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display +"3");
    }

    protected void OnBcuatroClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display +"4");
    }

    protected void OnBcincoClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display +"5");
    }

    protected void OnBseisClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display +"6");
    }

    protected void OnBsieteClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "7");
    }

    protected void OnBochoClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "8");
    }

    protected void OnBnueveClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display + "9");
    }

   
}
