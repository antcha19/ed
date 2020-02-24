using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{

    int contador;
    float numero1;
    float numero2;
    String opcion;
    float contadorigual;
    float result;

    operaciones resultado = new operaciones();


    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();

      
        bvaciar.ModifyBg(StateType.Normal, new Gdk.Color(221, 159, 159));
        bdividir.ModifyBg(StateType.Normal, new Gdk.Color(180, 118, 60));
        bmulti.ModifyBg(StateType.Normal, new Gdk.Color(180, 118, 60));
        bresta.ModifyBg(StateType.Normal, new Gdk.Color(180, 118, 60));
        bsuma.ModifyBg(StateType.Normal, new Gdk.Color(180, 118, 60));
        bigual.ModifyBg(StateType.Normal, new Gdk.Color(180, 118, 60));
        // color de la pantalla
        ModifyBg(StateType.Normal, new Gdk.Color(8, 8, 8));
        //label1.ModifyBg(StateType.Normal, new Gdk.Color(231, 231, 231));


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
        String display = Pantalla.Text.ToString();
        if (display.Contains(","))
        {
            contador = 0;
        }

    }
     
    //boton dividir
    protected void OnBdividirClicked(object sender, EventArgs e)
    {
        numero1 = Convert.ToSingle(Pantalla.Text);
        String display = Pantalla.Text.ToString();
        //Pantalla.InsertText(display + " / ");
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        opcion = "/";
    }
   
    //boton multiplicacion
    protected void OnBmultiClicked(object sender, EventArgs e)
    {
        numero1 = Convert.ToSingle(Pantalla.Text);
        String display = Pantalla.Text.ToString();
       
        //Pantalla.InsertText(display + " * ");
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        opcion = "*";
    }

    //boton resta
    protected void OnBrestaClicked(object sender, EventArgs e)
    {
        numero1 = Convert.ToSingle(Pantalla.Text);
        String display = Pantalla.Text.ToString();
       
        //Pantalla.InsertText(display + " - ");
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        opcion = "-";
    }

    //boton suma
    protected void OnBsumaClicked(object sender, EventArgs e)
    {
        numero1 = Convert.ToSingle(Pantalla.Text);
        //String display = Pantalla.Text.ToString();
       
        //Pantalla.InsertText(display + " + ");
        //limpia la pantalla
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        opcion = "+";


    }

    //boton igual
    protected void OnBigualClicked(object sender, EventArgs e)
    {
        numero2 = Convert.ToSingle(Pantalla.Text);
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);



        switch (opcion)
        {
            case "+":
         

                result = resultado.suma(numero1, numero2);
                this.Pantalla.Text = (Convert.ToString(result));
                contadorigual++;
                break;


            case "-":
                result = resultado.resta(numero1, numero2);
                this.Pantalla.Text = (Convert.ToString(result));
                contadorigual++;
                break;



            case "*":
                result = resultado.multiplicacion(numero1, numero2);
                this.Pantalla.Text = (Convert.ToString(result));
                contadorigual++;
                break;


            case "/":
                result = resultado.division(numero1, numero2);
                this.Pantalla.Text = (Convert.ToString(result));
                contadorigual++;
                break;

                 }

            



    }


    //boton punto(.)
    protected void OnBpuntoClicked(object sender, EventArgs e)
    {
        if(contador == 0)
        {
            String display = Pantalla.Text.ToString();
            Pantalla.DeleteText(0, Pantalla.Text.Length);
            Pantalla.InsertText(display + ",");
            contador++;
        }
       
    }

    //cero
    protected void OnBceroClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0,Pantalla.Text.Length);
        Pantalla.InsertText(display + " 0 ");
    }
    //uno
    protected void OnBunoClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display +"1");
    }
    //dos
    protected void OnBdosClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display +"2");
    }
    //tres
    protected void OnBtresClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display +"3");
    }
    //cuatro
    protected void OnBcuatroClicked(object sender, EventArgs e)
    {
        String display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(display +"4");
    }
    //cinco
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
