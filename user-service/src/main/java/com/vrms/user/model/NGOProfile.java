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
 * NGOProfile
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-28T12:27:29.350038+05:30[Asia/Kolkata]", comments = "Generator version: 7.16.0")
public class NGOProfile extends UserBase {

  private @Nullable String registrationNumber;

  private @Nullable Integer foundedYear;

  private @Nullable String sector;

  private @Nullable String websiteUrl;

  private @Nullable String missionStatement;

  /**
   * Gets or Sets verificationStatus
   */
  public enum VerificationStatusEnum {
    PENDING("PENDING"),
    
    VERIFIED("VERIFIED"),
    
    REJECTED("REJECTED");

    private final String value;

    VerificationStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VerificationStatusEnum fromValue(String value) {
      for (VerificationStatusEnum b : VerificationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable VerificationStatusEnum verificationStatus;

  public NGOProfile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NGOProfile(String email, String password, RoleEnum role, String name) {
    super(email, password, role, name);
  }

  public NGOProfile registrationNumber(@Nullable String registrationNumber) {
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

  public NGOProfile foundedYear(@Nullable Integer foundedYear) {
    this.foundedYear = foundedYear;
    return this;
  }

  /**
   * Get foundedYear
   * @return foundedYear
   */
  
  @Schema(name = "foundedYear", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("foundedYear")
  public @Nullable Integer getFoundedYear() {
    return foundedYear;
  }

  public void setFoundedYear(@Nullable Integer foundedYear) {
    this.foundedYear = foundedYear;
  }

  public NGOProfile sector(@Nullable String sector) {
    this.sector = sector;
    return this;
  }

  /**
   * Get sector
   * @return sector
   */
  
  @Schema(name = "sector", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sector")
  public @Nullable String getSector() {
    return sector;
  }

  public void setSector(@Nullable String sector) {
    this.sector = sector;
  }

  public NGOProfile websiteUrl(@Nullable String websiteUrl) {
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

  public NGOProfile missionStatement(@Nullable String missionStatement) {
    this.missionStatement = missionStatement;
    return this;
  }

  /**
   * Get missionStatement
   * @return missionStatement
   */
  
  @Schema(name = "missionStatement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("missionStatement")
  public @Nullable String getMissionStatement() {
    return missionStatement;
  }

  public void setMissionStatement(@Nullable String missionStatement) {
    this.missionStatement = missionStatement;
  }

  public NGOProfile verificationStatus(@Nullable VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

  /**
   * Get verificationStatus
   * @return verificationStatus
   */
  
  @Schema(name = "verificationStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verificationStatus")
  public @Nullable VerificationStatusEnum getVerificationStatus() {
    return verificationStatus;
  }

  public void setVerificationStatus(@Nullable VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  public NGOProfile id(Integer id) {
    super.id(id);
    return this;
  }

  public NGOProfile email(String email) {
    super.email(email);
    return this;
  }

  public NGOProfile password(String password) {
    super.password(password);
    return this;
  }

  public NGOProfile role(RoleEnum role) {
    super.role(role);
    return this;
  }

  public NGOProfile name(String name) {
    super.name(name);
    return this;
  }

  public NGOProfile phone(String phone) {
    super.phone(phone);
    return this;
  }

  public NGOProfile address(String address) {
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
    NGOProfile ngOProfile = (NGOProfile) o;
    return Objects.equals(this.registrationNumber, ngOProfile.registrationNumber) &&
        Objects.equals(this.foundedYear, ngOProfile.foundedYear) &&
        Objects.equals(this.sector, ngOProfile.sector) &&
        Objects.equals(this.websiteUrl, ngOProfile.websiteUrl) &&
        Objects.equals(this.missionStatement, ngOProfile.missionStatement) &&
        Objects.equals(this.verificationStatus, ngOProfile.verificationStatus) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationNumber, foundedYear, sector, websiteUrl, missionStatement, verificationStatus, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NGOProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    foundedYear: ").append(toIndentedString(foundedYear)).append("\n");
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    missionStatement: ").append(toIndentedString(missionStatement)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
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

