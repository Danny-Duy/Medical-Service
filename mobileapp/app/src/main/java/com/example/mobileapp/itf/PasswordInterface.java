package com.example.mobileapp.itf;

import java.util.List;

public interface PasswordInterface {

    void onSuccess();

    void onError(List<String> errors);

}
