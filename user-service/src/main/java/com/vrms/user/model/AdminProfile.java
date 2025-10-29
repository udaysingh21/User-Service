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
 * AdminProfile
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-28T12:27:29.350038+05:30[Asia/Kolkata]", comments = "Generator version: 7.16.0")
public class AdminProfile extends UserBase {

  private @Nullable String employeeId;

  @Valid
  private List<String> permissions = new ArrayList<>();

  private @Nullable String assignedRegion;

  public AdminProfile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdminProfile(String email, String password, RoleEnum role, String name) {
    super(email, password, role, name);
  }

  public AdminProfile employeeId(@Nullable String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

  /**
   * Get employeeId
   * @return employeeId
   */
  
  @Schema(name = "employeeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employeeId")
  public @Nullable String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(@Nullable String employeeId) {
    this.employeeId = employeeId;
  }

  public AdminProfile permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public AdminProfile addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   */
  
  @Schema(name = "permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public AdminProfile assignedRegion(@Nullable String assignedRegion) {
    this.assignedRegion = assignedRegion;
    return this;
  }

  /**
   * Get assignedRegion
   * @return assignedRegion
   */
  
  @Schema(name = "assignedRegion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignedRegion")
  public @Nullable String getAssignedRegion() {
    return assignedRegion;
  }

  public void setAssignedRegion(@Nullable String assignedRegion) {
    this.assignedRegion = assignedRegion;
  }


  public AdminProfile id(Integer id) {
    super.id(id);
    return this;
  }

  public AdminProfile email(String email) {
    super.email(email);
    return this;
  }

  public AdminProfile password(String password) {
    super.password(password);
    return this;
  }

  public AdminProfile role(RoleEnum role) {
    super.role(role);
    return this;
  }

  public AdminProfile name(String name) {
    super.name(name);
    return this;
  }

  public AdminProfile phone(String phone) {
    super.phone(phone);
    return this;
  }

  public AdminProfile address(String address) {
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
    AdminProfile adminProfile = (AdminProfile) o;
    return Objects.equals(this.employeeId, adminProfile.employeeId) &&
        Objects.equals(this.permissions, adminProfile.permissions) &&
        Objects.equals(this.assignedRegion, adminProfile.assignedRegion) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, permissions, assignedRegion, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    assignedRegion: ").append(toIndentedString(assignedRegion)).append("\n");
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

