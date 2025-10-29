package com.vrms.user.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vrms.user.model.UserBase;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VolunteerProfile
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-28T12:27:29.350038+05:30[Asia/Kolkata]", comments = "Generator version: 7.16.0")
public class VolunteerProfile extends UserBase {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate dob;

  private @Nullable String gender;

  @Valid
  private List<String> skills = new ArrayList<>();

  @Valid
  private List<String> interests = new ArrayList<>();

  private @Nullable String availability;

  @Valid
  private List<String> languages = new ArrayList<>();

  public VolunteerProfile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VolunteerProfile(String email, String password, RoleEnum role, String name) {
    super(email, password, role, name);
  }

  public VolunteerProfile dob(@Nullable LocalDate dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
   */
  @Valid 
  @Schema(name = "dob", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dob")
  public @Nullable LocalDate getDob() {
    return dob;
  }

  public void setDob(@Nullable LocalDate dob) {
    this.dob = dob;
  }

  public VolunteerProfile gender(@Nullable String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public @Nullable String getGender() {
    return gender;
  }

  public void setGender(@Nullable String gender) {
    this.gender = gender;
  }

  public VolunteerProfile skills(List<String> skills) {
    this.skills = skills;
    return this;
  }

  public VolunteerProfile addSkillsItem(String skillsItem) {
    if (this.skills == null) {
      this.skills = new ArrayList<>();
    }
    this.skills.add(skillsItem);
    return this;
  }

  /**
   * Get skills
   * @return skills
   */
  
  @Schema(name = "skills", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skills")
  public List<String> getSkills() {
    return skills;
  }

  public void setSkills(List<String> skills) {
    this.skills = skills;
  }

  public VolunteerProfile interests(List<String> interests) {
    this.interests = interests;
    return this;
  }

  public VolunteerProfile addInterestsItem(String interestsItem) {
    if (this.interests == null) {
      this.interests = new ArrayList<>();
    }
    this.interests.add(interestsItem);
    return this;
  }

  /**
   * Get interests
   * @return interests
   */
  
  @Schema(name = "interests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("interests")
  public List<String> getInterests() {
    return interests;
  }

  public void setInterests(List<String> interests) {
    this.interests = interests;
  }

  public VolunteerProfile availability(@Nullable String availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
   */
  
  @Schema(name = "availability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availability")
  public @Nullable String getAvailability() {
    return availability;
  }

  public void setAvailability(@Nullable String availability) {
    this.availability = availability;
  }

  public VolunteerProfile languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public VolunteerProfile addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<>();
    }
    this.languages.add(languagesItem);
    return this;
  }

  /**
   * Get languages
   * @return languages
   */
  
  @Schema(name = "languages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("languages")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }


  public VolunteerProfile id(Integer id) {
    super.id(id);
    return this;
  }

  public VolunteerProfile email(String email) {
    super.email(email);
    return this;
  }

  public VolunteerProfile password(String password) {
    super.password(password);
    return this;
  }

  public VolunteerProfile role(RoleEnum role) {
    super.role(role);
    return this;
  }

  public VolunteerProfile name(String name) {
    super.name(name);
    return this;
  }

  public VolunteerProfile phone(String phone) {
    super.phone(phone);
    return this;
  }

  public VolunteerProfile address(String address) {
    super.address(address);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolunteerProfile volunteerProfile = (VolunteerProfile) o;
    return Objects.equals(this.dob, volunteerProfile.dob) &&
        Objects.equals(this.gender, volunteerProfile.gender) &&
        Objects.equals(this.skills, volunteerProfile.skills) &&
        Objects.equals(this.interests, volunteerProfile.interests) &&
        Objects.equals(this.availability, volunteerProfile.availability) &&
        Objects.equals(this.languages, volunteerProfile.languages) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dob, gender, skills, interests, availability, languages, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolunteerProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    interests: ").append(toIndentedString(interests)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

