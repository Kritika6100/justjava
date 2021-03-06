package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;


        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

        import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    int quantity=0;
    public void increment(View v) {

        quantity=quantity+1;
        display(quantity);



    }
    public void decrement(View v) {

        quantity=quantity-1;


        display(quantity);}
    public void SubmitOrder(View v) {
int price=quantity*5;

       

        String priceMessage="Total = $ "+ price ;
        priceMessage=priceMessage + "\nThankyou" ;
        displayMessage(priceMessage);}

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

        private void displayMessage (String message){
            TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
            priceTextView.setText(message);
        }


    /**
     * This method displays the given text on the screen.
     */

}