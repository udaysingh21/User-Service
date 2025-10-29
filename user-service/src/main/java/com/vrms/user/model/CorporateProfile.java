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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * CorporateProfile
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-28T12:27:29.350038+05:30[Asia/Kolkata]", comments = "Generator version: 7.16.0")
public class CorporateProfile extends UserBase {

  private @Nullable String registrationNumber;

  private @Nullable String industry;

  @Valid
  private List<String> csrFocusAreas = new ArrayList<>();

  private @Nullable Double budgetAllocated;

  private @Nullable String websiteUrl;

  public CorporateProfile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CorporateProfile(String email, String password, RoleEnum role, String name) {
    super(email, password, role, name);
  }

  public CorporateProfile registrationNumber(@Nullable String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

  /**
   * Get registrationNumber
   * @return registrationNumber
   */
  
  @Schema(name = "registrationNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrationNumber")
  public @Nullable String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(@Nullable String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public CorporateProfile industry(@Nullable String industry) {
    this.industry = industry;
    return this;
  }

  /**
   * Get industry
   * @return industry
   */
  
  @Schema(name = "industry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("industry")
  public @Nullable String getIndustry() {
    return industry;
  }

  public void setIndustry(@Nullable String industry) {
    this.industry = industry;
  }

  public CorporateProfile csrFocusAreas(List<String> csrFocusAreas) {
    this.csrFocusAreas = csrFocusAreas;
    return this;
  }

  public CorporateProfile addCsrFocusAreasItem(String csrFocusAreasItem) {
    if (this.csrFocusAreas == null) {
      this.csrFocusAreas = new ArrayList<>();
    }
    this.csrFocusAreas.add(csrFocusAreasItem);
    return this;
  }

  /**
   * Get csrFocusAreas
   * @return csrFocusAreas
   */
  
  @Schema(name = "csrFocusAreas", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("csrFocusAreas")
  public List<String> getCsrFocusAreas() {
    return csrFocusAreas;
  }

  public void setCsrFocusAreas(List<String> csrFocusAreas) {
    this.csrFocusAreas = csrFocusAreas;
  }

  public CorporateProfile budgetAllocated(@Nullable Double budgetAllocated) {
    this.budgetAllocated = budgetAllocated;
    return this;
  }

  /**
   * Get budgetAllocated
   * @return budgetAllocated
   */
  
  @Schema(name = "budgetAllocated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budgetAllocated")
  public @Nullable Double getBudgetAllocated() {
    return budgetAllocated;
  }

  public void setBudgetAllocated(@Nullable Double budgetAllocated) {
    this.budgetAllocated = budgetAllocated;
  }

  public CorporateProfile websiteUrl(@Nullable String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

  /**
   * Get websiteUrl
   * @return websiteUrl
   */
  
  @Schema(name = "websiteUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("websiteUrl")
  public @Nullable String getWebsiteUrl() {
    return websiteUrl;
  }

  public void setWebsiteUrl(@Nullable String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }


  public CorporateProfile id(Integer id) {
    super.id(id);
    return this;
  }

  public CorporateProfile email(String email) {
    super.email(email);
    return this;
  }

  public CorporateProfile password(String password) {
    super.password(password);
    return this;
  }

  public CorporateProfile role(RoleEnum role) {
    super.role(role);
    return this;
  }

  public CorporateProfile name(String name) {
    super.name(name);
    return this;
  }

  public CorporateProfile phone(String phone) {
    super.phone(phone);
    return this;
  }

  public CorporateProfile address(String address) {
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
    CorporateProfile corporateProfile = (CorporateProfile) o;
    return Objects.equals(this.registrationNumber, corporateProfile.registrationNumber) &&
        Objects.equals(this.industry, corporateProfile.industry) &&
        Objects.equals(this.csrFocusAreas, corporateProfile.csrFocusAreas) &&
        Objects.equals(this.budgetAllocated, corporateProfile.budgetAllocated) &&
        Objects.equals(this.websiteUrl, corporateProfile.websiteUrl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationNumber, industry, csrFocusAreas, budgetAllocated, websiteUrl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporateProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    csrFocusAreas: ").append(toIndentedString(csrFocusAreas)).append("\n");
    sb.append("    budgetAllocated: ").append(toIndentedString(budgetAllocated)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
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

