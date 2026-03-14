package pl.ANSpark.matchupbackend.dto.response;


import lombok.Data;
import pl.ANSpark.matchupbackend.model.GenderEnum;
import pl.ANSpark.matchupbackend.model.Photo;
import pl.ANSpark.matchupbackend.model.PreferenceEnum;

import java.time.LocalDate;
import java.util.List;

@Data
public class ProfileResponse {

    private Long id;
    private String displayName;
    private LocalDate birthDate;
    private GenderEnum gender;
    private PreferenceEnum preference;
    private String bio;
    private String city;
    private String avatarUrl;
    private List<Photo> photos;
    private int age;

    public ProfileResponse(Long id,String displayName,LocalDate birthDate,GenderEnum gender,PreferenceEnum preference,String bio,String city,String avatarUrl,List<Photo> photos,int age) {
        this.id = id;
        this.displayName = displayName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.preference = preference;
        this.bio = bio;
        this.city = city;
        this.avatarUrl = avatarUrl;
        this.photos = photos;
        this.age = age;


    }


}
