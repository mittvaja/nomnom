package mittvaja.com.nomnom.Holders;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import mittvaja.com.nomnom.Models.TiffinPlaces;

public class TiffinPlacesHolder {

    @SerializedName("data")
    private List<TiffinPlaces> mTiffinPlaces;

    public List<TiffinPlaces> getmTiffinPlaces() {
        return mTiffinPlaces;
    }

    public void setmTiffinPlaces(List<TiffinPlaces> mTiffinPlaces) {
        this.mTiffinPlaces = mTiffinPlaces;
    }
}
