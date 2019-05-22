package demo.app.com.volleyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    //    EditText editTextUsername, editTextEmail, editTextPassword, editTextConfirmPw;
//    Button buttonSave, buttonShow;
//    String url = "http://172.20.10.3:8000/api/register";
////    String url_show ="http://172.20.10.3:8000/api/user";
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        editTextUsername = findViewById(R.id.txt_username);
//        editTextEmail = findViewById(R.id.txt_email);
//        editTextPassword = findViewById(R.id.txt_password);
//        editTextConfirmPw = findViewById(R.id.txt_confirm_pw);
//
//        buttonSave = findViewById(R.id.btn_save);
//        buttonShow = findViewById(R.id.btn_show);
//
//
//
//        buttonSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String username = editTextUsername.getText().toString();
//                String email = editTextEmail.getText().toString();
//                String password = editTextPassword.getText().toString();
//                String confirm_pw = editTextConfirmPw.getText().toString();
//
//                HashMap data = new HashMap();
//                data.put("username", username);
//                data.put("email", email);
//                data.put("password", password);
//                data.put("c_password", confirm_pw);
//
//                postData(url,data);
//            }
//        });
//
//        buttonShow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getData(url_show);
//            }
//        });
//    }
//
//
//    private void postData(String url, HashMap data){
//
//        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
//        JsonObjectRequest request =  new JsonObjectRequest(Request.Method.POST,url, new JSONObject(data), new Response.Listener<JSONObject>() {
//            @Override
//            public void onResponse(JSONObject response) {
//                Log.e("Save_data", response.toString());
//            }
//        },
//        new Response.ErrorListener(){
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.e("Error_Volley", error.toString());
//            }
//        });
//
//        requestQueue.add(request);
//    }
//
//    private void getData(String url){
//        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
//        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                Log.e("All_DATA::", response.toString());
//            }
//        },
//
//        new Response.ErrorListener(){
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.e("ERROR", error.toString());
//            }
//        });
//    }
//}
    }
}
