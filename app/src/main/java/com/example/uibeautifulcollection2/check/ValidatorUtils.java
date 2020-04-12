package com.example.uibeautifulcollection2.check;
///THIS SHOULD BE DELETED 
import android.widget.EditText;
public abstract class ValidatorUtils {
    public static  boolean isInputEmpty(EditText... editTexts){
        boolean result = false;
        for (EditText editText: editTexts){
            if (editText.getText().toString().isEmpty()) {
                result = true;
                editText.setError("Input is empty");
            }
        }
        return result;
    }
}
