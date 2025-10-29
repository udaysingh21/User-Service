package com.vrms.user.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * LoginResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-28T12:27:29.350038+05:30[Asia/Kolkata]", comments = "Generator version: 7.16.0")
public class LoginResponse {

  private @Nullable String accessToken;

  private @Nullable Integer expiresIn;

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    VOLUNTEER("VOLUNTEER"),
    
    NGO("NGO"),
    
    CORPORATE("CORPORATE"),
    
    ADMIN("ADMIN");

    private final String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable RoleEnum role;

  public LoginResponse accessToken(@Nullable String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Get accessToken
   * @return accessToken
   */
  
  @Schema(name = "accessToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accessToken")
  public @Nullable String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(@Nullable String accessToken) {
    this.accessToken = accessToken;
  }

  public LoginResponse expiresIn(@Nullable Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * Get expiresIn
   * @return expiresIn
   */
  
  @Schema(name = "expiresIn", example = "3600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiresIn")
  public @Nullable Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(@Nullable Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public LoginResponse role(@Nullable RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   */
  
  @Schema(name = "role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public @Nullable RoleEnum getRole() {
    return role;
  }

  public void setRole(@Nullable RoleEnum role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginResponse loginResponse = (LoginResponse) o;
    return Objects.equals(this.accessToken, loginResponse.accessToken) &&
        Objects.equals(this.expiresIn, loginResponse.expiresIn) &&
        Objects.equals(this.role, loginResponse.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginResponse {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

