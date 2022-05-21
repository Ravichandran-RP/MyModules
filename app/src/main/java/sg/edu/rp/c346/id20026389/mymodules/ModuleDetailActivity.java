package sg.edu.rp.c346.id20026389.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView modcode;
    TextView modname;
    TextView modyear;
    TextView modsem;
    TextView modcredit;
    TextView modvenue;
    Button btnBack;
    ImageView displayImage;
    TextView aboutmod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        modcode=findViewById(R.id.textViewModCode);
        modname=findViewById(R.id.textViewModName);
        modyear=findViewById(R.id.textViewYear);
        modsem=findViewById(R.id.textViewSem);
        modcredit=findViewById(R.id.textViewCredit);
        modvenue=findViewById(R.id.textViewVenue);
        btnBack=findViewById(R.id.buttonBack);
        displayImage=findViewById(R.id.imageViewDisplay);
        aboutmod=findViewById(R.id.textViewAbout);

        Intent intentReceived = getIntent();
        String module=intentReceived.getStringExtra("module");
        if(module.equalsIgnoreCase("C346")){
            String imagename = "programming";
            int imageresource = getResources().getIdentifier(imagename, "drawable",this.getPackageName());
            Drawable res=getResources().getDrawable(imageresource);
            displayImage.setImageDrawable(res);
            modcode.setText("Module Code: "+module);
            modname.setText("Module Name: Android Programming");
            modyear.setText("Academic Year: 2022");
            modsem.setText("Semester: 1");
            modcredit.setText("Module Credit: 4");
            modvenue.setText("Venue: E62E");
            aboutmod.setText("In this module, students will learn the basics of creating Android Applications. " +
                    "They will learn about user interface implementation issues such as layout, " +
                    "notifications and dialogues as well as the logic and data management (databases, " +
                    "services, GPS, multi-threading, etc.) using the Java programming language.");
        }
        else if(module.equalsIgnoreCase("C322")){
            String imagename = "datacenter";
            int imageresource = getResources().getIdentifier(imagename, "drawable",this.getPackageName());
            Drawable res=getResources().getDrawable(imageresource);
            displayImage.setImageDrawable(res);
            modcode.setText("Module Code: "+module);
            modname.setText("Module Name: Data Centre and Cloud Management");
            modyear.setText("Academic Year: 2022");
            modsem.setText("Semester: 1");
            modcredit.setText("Module Credit: 4");
            modvenue.setText("Venue: E61H");
            aboutmod.setText("Students will develop competencies required to support and administer data centre and cloud computing services. " +
                    "The training includes impact assessment of governance, risk and compliance (GRC) in the cloud computing environment, " +
                    "and students will also study cloud computing orchestration, service accounting and service cataloguing. " +
                    "The module also prepares students to be industry ready for job opportunities such as system administrators in " +
                    "enterprise data centres or hosting service providers and as cloud computing end-users.");

        }
        else if(module.equalsIgnoreCase("C382")){
            String imagename = "itservice";
            int imageresource = getResources().getIdentifier(imagename, "drawable",this.getPackageName());
            Drawable res=getResources().getDrawable(imageresource);
            displayImage.setImageDrawable(res);
            modcode.setText("Module Code: "+module);
            modname.setText("Module Name: IT Service Delivery");
            modyear.setText("Academic Year: 2022");
            modsem.setText("Semester: 1");
            modcredit.setText("Module Credit: 4");
            modvenue.setText("Venue: E62B");
            aboutmod.setText("This module provides an overview of issues associated with managing and measuring service delivery. " +
                    "Using different scenarios, students will select a deployment model(s) to meet business requirements considering cost " +
                    "and performance. They will be exposed to key performance indicators (KPIs) on service level agreements (SLAs) " +
                    "that ensure stipulated levels of service quality and availability. These modules will also cover the availability, " +
                    "business continuity and financial considerations involved in service delivery.");
        }
        else if(module.equalsIgnoreCase("C300")){
            String imagename = "fyp";
            int imageresource = getResources().getIdentifier(imagename, "drawable",this.getPackageName());
            Drawable res=getResources().getDrawable(imageresource);
            displayImage.setImageDrawable(res);
            modcode.setText("Module Code: "+module);
            modname.setText("Module Name: Final Year Project");
            modyear.setText("Academic Year: 2022");
            modsem.setText("Semester: 1");
            modcredit.setText("Module Credit: 4");
            modvenue.setText("Venue: W53M");
            aboutmod.setText("In this module, students will be equipped with skills to apply their domain knowledge through a team project " +
                    "to solve a real-world problem."+
                    "Students will apply the five steps in the project management process steps: initiating, planning, " +
                    "executing, monitoring and controlling, and closing to work on a team project. They will use Gantt charts and tools for " +
                    "budgeting and resource planning. There will be milestone checks incorporating supervisor input, with guidance for " +
                    "corrective action if necessary."+ "Students will also learn how to gather and organize data, prepare technical reports " +
                    "and make a presentation pitch to stakeholders. Students will be encouraged to adopt a multidisciplinary approach in the " +
                    "design of their project.");
        }

    }
}