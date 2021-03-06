package mittvaja.com.nomnom.Holders;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import mittvaja.com.nomnom.Models.Review;

/**
 * Created by Nachiket on 27-Mar-18.
 */

public class ReviewResponse {

    @SerializedName("data")
    private List<Review> mReviewData;

    public List<Review> getmReviewData() {
        return mReviewData;
    }

    public void setmReviewData(List<Review> mReviewData) {
        this.mReviewData = mReviewData;
    }
}
