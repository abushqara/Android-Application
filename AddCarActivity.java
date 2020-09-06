package com.example.carwatch;






import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

@SuppressLint("NewApi")
public class AddCarActivity extends Activity {

    EditText txtCompany, txtModel, txtYear, txtEngine, txtHorsePower, txtCondition, txtPhone;
    CarsDB db;
    Intent h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);

        initialize();
    }

    private void initialize() {
        db = new CarsDB(this);
        txtCompany = (EditText)findViewById(R.id.txtCompany);
        txtModel = (EditText)findViewById(R.id.txtModel);
        txtYear = (EditText)findViewById(R.id.txtYear);
        txtEngine = (EditText)findViewById(R.id.txtEngine);
        txtHorsePower = (EditText)findViewById(R.id.txtHorsePower);
        txtCondition = (EditText)findViewById(R.id.txtCondition);
        txtPhone = (EditText)findViewById(R.id.txtPhone);
    }

    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
	@SuppressLint("NewApi")
	public void addCar()
    {
        String company, model, year, engine, horsePower, condition, phone;
        company = txtCompany.getText().toString();
        model = txtModel.getText().toString();
        year = txtYear.getText().toString();
        engine = txtEngine.getText().toString();
        horsePower = txtHorsePower.getText().toString();
        condition = txtCondition.getText().toString();
        phone = txtPhone.getText().toString();

        if (company != null && !company.trim().isEmpty() &&
            model != null && !model.trim().isEmpty() &&
            year != null && !year.trim().isEmpty() &&
            engine != null && !engine.trim().isEmpty() &&
            horsePower != null && !horsePower.trim().isEmpty() &&
            condition != null && !condition.trim().isEmpty() &&
            phone != null && !phone.trim().isEmpty())
        {
            Car car = new Car();
            car.setCompany(company);
            car.setModel(model);
            car.setYear(year);
            car.setEngine(Double.parseDouble(engine));
            car.setHorsePower(Integer.parseInt(horsePower));
            car.setCompany(condition);
            car.setPhone(phone);

            db.addCar(car);
        }
        else
        {
            Toast.makeText(AddCarActivity.this, "Empty or incorrect details!", Toast.LENGTH_SHORT).show();
        }
        
        
        
    }
    public void gotopanel(View view)
    
    {
    	
    	h  = new Intent(this, PanelActivity.class);
        startActivity(h);       
    }
    
    
}
