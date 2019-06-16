package com.example.keshavagarwal.staging_mandir;

import java.util.List;
import retrofit2.Call;

public interface ApiInterface {


    Call<List<DataResponse>>getImages();

}
