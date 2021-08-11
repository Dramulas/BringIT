package com.example.bringit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity
{

    private ImageView bakery,vegetable;
    private ImageView meat,dairy;
    private ImageView soda,cleaning;
    private ImageView cosmetics,pet;

    private Button LogoutBtn, CheckOrdersBtn, maintainProductsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);
        maintainProductsBtn = (Button) findViewById(R.id.maintain_btn);



        maintainProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeActivity.class);
                intent.putExtra("Admin", "Admin");
                startActivity(intent);

            }
        });



        LogoutBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminNewOrdersActivity.class);
                startActivity(intent);

            }
        });

        bakery=(ImageView) findViewById(R.id.Bakery_s);
        vegetable=(ImageView) findViewById(R.id.Vegetable_s);

        meat=(ImageView) findViewById(R.id.Meat_s);
        dairy=(ImageView) findViewById(R.id.Dairy_s);

        soda=(ImageView) findViewById(R.id.Soda_s);
        cleaning=(ImageView) findViewById(R.id.Cleaning_s);

        cosmetics=(ImageView) findViewById(R.id.Cosmetics_s);
        pet=(ImageView) findViewById(R.id.Pet_s);



        bakery.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category", "Bakery");
                startActivity(intent);

            }
        });



        vegetable.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category", "Vegetable");
                startActivity(intent);

            }
        });



        meat.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category", "Meat");
                startActivity(intent);

            }
        });



        dairy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category", "Dairy");
                startActivity(intent);

            }
        });



        soda.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category", "Soda");
                startActivity(intent);

            }
        });



        cleaning.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category", "Cleaning");
                startActivity(intent);

            }
        });


        cosmetics.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category", "Cosmetics");
                startActivity(intent);

            }
        });


        pet.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category", "Pet");
                startActivity(intent);

            }
        });







    }
}