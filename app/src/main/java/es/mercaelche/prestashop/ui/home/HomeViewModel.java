package es.mercaelche.prestashop.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import es.mercaelche.prestashop.db.retrofit.standard.products;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Inciar Sesión");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public MutableLiveData<products> getProducts() {


        return null;
    }
}