package edu.liangm2rpi.mentormenteematch;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class architecture_program extends AppCompatActivity {
        //create arraylist selectedItems
        private final ArrayList<String> selectedItems=new ArrayList<>();

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_architecture_program);

            //checkable listview
            ListView chl= findViewById(R.id.checkable_list);
            chl.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

            //declare checkable items
            String[] items={"Architecture","Architectural Sciences","Informatics and Architecture" ,"Lighting"};

            //use array adapter to display checkboxes
            ArrayAdapter<String> adapter= new ArrayAdapter<>(this, R.layout.rowlayout, R.id.txt_lan, items);
            chl.setAdapter(adapter);

            //checkable items operations
            chl.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    //selected item
                    String selectedItem=((TextView)view).getText().toString();
                    if(selectedItems.contains(selectedItem)){
                        selectedItems.remove(selectedItem);//uncheck item
                    }
                    else
                        selectedItems.add(selectedItem);
                }
            });

            //when clicked submit button, use parcelable to pass arraylist selectedItems
            Button submit_Btn = findViewById(R.id.submit_button);
            submit_Btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //(make intent for parcelable- not proper code)
                    //Intent intent = new Intent(architecture_program.this, profile_major.class);
                    //intent.putExtra("Selected_Architecture_Programs", selected_architecture_programs);
                    //startActivity(intent);
                }
            });
        }

    // when clicked on show selected items button the items will appear in textbox
    public void showSelectedItems(View view) {
        StringBuilder items = new StringBuilder();
        for (String item : selectedItems) {
            items.append("-").append(item).append("\n");
        }
        Toast.makeText(this, "You have selected\n" + items, Toast.LENGTH_LONG).show();
    }
}

//Selected_Architecture_Programs class stores arraylist selectedItems into Parcelable
class Selected_Architecture_Programs implements Parcelable {
    //array basics
    private ArrayList<String>selectedItems ;

    // main constructor
    public Selected_Architecture_Programs(ArrayList<String>selectedItems) {
        this.selectedItems = selectedItems;
    }

    // getters
    public ArrayList<String> getItems() {return selectedItems; }

    //write object values to parcel for storage
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.selectedItems);
    }

    private Selected_Architecture_Programs(Parcel parcel) {
        parcel.readList(selectedItems ,String.class.getClassLoader());
    }

    public static final Parcelable.Creator<Selected_Architecture_Programs> CREATOR = new Parcelable.Creator<Selected_Architecture_Programs>() {

        @Override
        public Selected_Architecture_Programs createFromParcel(Parcel parcel) {
            return new Selected_Architecture_Programs(parcel);
        }

        @Override
        public Selected_Architecture_Programs[] newArray(int size) {
            return new Selected_Architecture_Programs[0];
        }
    };
    //return hashcode of object
    public int describeContents() {
        return hashCode();
    }
}




