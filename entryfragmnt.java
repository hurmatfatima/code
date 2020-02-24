package com.example.myapplication.entry_fragmnt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.R;

public class entryfragmnt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entryfragmnt);
    }
}

//xml code
<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    tools:context=".entry_fragmnt.entryfragmnt">
    <LinearLayout
        android:padding="5dp"
        android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <de.hdodenhof.circleimageview.CircleImageView
            android:layout_width="match_parent"
            android:layout_height="200dp"
            android:src="@drawable/stdlogo"
            android:padding="30dp"
            android:layout_marginBottom="2dp"
            android:id="@+id/img_std"
            app:civ_border_width="3dp"
            app:civ_border_color="@color/Gray"
            app:civ_circle_background_color="@color/WhiteSmoke"


            android:layout_marginTop="45dp"
            android:clickable="true"
            android:focusable="true"
            android:gravity="bottom|end"
            android:layout_gravity="bottom|end"
            android:backgroundTint="@color/trans"/>



        <com.google.android.material.textfield.TextInputLayout

            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:focusable="true"
            android:focusableInTouchMode="true"
            android:layout_marginTop="2dp"

            >
            <EditText

                android:tooltipText="Enter name"
                android:id="@+id/name"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:ems="10"
                android:hint="Full Name"
                android:inputType="text"
                android:textSize="20sp"
                tools:ignore="HardcodedText" />

        </com.google.android.material.textfield.TextInputLayout>

        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:focusable="true"
            android:focusableInTouchMode="true"
            android:layout_marginTop="2dp"
            >
            <EditText
                android:tooltipText="enter father name"
                android:id="@+id/txt_father"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:ems="10"
                android:hint="Father name"
                android:inputType="text"
                android:textSize="20sp"
                tools:ignore="HardcodedText" />

        </com.google.android.material.textfield.TextInputLayout>
        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:focusable="true"
            android:focusableInTouchMode="true"
            android:layout_marginTop="2dp">

            <EditText
            android:tooltipText="enter address"
                android:id="@+id/address"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:ems="10"
                android:hint="enter address"

                android:textSize="20sp"
                tools:ignore="HardcodedText" />

        </com.google.android.material.textfield.TextInputLayout>

        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:focusable="true"
            android:focusableInTouchMode="true"
            android:layout_marginTop="2dp">

            <EditText
                android:tooltipText="enter mobile no"
                android:id="@+id/phno"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:ems="10"
                android:hint="enter phone no"

                android:textSize="20sp"
                tools:ignore="HardcodedText" />

        </com.google.android.material.textfield.TextInputLayout>
        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:focusable="true"
            android:focusableInTouchMode="true"
            android:layout_marginTop="2dp">

            <EditText
                android:tooltipText="enter email"
                android:id="@+id/email"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:ems="10"
                android:hint="enter email"

                android:textSize="20sp"
                tools:ignore="HardcodedText" />

        </com.google.android.material.textfield.TextInputLayout>
        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:focusable="true"
            android:focusableInTouchMode="true"
            android:layout_marginTop="2dp">

            <EditText
                android:tooltipText="enter Program"
                android:id="@+id/program"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:ems="10"
                android:hint="Enter program"

                android:textSize="20sp"
                tools:ignore="HardcodedText" />

        </com.google.android.material.textfield.TextInputLayout>









        <RadioGroup
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:layout_marginTop="15dp">
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Gender:"
                android:textSize="20sp"></TextView>
            <RadioButton
                android:id="@+id/Atndnt"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Male"
                android:layout_marginLeft="15dp"
                android:textSize="20sp"></RadioButton>
            <RadioButton
                android:id="@+id/admn"
                android:layout_width="wrap_content"
                    android:tooltipText="enter address"
                android:id="@+id/address"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:ems="10"
                android:hint="enter address"

                android:textSize="20sp"
                tools:ignore="HardcodedText" />

        </com.google.android.material.textfield.TextInputLayout>

        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:focusable="true"
            android:focusableInTouchMode="true"
            android:layout_marginTop="2dp">

            <EditText
                android:tooltipText="enter mobile no"
                android:id="@+id/phno"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:ems="10"
                android:hint="enter phone no"

                android:textSize="20sp"
                tools:ignore="HardcodedText" />

        </com.google.android.material.textfield.TextInputLayout>
        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:focusable="true"
            android:focusableInTouchMode="true"
            android:layout_marginTop="2dp">

            <EditText
                android:tooltipText="enter email"
                android:id="@+id/email"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:ems="10"
                android:hint="enter email"

                android:textSize="20sp"
                tools:ignore="HardcodedText" />

        </com.google.android.material.textfield.TextInputLayout>
        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:focusable="true"
            android:focusableInTouchMode="true"
            android:layout_marginTop="2dp">

            <EditText
                android:tooltipText="enter Program"
                android:id="@+id/program"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:ems="10"
                android:hint="Enter program"

                android:textSize="20sp"
                tools:ignore="HardcodedText" />

        </com.google.android.material.textfield.TextInputLayout>









        <RadioGroup
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:layout_marginTop="15dp">
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Gender:"
                android:textSize="20sp"></TextView>
            <RadioButton
                android:id="@+id/Atndnt"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Male"
                android:layout_marginLeft="15dp"
                android:textSize="20sp"></RadioButton>
            <RadioButton
                android:id="@+id/admn"
                android:layout_width="wrap_content"
