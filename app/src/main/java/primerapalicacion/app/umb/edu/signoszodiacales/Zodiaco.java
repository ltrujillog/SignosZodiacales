package primerapalicacion.app.umb.edu.signoszodiacales;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.security.acl.Group;

public class Zodiaco extends AppCompatActivity {

    private RadioButton opc1, opc2, opc3, opc4, opc5, opc6, opc7, opc8, opc9, opc10, opc11, opc12;
    private RadioGroup contenedor;
    private EditText n_dia;
    private TextView resultado, msj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiaco);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        contenedor = (RadioGroup)findViewById(R.id.grupo_opc);
        n_dia = (EditText) findViewById(R.id.num_dia);
        resultado = (TextView) findViewById(R.id.resul_signo);
        msj = (TextView)findViewById(R.id.mensaje);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View view){
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_zodiaco, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onRadioButtonClicked(View view) {
        //contenedor.getCheckedRadioButtonId();
        String valor=n_dia.getText().toString();
        int nd=Integer.parseInt(valor);
        String resul=resultado.getText().toString();


        boolean opcion = ((RadioButton)view).isChecked();

        switch (view.getId()) {

            case R.id.ene:
                if (opcion) {
                    mostrarOpcion(true);
                    if (nd >= 20) {
                        resul = "ACUARIO";
                    } else {
                        resul = "CAPRICORNIO";
                    }
                }
                break;
            case R.id.feb:
                if (opcion) {
                    mostrarOpcion(true);
                    if (nd >= 19) {
                        resul = "PISCIS";
                    } else {
                        resul = "ACUARIO";
                    }
                }

                break;
            case R.id.mar:
                if (opcion) {
                    mostrarOpcion(true);
                    if (nd >= 21) {
                        resul = "ARIES";
                    } else {
                        resul = "PISCIS";
                    }
                }
                resultado.setText(resul);
                break;
            case R.id.abr:
                if (opcion) {
                    mostrarOpcion(true);
                    if (nd > 20) {
                        resul = "TAURO";
                    } else {
                        resul = "ARIES";
                    }
                }
                break;
            case R.id.may:
                if (opcion) {
                    mostrarOpcion(true);
                    if (nd > 21) {
                        resul = "GEMINIS";
                    } else {
                        resul = "TAURO";
                    }
                }
                break;
            case R.id.jun:
                if (opcion) {
                    mostrarOpcion(true);
                    if (nd > 21) {
                        resul = "CANCER";
                        mostrarOpcion(true);
                    } else {
                        resul = "GEMINIS";
                    }
                }
                break;
            case R.id.jul:
                if (opcion) {
                    mostrarOpcion(true);
                    if (nd > 23) {
                        resul = "LEO";
                    } else {
                        resul = "CANCER";
                        mostrarOpcion(true);
                    }
                }
                break;
            case R.id.ago:
                if (opcion) {
                    mostrarOpcion(true);
                    if (nd > 23) {
                        resul = "VIRGO";
                    } else {
                        resul = "LEO";
                    }
                }
                break;
            case R.id.sep:
                if (opcion) {
                    mostrarOpcion(true);
                    if (nd > 23) {
                        resul = "LIBRA";
                        mostrarOpcion(true);
                    } else {
                        resul = "VIRGO";
                    }
                }
                break;
            case R.id.oct:
                if (opcion) {
                    mostrarOpcion(true);
                    if (nd > 23) {
                        resul = "ESCORPIO";
                        mostrarOpcion(true);
                    } else {
                        resul = "LIBRA";
                    }
                }
                break;
            case R.id.nov:
                if (opcion) {
                    mostrarOpcion(true);
                    if (nd > 22) {
                        resul = "SAGITARIO";
                        mostrarOpcion(true);
                    } else {
                        resul = "ESCORPIO";
                        mostrarOpcion(true);
                    }
                }
                break;
            case R.id.dic:
                if (opcion) {
                    mostrarOpcion(true);
                    if (nd > 22) {
                        resul = "CAPRICORNIO";
                        mostrarOpcion(true);
                    } else {
                        resul = "SAGITARIO";
                    }
                }
                break;

        }
        resultado.setText("Su signo es:"+resul);
        msj.setText("Su signo es:"+resul);


    }
    private void mostrarOpcion(boolean b) {
        contenedor.setVisibility(b ? View.VISIBLE : View.GONE);
    }
}
